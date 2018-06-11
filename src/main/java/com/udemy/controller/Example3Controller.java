package com.udemy.controller;

import com.udemy.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/example3")
public class Example3Controller {

    private static final String FORM_VIEW = "form";
    private static final String RESULT_VIEW = "result";

    //#1
    /*
    @GetMapping("/")
    public String redirect(){
        return "redirect:/example3/showForm";
    }*/

    @GetMapping("/")
    public RedirectView redirect(){
        return new RedirectView("/example3/showForm");
    }

    @GetMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("person", new Person());
        int i = 4 / 0;
        return FORM_VIEW;
    }

    @PostMapping("/addperson")
    public ModelAndView addPerson(@ModelAttribute("person") Person person){
        ModelAndView mav = new ModelAndView(RESULT_VIEW);
        mav.addObject("person", person);
        return mav;
    }

}
