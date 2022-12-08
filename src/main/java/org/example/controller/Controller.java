package org.example.data.controller;

import org.example.data.Student;
import org.example.data.User;
import org.example.service.UserService;
import org.example.view.StudentView;

import java.util.List;

public class Controller {
     private final UserService userService = new UserService();
     private final StudentView studentView = new StudentView();

     public void createUser(String firstName, String lastName, String patronymic){
          userService.createUser(firstName, lastName, patronymic);
          List<User> students = userService.getAll();

          studentView.sendOnConsole(students);

     }

}
