package model.entity;

public class Vehicle {
    private Integer idVehicle;
    private KindVehicle idKindVehicle;
    private String nameVehicle;

    public Vehicle(){

    }

    public Vehicle(Integer idVehicle, KindVehicle idKindVehicle, String nameVehicle) {
        this.idVehicle = idVehicle;
        this.idKindVehicle = idKindVehicle;
        this.nameVehicle = nameVehicle;
    }

    public Integer getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(Integer idVehicle) {
        this.idVehicle = idVehicle;
    }

    public KindVehicle getIdKindVehicle() {
        return idKindVehicle;
    }

    public void setIdKindVehicle(KindVehicle idKindVehicle) {
        this.idKindVehicle = idKindVehicle;
    }

    public String getNameVehicle() {
        return nameVehicle;
    }

    public void setNameVehicle(String nameVehicle) {
        this.nameVehicle = nameVehicle;
    }
}
