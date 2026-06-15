package org.askiesolutions.aboutmeui.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about-me")
public class AboutMeView {

    @GetMapping
    public String aboutMePage(Model model) {
        model.addAttribute("title", "About Me");
        model.addAttribute("view", "pages/about");
        return "layout/base";
    }
}
