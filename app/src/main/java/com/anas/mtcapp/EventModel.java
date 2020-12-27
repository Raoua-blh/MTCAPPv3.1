package com.anas.mtcapp;

public class EventModel {
    private String EventName , EventDescription ;
    private int EventImg , circle ;
    public EventModel(String Ename , String Edesc,int Eimg , int circle){
        this.EventName=Ename;
        this.EventDescription=Edesc;
        this.EventImg=Eimg;
        this.circle=circle;
    }
    public EventModel() {

    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public String getEventDescription() {
        return EventDescription;
    }

    public void setEventDescription(String eventDescription) {
        EventDescription = eventDescription;
    }

    public int getEventImg() {
        return EventImg;
    }

    public void setEventImg(int eventImg) {
        EventImg = eventImg;
    }

    public int getCircle() {
        return circle;
    }

    public void setCircle(int circle) {
        this.circle = circle;
    }


}


