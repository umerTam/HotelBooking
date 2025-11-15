package org.github.dao;

import org.github.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> findAllUsers() {
        Query query = entityManager.createQuery("SELECT u FROM User u ORDER BY u.id ASC");
        List<User> users = query.getResultList();

        return users;
    }

    public User findUserByEmail(String email) {
        Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.email = :email");
        query.setParameter("email", email);
        List<User> users = query.getResultList();
        return users.getFirst();

    }

    public Boolean isEmailTaken(String email) {
        Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.email = :email");
        query.setParameter("email", email);
        List<User> users = query.getResultList();
        if(!users.isEmpty()) {
            return true;
        }
        return false;
    }

    public void saveUser(User user) {
        entityManager.persist(user);
    }

    public void updateUserFullName(int id, String fullName) {
        Query query = entityManager.createQuery("UPDATE User u SET u.fullName = :fullName WHERE u.id = :id");
        query.setParameter("fullName", fullName);
        query.setParameter("id", id);
        query.executeUpdate();
    }

    public void updateUserEmail(int id, String email) {
        Query query = entityManager.createQuery("UPDATE User u SET u.email = :email WHERE u.id = :id");
        query.setParameter("email", email);
        query.setParameter("id", id);
        query.executeUpdate();
    }

    public void updateUserPhoneNumber(int id, String phoneNumber) {
        Query query = entityManager.createQuery("UPDATE User u SET u.phoneNumber = :phoneNumber WHERE u.id = :id");
        query.setParameter("phoneNumber", phoneNumber);
        query.setParameter("id", id);
        query.executeUpdate();
    }

    public void updateUserPassword(int id, String password) {
        Query query = entityManager.createQuery("UPDATE User u SET u.password = :password WHERE u.id = :id");
        query.setParameter("password", password);
        query.setParameter("id", id);
        query.executeUpdate();
    }

    public void deleteUser(int id) {
        Query query = entityManager.createQuery("DELETE FROM User u WHERE u.id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}
