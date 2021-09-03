package com.rsk.java;

import com.rsk.kotlin.Meeting;
import com.rsk.kotlin.MeetingException;

public class Program {
    public static void main(String[] args){
        Meeting board = new Meeting("Board Meeting");

        board.setLocation("London");

        System.out.println("The meeting is in " + board.getLocation());

        board.description = "A board meeting";

        int version = Meeting.APP_VERSION;

        Meeting.getAppVersion();

        try {
            board.addAttendee(null);
        } catch (MeetingException e) {
            e.printStackTrace();
        }
    }
}
