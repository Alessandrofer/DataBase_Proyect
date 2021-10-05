package console;

import model.entity.Course;
import model.entity.Teacher;
import model.repository.CourseRepository;
import model.repository.TeacherRepository;


import java.util.ArrayList;
import java.util.Scanner;

public class CourseConsole {
    private Scanner sc;
    private CourseRepository courseRepository;

    public CourseConsole() {
        sc = new Scanner(System.in);
        courseRepository = new CourseRepository();
    }

    public void showCourse() {
        ArrayList<Course> listaCourse = courseRepository.listarTodosCo();
        for (Course o : listaCourse) {
            System.out.println(o.toString());
        }
        System.out.println();
    }
}
