package console;

import model.entity.Teacher;
import model.entity.Vehicle;
import model.repository.TeacherRepository;
import java.util.ArrayList;
import java.util.Scanner;

public class TeacherConsole {
    private Scanner sc;
    private TeacherRepository teacherRepository;

    public TeacherConsole() {
        sc = new Scanner(System.in);
        teacherRepository = new TeacherRepository();
    }

    public void showTeacher() {
        ArrayList<Teacher> listaTeacher = teacherRepository.listarTodosTe();
        for (Teacher u : listaTeacher) {
            System.out.println(u.toString());
        }
        System.out.println();
    }

    public void addTeacher () {
       //System.out.println("Type ID Vehicle: ");
        Vehicle idVehicle = new Vehicle();
        idVehicle.setIdVehicle(1);

        System.out.println("Teacher Name: ");
        String nameTeacher = sc.nextLine();

        System.out.println("Teacher Lastname: ");
        String lastNameTeacher = sc.nextLine();

        System.out.println("Teacher Phone: ");
        int phoneTeacher = sc.nextInt();

        System.out.println("Account Number Phone: ");
        int accountNumber = sc.nextInt();


        Teacher teacher = new Teacher(idVehicle,nameTeacher, lastNameTeacher, phoneTeacher, accountNumber);
        teacherRepository.add(teacher);

        showTeacher();
    }

    public void updateTeacher() {
        System.out.println("Update Teacher");

        System.out.println("Teacher Name:");
        String nombres = sc.nextLine();

        System.out.println("Teacher Lastname:");
        String apellidos = sc.nextLine();

        System.out.println("Teacher Phone:");
        int nroCelular = sc.nextInt();

        System.out.println("Teacher ID");
        int IdTeacher = sc.nextInt();

        Teacher teacher = teacherRepository.serchForId(IdTeacher);
        if (teacher != null) {
            teacher.setNameTeacher(nombres);
            teacher.setLastNameTeacher(apellidos);
            teacher.setPhoneTeacher(nroCelular);
            teacherRepository.updateTeacher(teacher);
        }
        showTeacher();
    }
    public void deleteTeacher() {
        System.out.println("Delete Teacher");
        System.out.println("Teacher ID: ");
        int idTeacher = sc.nextInt();
        if(teacherRepository.eliminarPorId(idTeacher)){
            System.out.println("Was removed successfully");
        }else{
            System.out.println("Failed to remove teacher");
        }
    }


}


