package ca.ualberta.cs.lonelytwitter.model;

import java.util.Date;

public class Sad extends Mood {

    public String format() {
        return ":(";
    }

    public Sad() {
        super();
    }

    public Sad(Date date){
        super(date);
    }

}