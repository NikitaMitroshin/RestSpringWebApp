package com.work.task.controller;

import com.work.task.model.UserLogin;
import com.work.task.service.LoginService;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class UserController {

    private LoginService service;

    @InitBinder
    protected void DataFormat(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showAddUserPage(ModelMap modelMap) {
        modelMap.addAttribute("user", new UserLogin());
        return "main";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String addUser(ModelMap modelMap, @Valid UserLogin userLogin, BindingResult result) {

        if (result.hasErrors()) {
            return "register";
        }

        service.addUserLogin(getUsernameInLogged(),userLogin.getFirstName(), userLogin.getLastName(), userLogin.getEmail(),
                userLogin.getUsername(), userLogin.getPassword());

        modelMap.clear();
        return "redirect:/main";
    }

    private String getUsernameInLogged() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            return ((UserDetails)principal).getUsername();
        }

        return principal.toString();
    }
}

