package org.github.service;

import org.github.dao.UserDao;
import org.github.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional(readOnly = true)
    public List<User> findAllUsers() {
        List<User> users = userDao.findAllUsers();
        return users;
    }

    public User findUserByEmail(String email) {
        if(email != null && !email.isBlank()) {
            return userDao.findUserByEmail(email);
        }
        return null;
    }

    public Boolean isEmailTaken(String email) {
        if(email != null && !email.isBlank()) {
            return userDao.isEmailTaken(email);
        }
        return false;
    }

    public void createUser(User user) {
        if(user.getFullName().isEmpty() || user.getEmail().isEmpty() || user.getPassword().isEmpty()) {
            return;
        }
        userDao.saveUser(user);
    }

    public void changeUserFullName(int id, String fullName) {
        if(fullName != null && !fullName.isBlank()) {
            userDao.updateUserFullName(id, fullName);
        }
    }

    public void changeUserEmail(int id, String email) {
        if(email != null && !email.isBlank()) {
            userDao.updateUserEmail(id, email);
        }
    }

    public void changeUserPassword(int id, String password) {
        if(password != null && !password.isBlank()) {
            userDao.updateUserPassword(id, password);
        }
    }

    public void updateUserPhoneNumber(int id, String phoneNumber) {
        if(phoneNumber != null && !phoneNumber.isBlank()) {
            userDao.updateUserPhoneNumber(id, phoneNumber);
        }
    }

    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}
