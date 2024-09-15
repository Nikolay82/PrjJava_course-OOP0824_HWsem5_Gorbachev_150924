package controller;

import model.*;
import service.DataService;
import service.StudyGroupService;
import view.StudentView;
import view.TeacherView;

import java.util.List;

public class Controller {

    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();

    private final StudyGroupService studyGroupService = new StudyGroupService();

    public void createStudent(String firstName, String lastName, String middleName) {
        dataService.create(firstName, lastName, middleName, Type.STUDENT);
    }

    public void createTeacher(String firstName, String lastName, String middleName) {
        dataService.create(firstName, lastName, middleName, Type.TEACHER);
    }

    public Teacher getTeacherById(int id) {
        return dataService.getTeacherById (id);
    }

    public Student getStudentById(int id) {
        return dataService.getStudentById(id);
    }

    public void getAllStudent() {
        List<User> studentList = dataService.getAllStudent();
        for (User student : studentList) {
            studentView.printOnConsole((Student) student);
        }
    }

    public void getAllTeacher() {
        List<User> teacherList = dataService.getAllTeacher();
        for (User teacher : teacherList) {
            teacherView.printOnConsole((Teacher) teacher);
        }
    }


    public void getAllStudyGroup() {
        List<StudyGroup> studyGroupList = studyGroupService.getAllStudyGroup();
        for (StudyGroup studyGroup : studyGroupList) {
            teacherView.printOnConsole(studyGroup.getTeacher());
            for (Student student : studyGroup.getStudentList()) {
                studentView.printOnConsole(student);
            }
            System.out.println();
        }
    }

    public void getStudyGroup(StudyGroup studyGroup) {
        teacherView.printOnConsole(studyGroup.getTeacher());
        for (Student student : studyGroup.getStudentList()) {
            studentView.printOnConsole(student);
        }
    }

    public void createStudyGroup(Teacher teacher, List<Student> studentList) {
        studyGroupService.createStudyGroup(teacher, studentList);
    }

}
