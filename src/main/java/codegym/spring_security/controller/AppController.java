package codegym.spring_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class AppController {
    @GetMapping("/home")
    public ModelAndView index(){
        return new ModelAndView("/home");
    }
    @GetMapping("/create")
    public ModelAndView create(){
        return new ModelAndView("/create");
    }
    @GetMapping("/search")
    public ModelAndView search(){
        return new ModelAndView("/search");
    }


}
