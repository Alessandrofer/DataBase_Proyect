package model.entity;

public class Teacher {
    private Integer idTeacher;
    private Vehicle vehicle;
    private String nameTeacher;
    private String lastNameTeacher;
    private Integer phoneTeacher;
    private Integer accountNumberTeacher;

    public Teacher(){

    }


    public Teacher(Vehicle idVehicle, String nameTeacher, String lastNameTeacher, int phoneTeacher, int accountNumberTeacher) {
        this.vehicle = idVehicle;
        this.nameTeacher = nameTeacher;
        this.lastNameTeacher = lastNameTeacher;
        this.phoneTeacher = phoneTeacher;
        this.accountNumberTeacher = accountNumberTeacher;
    }


    public Integer getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Integer idTeacher) {
        this.idTeacher = idTeacher;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getLastNameTeacher() {
        return lastNameTeacher;
    }

    public void setLastNameTeacher(String lastNameTeacher) {
        this.lastNameTeacher = lastNameTeacher;
    }

    public Integer getPhoneTeacher() {
        return phoneTeacher;
    }

    public void setPhoneTeacher(Integer phoneTeacher) {
        this.phoneTeacher = phoneTeacher;
    }

    public Integer getAccountNumberTeacher() {
        return accountNumberTeacher;
    }

    public void setAccountNumberTeacher(Integer accountNumberTeacher) {
        this.accountNumberTeacher = accountNumberTeacher;
    }

    @Override
    public String toString(){
        return idTeacher + " - " + nameTeacher + " - " + lastNameTeacher + " - " + phoneTeacher;
    }
}
