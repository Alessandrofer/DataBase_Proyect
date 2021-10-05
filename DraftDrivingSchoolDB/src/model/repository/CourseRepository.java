package model.repository;

import model.entity.Course;
import model.entity.Teacher;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CourseRepository extends Repository{
    public ArrayList<Course> listarTodosCo() {
        ArrayList<Course> lista = new ArrayList<>();
        try {
            Statement sentencia = conn.createStatement();
            String query = "select c.name_course\n" +
                    "from course as c\n" +
                    "where mod(c.id_course, 2) = 0 ;";
            ResultSet result = sentencia.executeQuery(query);

            while (result.next()) {
                Course course = new Course();
                course.setNameCourse(result.getString("name_course"));
                lista.add(course);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
