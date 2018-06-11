package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example")
public class ExampleController {

    public static final String EXAMPLE_VIEW = "example";

    //Primera forma
    @GetMapping("/exampleString")
    //@RequestMapping(value="exampleString", method = RequestMethod.GET)
    public String exampleString(Model model){
        model.addAttribute("name", "Alejandro");
        return EXAMPLE_VIEW;
    }

    //Segunda forma
    @GetMapping("/exampleMAV")
    //@RequestMapping(value="exampleMAV", method = RequestMethod.GET)
    public ModelAndView exampleMAV(){
        ModelAndView modelAndView = new ModelAndView(EXAMPLE_VIEW);
        modelAndView.addObject("name", "Alberto");
        return modelAndView;
    }

}
