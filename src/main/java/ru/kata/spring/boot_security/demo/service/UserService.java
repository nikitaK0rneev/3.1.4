package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void createUser(User user);

    void deleteUserById(int id);

    void updateUser(User user);

    User find(int id);

//    @Transactional(readOnly = true)
//    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    User getUserByName(String username);
}
