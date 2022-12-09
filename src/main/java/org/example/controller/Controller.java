package org.example.controller;

import org.example.data.Student;
import org.example.data.*;
import org.example.service.UserService;
import org.example.service.StudyGroupService;
import org.example.view.StudentView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Controller {

     private final UserService userService = new UserService();

     private final StudentView studentView = new StudentView();

     private final StudyGroupService studyGroupService = new StudyGroupService();

     private List<Student> studentsList;

     public void createUser(String firstName, String lastName, String patronymic) {
          userService.createUser(firstName, lastName, patronymic);

     }

     public Teacher createTeacher(String firstName, String lastName, String patronymic, Long teacherId) {
          return userService.createUser(firstName, lastName, patronymic, teacherId);

     }

     public void showAllStudents() {
          List<User> students = userService.getAll();
          studentView.sendOnConsole(students);
     }

     public List<Student> getOnlyStudents() {
          return userService.getAllStudents();
     }

     public void showTeacherInfo(Teacher teacher) {
          List<User> teachers = new ArrayList<>();
          teachers.add(teacher);
          studentView.sendOnConsole(teachers);
     }

     public void showStudyGroups() {
          studentView.showStudyGroups(this.studyGroupService.getStudyGroupList());
     }

     public void showSortStudyGroup(List<Student> studentsList) {
          Collections.sort(studentsList, new StudyGroupComparator());
          studentView.showStudents(studentsList);
     }


     public void createTimetable(Teacher teacher, List<Student> studentList) {
          this.studyGroupService.completeStudyGroup(teacher, studentList);
     }


     public void showStudentsInGroups() {
          this.studentView.showStudentsInGroup(this.studyGroupService.getStudyGroupList());

     }

}