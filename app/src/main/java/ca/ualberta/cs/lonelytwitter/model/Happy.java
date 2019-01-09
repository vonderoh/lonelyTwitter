package ca.ualberta.cs.lonelytwitter.model;

import java.util.Date;

public class Happy extends Mood {
    public String format() {
        return this.getDate() + " :)";
    }

    public Happy(){
        super();
    }

    public Happy(Date date){
        super(date);
    }
}
