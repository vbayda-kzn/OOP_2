package org.example.service;

import org.example.data.Student;
import org.example.data.StudyGroup;
import org.example.data.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroupService {

    private  final List<StudyGroup> studyGroupList;


    public StudyGroupService() {
        this.studyGroupList = new ArrayList<>();

    }

    public void completeStudyGroup(Teacher teacher, List<Student> studentsList) {
        this.studyGroupList.add(new StudyGroup(teacher, studentsList));
    };


    public List<StudyGroup> getStudyGroupList() {
        return studyGroupList;
    }
}