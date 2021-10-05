package model.repository;

import model.entity.Schedule;
import model.entity.StudentEnrollementCourse;
import model.entity.StudentEnrollment;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ScheduleRepository extends Repository {
    public ArrayList<Schedule> listarSchedule(){
        ArrayList<Schedule> lista = new ArrayList<>();
        try {
            Statement sentencia = conn.createStatement();
            System.out.println("-- Schudele List");
            String s = "select id_course, sh.schedule_schedule, te.name_teacher, te.lastname_teacher, ve.name_vehicle, kv.name_kindvehicle\n" +
                    "from course as c, schedule as sh, teacher as te, vehicle as ve, kindvehicle as kv\n" +
                    "where c.id_course = sh.id_schedule and c.teacher_id_teacher = te.id_teacher \n" +
                    "and te.vehicle_id_vehicle = ve.id_vehicle and ve.kindvehicle_id_kindvehicle = kv.id_kindvehicle";
            ResultSet result = sentencia.executeQuery(s);
            while (result.next()) {
                System.out.print(result.getString(1)+"  -- ");
                System.out.print(result.getString(2)+"  -- ");
                System.out.print(result.getString(3)+"  -- ");
                System.out.print(result.getString(4)+"  -- ");
                System.out.print(result.getString(5)+"  -- ");
                System.out.println(result.getString(6));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
