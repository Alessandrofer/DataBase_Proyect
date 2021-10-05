package model.entity;

public class Duration {
    private Integer idDuration;
    private String timeDuration;

    public Duration(){

    }

    public Duration(Integer idDuration, String timeDuration) {
        this.idDuration = idDuration;
        this.timeDuration = timeDuration;
    }

    public Integer getIdDuration() {
        return idDuration;
    }

    public void setIdDuration(Integer idDuration) {
        this.idDuration = idDuration;
    }

    public String getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(String timeDuration) {
        this.timeDuration = timeDuration;
    }
}
