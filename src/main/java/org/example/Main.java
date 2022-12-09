package org.example;

import org.example.controller.Controller;
import org.example.data.Student;
import org.example.data.StudyGroup;
import org.example.data.Teacher;
import org.example.data.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Controller controller = new Controller();
        controller.createTimetable(controller.createTeacher("Fedor", "Kutuzov", "Mikhilovich", 12L),
                new ArrayList<>(
                        Arrays.asList(
                                new Student("Xander", "Xandrov", "Xandrovich"),
                                new Student("Semen", "Ivanov", "Abramovich"),
                                new Student("Petr", "Petrov", "Petrovich"),
                                new Student("Oleg", "Olegov", "Olegovich")
                        )
                ));

        controller.createTimetable(controller.createTeacher("Vasily", "Chapaev", "Ivanovich", 13L)
                , new ArrayList<>(
                        Arrays.asList(
                                new Student("Anton", "Antonov", "Anton"),
                                new Student("Yury", "Yurevich", "Yrev"),
                                new Student("Jakov", "Jakovich", "Jakovlev"),
                                new Student("Marat", "Maratovich", "Maratov")
                        )
                ));

        controller.showStudentsInGroups();

    }
}
