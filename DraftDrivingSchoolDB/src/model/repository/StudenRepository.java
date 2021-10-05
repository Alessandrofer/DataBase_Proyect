package model.repository;

import model.entity.StudentEnrollment;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudenRepository extends Repository {
    public boolean addStuden(StudentEnrollment studentEnrollment) {
        boolean res = false;
        try {
            String query = "insert into studentenrollment(name_studen,lastname_studen,phone_studen) values (?,?,?)";
            PreparedStatement sentencia = conn.prepareStatement(query);
            sentencia.setString(1, studentEnrollment.getNameStudent());
            sentencia.setString(2, studentEnrollment.getLastNameStudent());
            sentencia.setInt(3, studentEnrollment.getPhoneStudent());

            int result = sentencia.executeUpdate();
            System.out.println("filas afectadas insert " + result);
            res = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
    public ArrayList<StudentEnrollment> listarTodosSt() {
        ArrayList<StudentEnrollment> lista = new ArrayList<>();
        try {
            Statement sentencia = conn.createStatement();
            String query = "select * from studentenrollment;";
            ResultSet result = sentencia.executeQuery(query);
            System.out.println("-- Student List");
            while (result.next()) {
                StudentEnrollment studentEnrollment = new StudentEnrollment();
                studentEnrollment.setIdStudentEnrollment(result.getInt("id_studentenrollment"));
                studentEnrollment.setNameStudent(result.getString("name_studen"));
                studentEnrollment.setLastNameStudent(result.getString("lastname_studen"));
                studentEnrollment.setPhoneStudent(result.getInt("phone_studen"));

                lista.add(studentEnrollment);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

}
