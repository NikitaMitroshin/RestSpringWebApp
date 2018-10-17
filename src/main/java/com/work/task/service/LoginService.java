package com.work.task.service;


import com.work.task.model.UserLogin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoginService {

    private static List<UserLogin> users = new ArrayList<>();
    private static int count = 0;

    /* добавление пользователя */
    public void addUserLogin(String firstName, String lastName, String status, String email, String username, String password) {
        users.add(new UserLogin(++count, firstName, lastName, status, email, username, password));
    }

    /* изменение пользователя */
    public void updateUserLogin(UserLogin userLogin) {
        users.remove(userLogin);
        users.add(userLogin);
    }

    /* удаление пользователя */
    public void deleteUserLogin(int user_id) {
        Iterator<UserLogin> iterator = users.iterator();
        while (iterator.hasNext()) {
            UserLogin userLogin = iterator.next();
            if (userLogin.getId() == user_id) {
                iterator.remove();
            }
        }
    }

    /* валидация пользователя */
    public boolean validateUser(UserLogin userLogin, String user, String pwd) {
        return user.equalsIgnoreCase(userLogin.getUsername()) && pwd.equalsIgnoreCase(userLogin.getPassword());
    }

    /* фильтрирование юзера */
    public List<UserLogin> retrieveUsers(String user) {
        List<UserLogin> filteredUser = new ArrayList<>();
        for (UserLogin userLogin : users) {
            if (userLogin.getUsername().equalsIgnoreCase(user)) {
                filteredUser.add(userLogin);
            }
        }
        return filteredUser;
    }

    /* поиск по идентификационному номеру */
    public UserLogin retrieveUser(int user_id) {
        for (UserLogin user :
                users)
        {
            if (user.getId() == user_id) {
                return user;
            }
        }
        return null;
    }
}
