package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    List<User> listUsers();

    void deleteUser(Integer id);

    void updateUser(User user);

    User getUserById(Integer id);

}
