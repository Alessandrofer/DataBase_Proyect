package model.entity;

public class KindVehicle {
    private Integer idKindVehicle;
    private String nameindVehicle;

    public KindVehicle(){

    }

    public KindVehicle(Integer idKindVehicle, String nameindVehicle) {
        this.idKindVehicle = idKindVehicle;
        this.nameindVehicle = nameindVehicle;
    }

    public Integer getIdKindVehicle() {
        return idKindVehicle;
    }

    public void setIdKindVehicle(Integer idKindVehicle) {
        this.idKindVehicle = idKindVehicle;
    }

    public String getNameindVehicle() {
        return nameindVehicle;
    }

    public void setNameindVehicle(String nameindVehicle) {
        this.nameindVehicle = nameindVehicle;
    }
}
