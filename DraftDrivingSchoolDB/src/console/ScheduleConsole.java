package console;

import model.entity.Schedule;
import model.entity.StudentEnrollment;
import model.repository.ScheduleRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class ScheduleConsole {
    private Scanner sc;
    private ScheduleRepository scheduleRepository;

    public ScheduleConsole(){
        sc = new Scanner(System.in);
        scheduleRepository = new ScheduleRepository();
    }
    public void showSchedule() {
        ArrayList<Schedule> listaSchedule = scheduleRepository.listarSchedule();
        for (Schedule u : listaSchedule) {
            System.out.println(u.toString());
        }
        System.out.println();
    }
}
