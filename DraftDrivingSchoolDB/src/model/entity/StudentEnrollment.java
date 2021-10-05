package model.entity;

public class StudentEnrollment {
    private Integer idStudentEnrollment;
    private String nameStudent;
    private String lastNameStudent;
    private Integer phoneStudent;

    public StudentEnrollment(){

    }

    public StudentEnrollment(Integer idStudentEnrollment, String nameStudent,
                             String lastNameStudent, Integer phoneStudent) {
        this.idStudentEnrollment = idStudentEnrollment;
        this.nameStudent = nameStudent;
        this.lastNameStudent = lastNameStudent;
        this.phoneStudent = phoneStudent;
    }

    public StudentEnrollment(String nameStudent, String lastNameStudent, int phoneStudent) {
        this.nameStudent = nameStudent;
        this.lastNameStudent = lastNameStudent;
        this.phoneStudent = phoneStudent;
    }

    public Integer getIdStudentEnrollment() {
        return idStudentEnrollment;
    }

    public void setIdStudentEnrollment(Integer idStudentEnrollment) {
        this.idStudentEnrollment = idStudentEnrollment;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getLastNameStudent() {
        return lastNameStudent;
    }

    public void setLastNameStudent(String lastNameStudent) {
        this.lastNameStudent = lastNameStudent;
    }

    public Integer getPhoneStudent() {
        return phoneStudent;
    }

    public void setPhoneStudent(Integer phoneStudent) {
        this.phoneStudent = phoneStudent;
    }

    @Override
    public String toString(){
        return idStudentEnrollment + " - " + nameStudent + " - " + lastNameStudent + " - " + phoneStudent;
    }
}
