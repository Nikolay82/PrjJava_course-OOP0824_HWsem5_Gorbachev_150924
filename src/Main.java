import controller.Controller;
import model.Student;
import model.Teacher;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.createTeacher("tFN1", "tLN1", "tMN1");
        controller.createTeacher("tFN2", "tLN2", "tMN2");
        controller.createTeacher("tFN3", "tLN3", "tMN3");

        controller.createStudent("sFN1", "sLN1", "sMN1");
        controller.createStudent("sFN2", "sLN2", "sMN2");
        controller.createStudent("sFN3", "sLN3", "sMN3");
        controller.createStudent("sFN4", "sLN4", "sMN4");
        controller.createStudent("sFN5", "sLN5", "sMN5");
        controller.createStudent("sFN6", "sLN6", "sMN6");


        Teacher teacher = controller.getTeacherById(1);
        List<Student> studentList = new ArrayList<>();
        studentList.add(controller.getStudentById(1));
        studentList.add(controller.getStudentById(2));
        studentList.add(controller.getStudentById(3));
        controller.createStudyGroup(teacher, studentList);

        teacher = controller.getTeacherById(2);
        studentList = new ArrayList<>();
        studentList.add(controller.getStudentById(3));
        studentList.add(controller.getStudentById(4));
        studentList.add(controller.getStudentById(5));
        studentList.add(controller.getStudentById(6));
        controller.createStudyGroup(teacher, studentList);


        System.out.println("Учителя:");
        controller.getAllTeacher();
        System.out.println();
        System.out.println("Студенты:");
        controller.getAllStudent();

        System.out.println();
        System.out.println("Группы:");
        controller.getAllStudyGroup();

    }
}
