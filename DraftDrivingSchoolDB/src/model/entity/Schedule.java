package model.entity;

import java.sql.Time;

public class Schedule {
    private Integer idSchedule;
    private Time scheduleSchedule;

    public Schedule(){

    }

    public Schedule(Integer idSchedule, Time scheduleSchedule) {
        this.idSchedule = idSchedule;
        this.scheduleSchedule = scheduleSchedule;
    }

    public Integer getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(Integer idSchedule) {
        this.idSchedule = idSchedule;
    }

    public Time getScheduleSchedule() {
        return scheduleSchedule;
    }

    public void setScheduleSchedule(Time scheduleSchedule) {
        this.scheduleSchedule = scheduleSchedule;
    }
}
