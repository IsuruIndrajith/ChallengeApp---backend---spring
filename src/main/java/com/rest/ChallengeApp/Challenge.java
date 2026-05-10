package com.rest.ChallengeApp;

public class Challenge{
    private Integer id;
    private String month;
    private String description;

//    Contructor
    public Challenge(Integer id, String month, String description) {
        this.id = id;
        this.month = month;
        this.description = description;
    }

//    Getter
    public Integer getId() {
        return id;
    }

    public String getMonth() {
        return month;
    }

    public String getDescription() {
        return description;
    }

//    Setter

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}