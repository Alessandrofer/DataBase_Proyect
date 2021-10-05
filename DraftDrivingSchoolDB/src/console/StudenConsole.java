package console;

import model.entity.StudentEnrollment;
import model.entity.Teacher;
import model.entity.Vehicle;
import model.repository.StudenRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class StudenConsole {
    private Scanner sc;
    private StudenRepository studenRepository;

    public StudenConsole(){
        sc = new Scanner(System.in);
        studenRepository = new StudenRepository();
    }
    public void showStuden() {
        ArrayList<StudentEnrollment> listaStudent = studenRepository.listarTodosSt();
        for (StudentEnrollment u : listaStudent) {
            System.out.println(u.toString());
        }
        System.out.println();
    }

    public void addStuden () {

        System.out.println("Student Name: ");
        String nameStudent = sc.nextLine();

        System.out.println("Student Lastname: ");
        String lastNameStudent = sc.nextLine();

        System.out.println("Student Phone: ");
        int phoneStudent = sc.nextInt();

        StudentEnrollment studentEnrollment = new StudentEnrollment(nameStudent, lastNameStudent, phoneStudent);
        studenRepository.addStuden(studentEnrollment);
        showStuden();
    }
}
