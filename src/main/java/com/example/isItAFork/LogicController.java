package com.example.isItAFork;

import com.example.isItAFork.model.Fork;
import com.example.isItAFork.model.UserInput;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LogicController {
    @GetMapping("/faq")
    public String faqPage() {
        return "faq";
    }

    @GetMapping("/findFork")
    public String forksPage(Model model) {
        return "forkFound";
    }

    @GetMapping()
    public String mainPage(Model model) {
        model.addAttribute("userInput", new UserInput());
        return "main";
    }

    @PostMapping("/tryFindFork")
    public String tryFindFork(@ModelAttribute UserInput userInput, Model model) {
        try {
            Double odd11 = userInput.getFirstSiteOdd1(),
                    odd12 = userInput.getFirstSiteOdd2(),
                    odd21 = userInput.getSecondSiteOdd1(),
                    odd22 = userInput.getSecondSiteOdd2();
            Fork fork = null;

            if (odd11 * odd22 > odd11 + odd22) {
                fork = new Fork(userInput.getFirstSiteName(), userInput.getSecondSiteName(), odd11, odd22, userInput.getFirstTeamName(), userInput.getSecondTeamName());
            }
            if (odd12 * odd21 > odd12 + odd21) {
                fork = new Fork(userInput.getFirstSiteName(), userInput.getSecondSiteName(), odd12, odd21, userInput.getSecondTeamName(), userInput.getFirstTeamName());
            }
            if (fork == null) {
                return "forkNotFound";
            }


            model.addAttribute("fork", fork);
            return "forkFound";
        } catch (Exception e) {
            return "forkNotFound";
        }
    }
}
