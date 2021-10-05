package model.repository;

import model.entity.StudentEnrollementCourse;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudenEnrollmentRepository extends Repository{
    public ArrayList<StudentEnrollementCourse> listarEnrollement(){
        ArrayList<StudentEnrollementCourse> lista = new ArrayList<>();
        try {
            Statement sentencia = conn.createStatement();
            System.out.println("-- Enrollment List");
            System.out.println("ID -- NAME STUDEN -- lASTNAME STUDEN - COURSE - NAME TEACHER - LASTNAME TEACHER");
            String s = "select st.studentenrollment_id_studentEnrollment, stu.name_studen, stu.lastname_studen, c.name_course,\n" +
                    "sh.schedule_schedule, te.name_teacher, te.lastname_teacher\n" +
                    "from studentenrollment_course as st, studentenrollment as stu, course as c, schedule as sh, teacher as te\n" +
                    "where st.studentenrollment_id_studentEnrollment = stu.id_studentenrollment and st.course_id_course = c.id_course\n" +
                    "and c.schedule_id_schedule = sh.id_schedule and c.teacher_id_teacher = te.id_teacher";
            ResultSet result = sentencia.executeQuery(s);
            while (result.next()) {
                System.out.print(result.getString(1)+"  -- ");
                System.out.print(result.getString(2)+"  -- ");
                System.out.print(result.getString(3)+"  -- ");
                System.out.print(result.getString(4)+"  -- ");
                System.out.print(result.getString(6)+"  -- ");
                System.out.println(result.getString(7));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

}
