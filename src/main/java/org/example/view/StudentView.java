package org.example.view;

import org.example.data.*;

import org.example.data.User;
import org.example.service.StudyGroupService;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class StudentView {

    public void sendOnConsole(List<User> users) {
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (User user : users) {
            log.info(user.toString());
        }
    }

    public void showStudyGroups(List<StudyGroup> studyGroups ){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (StudyGroup group : studyGroups) {
            log.info(group.toString());
        }
    }

    public void showStudents(List<Student> studyGroups ){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (Student group : studyGroups) {
            log.info(group.toString());
        }
    }

    public void showStudentsInGroup( List<StudyGroup> studyGroupList) {
        // Logger log = Logger.getLogger(StudentView.class.getName());
        Logger log = Logger.getAnonymousLogger();
        for (StudyGroup groups : studyGroupList) {
//            log.info("Id: " + groups.toString());
            System.out.println("Group №: " + groups.getIdStudentGroup());
            List<Student> studentsList = groups.getStudentsList();
            Collections.sort(studentsList, new StudyGroupComparator());
            for (Student student : studentsList) {
                System.out.print(student);
                System.out.println(" id = " + student.getStudentID());
            }
            ;
        }
    }
}