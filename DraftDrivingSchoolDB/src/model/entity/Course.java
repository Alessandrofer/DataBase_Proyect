package model.entity;

public class Course {
    private Integer idCourse;
    private String nameCourse;
    private Schedule schedule;
    private Duration duration;
    private Teacher teacher;
    private Price price;

    public Course(){

    }

    public Course(Integer idCourse, String nameCourse, Schedule idSchedule,
                  Duration idDuration, Teacher idTeacher, Price idPrice) {
        this.idCourse = idCourse;
        this.nameCourse = nameCourse;
        this.schedule = idSchedule;
        this.duration = idDuration;
        this.teacher = idTeacher;
        this.price = idPrice;
    }

    public Integer getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Integer idCourse) {
        this.idCourse = idCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return nameCourse;
    }
}
