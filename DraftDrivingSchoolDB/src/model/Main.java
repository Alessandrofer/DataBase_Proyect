package model;

import connection.ConnectionDB;
import console.*;
import model.entity.Teacher;
import model.repository.TeacherRepository;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        configPostgresDB();
        configMysqlDB();
        initMenu();
    }

    private static void initMenu(){
        Scanner sc = new Scanner(System.in);
        TeacherConsole teacherConsole = new TeacherConsole();

        System.out.println();
        System.out.println("--> Bip Bip - Driving School <--");
        System.out.println("1 -> Teachers");
        System.out.println("2 -> Inscripcion");
        System.out.println("3 -> Exit");

        int opcion = sc.nextInt();
        while (opcion != 3) {
            switch (opcion) {
                case 1:
                    teachersSubmenu();
                    break;
                case 2:
                    inscripcionSubmenu();
                    break;
                default:
                    System.out.println("Invalid Option!");
            }
            System.out.println();
            System.out.println("--> Bip Bip - Driving School <--");
            System.out.println("1 -> Teachers");
            System.out.println("2 -> Inscripcion");
            System.out.println("3 -> Exit");

            opcion = sc.nextInt();
        }

    }
    private static void teachersSubmenu(){
        Scanner sc = new Scanner(System.in);
        TeacherConsole teacherConsole = new TeacherConsole();

        System.out.println();
        System.out.println("--> Bip Bip - Driving School <--");
        System.out.println("1 -> Teachers List");
        System.out.println("2 -> Add Teacher");
        System.out.println("3 -> Update Teacher");
        System.out.println("4 -> Delete Teacher");
        System.out.println("5 -> Back");

        int opcion = sc.nextInt();
        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    teacherConsole.showTeacher();
                    break;
                case 2:
                    teacherConsole.addTeacher();
                    break;
                case 3:
                    teacherConsole.updateTeacher();
                    break;
                case 4:
                    teacherConsole.deleteTeacher();
                    break;
                default:
                    System.out.println("Invalid Option!");
            }
            opcion = sc.nextInt();
        }
    }

    private static void inscripcionSubmenu(){
        Scanner sc = new Scanner(System.in);
        CourseConsole courseConsole = new CourseConsole();
        StudenEnrollmentConsole studenEnrollmentConsole = new StudenEnrollmentConsole();
        StudenConsole studenConsole = new StudenConsole();
        ScheduleConsole scheduleConsole = new ScheduleConsole();

        System.out.println();
        System.out.println("--> Bip Bip - Driving School <--");
        System.out.println("1 -> Course List");
        System.out.println("2 -> Schedules Available");
        System.out.println("3 -> Enrollment List");
        System.out.println("4 -> Add Student");
        System.out.println("5 -> Enroll student");
        System.out.println("6 -> Back");

        int opcion = sc.nextInt();
        while (opcion != 6) {
            switch (opcion) {
                case 1:
                    courseConsole.showCourse();
                    break;
                case 2:
                    scheduleConsole.showSchedule();
                    break;
                case 3:
                    studenEnrollmentConsole.showEnrollment();
                    break;
                case 4:
                    studenConsole.addStuden();
                    break;
                case 5:

                    break;
                default:
                    System.out.println("Invalid Option!");
            }
            opcion = sc.nextInt();
        }
    }

    private static void configPostgresDB(){
        ConnectionDB.driver = "org.postgresql.Driver";
        ConnectionDB.url = "jdbc:postgresql://localhost:5432/";
        ConnectionDB.database = "drivingschool_db";
        ConnectionDB.user= "postgres";
        ConnectionDB.password= "72740335";
    }

    private static void configMysqlDB(){
        ConnectionDB.driver = "com.mysql.cj.jdbc.Driver";
        ConnectionDB.url = "jdbc:mysql://localhost:3306/";
        ConnectionDB.database = "drivingschool_db";
        ConnectionDB.user= "root";
        ConnectionDB.password= "72740335";
    }
}
