package cg.codegym.controller;

import cg.codegym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class FormController {
    @GetMapping()
    public ModelAndView showFormRegister() {
        ModelAndView mad = new ModelAndView("/user/index");
        mad.addObject("user", new User());
        return mad;
    }

    @PostMapping("/create")
    public String register(@Valid @ModelAttribute User user, BindingResult result){
        if (result.hasFieldErrors()){
            return "user/index";
        }else {
            return "user/result";
        }
    }
}
