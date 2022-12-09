package org.example.service;

import org.example.data.User;

import java.util.List;

public interface DataService {
    void createUser(String firstName,
                    String lastName,
                    String patronymic
    );
    List<User> getAll();
    void deleteUser(Long id);
}
