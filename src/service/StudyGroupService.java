package service;

import model.Student;
import model.StudyGroup;
import model.Teacher;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {

    private List<StudyGroup> studyGroupList = new ArrayList<>();
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> studentList) {
        StudyGroup studyGroup = new StudyGroup(teacher, studentList);
        studyGroupList.add(studyGroup);
        return studyGroup;
    }

    public List<StudyGroup> getAllStudyGroup() {
        return studyGroupList;
    }
}
