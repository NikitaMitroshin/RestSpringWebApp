package com.work.task.controller;


import com.work.task.model.UserLogin;
import com.work.task.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {

    private LoginService service;

    private UserLogin userLogin;

    /* список имеющихся пользователей */
    @RequestMapping(value = "/show/user/", method = RequestMethod.GET)
    public List<UserLogin> userLoginList() {
        List<UserLogin> users = service.retrieveUsers(userLogin.getUsername());
        return users;
    }

    /* отображение пользователей по ID */
    @RequestMapping(value = "/show/user/{id}", method = RequestMethod.GET)
    public UserLogin userLoginIDList(@PathVariable("id") int user_id) {
        return service.retrieveUser(user_id);
    }

    /* изменения статуса у пользователей */
    @RequestMapping(value = "/show/user/{id}/{status}", method = RequestMethod.GET)
    public UserLogin retrieveStatus(@PathVariable("id") int id, @PathVariable("status") String status_user) {
        UserLogin userLogins;
        userLogins = service.retrieveUser(id);
        if (userLogins != null) {
            String statis_iser = userLogins.getStatus();
            userLogins.setStatus(status_user);
            service.updateUserLogin(userLogins);
            return new UserLogin(id, statis_iser);
        }
        return new UserLogin("can't found id = " + id);
    }


}
