package model.repository;

import model.entity.Teacher;

import java.sql.*;
import java.util.ArrayList;

public class TeacherRepository extends Repository {
    public ArrayList<Teacher> listarTodosTe() {
        ArrayList<Teacher> lista = new ArrayList<>();
        try {
            Statement sentencia = conn.createStatement();
            String query = "SELECT t.id_teacher, t.name_teacher, t.lastname_teacher, t.phone_teacher FROM teacher as t";
            ResultSet result = sentencia.executeQuery(query);
            System.out.println("-- Teacher List");
            while (result.next()) {
                Teacher teacher = new Teacher();
                teacher.setIdTeacher(result.getInt("id_teacher"));
                teacher.setNameTeacher(result.getString("name_teacher"));
                teacher.setLastNameTeacher(result.getString("lastname_teacher"));
                teacher.setPhoneTeacher(result.getInt("phone_teacher"));

                lista.add(teacher);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    public boolean add(Teacher teacher) {
        boolean res = false;
        try {
            String query = "insert into teacher(vehicle_id_vehicle,name_teacher,lastname_teacher,phone_teacher, accountnumber_teacher) values (?,?,?,?,?)";
            PreparedStatement sentencia = conn.prepareStatement(query);
            sentencia.setObject(1, teacher.getVehicle().getIdVehicle());
            sentencia.setString(2, teacher.getNameTeacher());
            sentencia.setString(3, teacher.getLastNameTeacher());
            sentencia.setInt(4, teacher.getPhoneTeacher());
            sentencia.setInt(5, teacher.getAccountNumberTeacher());

            int result = sentencia.executeUpdate();
            System.out.println("filas afectadas insert " + result);
            res = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public boolean updateTeacher(Teacher teacher) {
        boolean res = false;
        try {
            String query = "update teacher " +
                    "set name_teacher= ?, lastname_teacher = ? , phone_teacher= ? " +
                    "where id_teacher = ?";
            PreparedStatement sentencia = conn.prepareStatement(query);
            sentencia.setString(1, teacher.getNameTeacher());
            sentencia.setString(2, teacher.getLastNameTeacher());
            sentencia.setInt(3, teacher.getPhoneTeacher());
            sentencia.setInt(4, teacher.getIdTeacher());

            int result = sentencia.executeUpdate();
            System.out.println("filas afectadas update " + result);
            res = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;

    }

    public Teacher serchForId(int idTeacher) {
        Teacher teacher = null;
        try {
            String query = "select t.id_teacher, t.name_teacher, t.lastname_teacher, phone_teacher\n" +
                    "from teacher as t where id_teacher = ?";
            PreparedStatement sentencia = conn.prepareStatement(query);
            sentencia.setInt(1, idTeacher);
            ResultSet result = sentencia.executeQuery();
            if (result.next()) {
                teacher = new Teacher();
                teacher.setIdTeacher(result.getInt("id_teacher"));
                teacher.setNameTeacher(result.getString("name_teacher"));
                teacher.setLastNameTeacher(result.getString("lastname_teacher"));
                teacher.setPhoneTeacher(result.getInt("phone_teacher"));

            }else {
                System.out.println("No hay resultados para id: " + idTeacher);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return teacher;
    }

    public boolean eliminarPorId(int idTeacher) {
        boolean res = false;
        try {
            String query =  "delete from teacher " +
                    "where id_teacher = ?";
            PreparedStatement sentencia = conn.prepareStatement(query);
            sentencia.setInt(1, idTeacher);
            int result = sentencia.executeUpdate();
            System.out.println("filas afectadas delete " + result);
            res = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }


}

