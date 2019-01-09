package ca.ualberta.cs.lonelytwitter.model;

import java.util.Date;

public abstract class Mood {
    private Date date;

    public abstract String format();

    public Mood(){
        this.date = new Date();
    }

    public Mood(Date date){
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
