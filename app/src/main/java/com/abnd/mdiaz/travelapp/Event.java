package com.abnd.mdiaz.travelapp;

public class Event {
    private String mEventDate;
    private String mEventDescription;
    private String mEventMonth;
    private int mEventType;

    public Event(String eventDate, String eventDescription, int eventType) {
        mEventDate = eventDate;
        mEventDescription = eventDescription;
        mEventType = eventType;
    }

    public Event(String eventMonth, int eventType) {
        mEventMonth = eventMonth;
        mEventType = eventType;
    }

    public String getEventDate() {
        return mEventDate;
    }

    public String getEventDescription() {
        return mEventDescription;
    }

    public int getEventType() {
        return mEventType;
    }

    public String getEventMonth() {
        return mEventMonth;
    }


}
