package com.example.Readwri;

public class TravelList
{
    private Integer userId;
    private String name;
    private String placeName;
    private String timeLine;
    private Integer priorityNumber;
    private String coPerson;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getTimeLine() {
        return timeLine;
    }

    public void setTimeLine(String timeLine) {
        this.timeLine = timeLine;
    }

    public Integer getPriorityNumber() {
        return priorityNumber;
    }

    public void setPriorityNumber(Integer priorityNumber) {
        this.priorityNumber = priorityNumber;
    }

    public String getCoPerson() {
        return coPerson;
    }

    public void setCoPerson(String coPerson) {
        this.coPerson = coPerson;
    }
}
