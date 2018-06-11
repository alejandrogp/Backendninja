package com.udemy.controller;

import com.udemy.model.Person;
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
        model.addAttribute("person", new Person("Alejandro",36));
        return EXAMPLE_VIEW;
    }

    //Segunda forma
    @GetMapping("/exampleMAV")
    //@RequestMapping(value="exampleMAV", method = RequestMethod.GET)
    public ModelAndView exampleMAV(){
        ModelAndView modelAndView = new ModelAndView(EXAMPLE_VIEW);
        modelAndView.addObject("person", new Person("Alberto",30));
        return modelAndView;
    }

}
