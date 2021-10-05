package console;

import model.entity.Course;
import model.entity.StudentEnrollementCourse;
import model.repository.StudenEnrollmentRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class StudenEnrollmentConsole {
    private Scanner sc;
    private StudenEnrollmentRepository studenEnrollmentRepository;

    public StudenEnrollmentConsole(){
        sc = new Scanner(System.in);
        studenEnrollmentRepository =  new StudenEnrollmentRepository();
    }
    public void showEnrollment() {
        ArrayList<StudentEnrollementCourse> listaEnrollment = studenEnrollmentRepository.listarEnrollement();
        for (StudentEnrollementCourse o : listaEnrollment) {
            System.out.println(o.toString());
        }
        System.out.println();
    }
}
