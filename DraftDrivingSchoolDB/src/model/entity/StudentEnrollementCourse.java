package model.entity;

public class StudentEnrollementCourse {
    private StudentEnrollment idStudentEnrollment;
    private Course idCourse;

    public StudentEnrollementCourse(){

    }

    public StudentEnrollementCourse(StudentEnrollment idStudentEnrollment, Course idCourse) {
        this.idStudentEnrollment = idStudentEnrollment;
        this.idCourse = idCourse;
    }

    public StudentEnrollment getIdStudentEnrollment() {
        return idStudentEnrollment;
    }

    public void setIdStudentEnrollment(StudentEnrollment idStudentEnrollment) {
        this.idStudentEnrollment = idStudentEnrollment;
    }

    public Course getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Course idCourse) {
        this.idCourse = idCourse;
    }
}
