package ca.ualberta.cs.lonelytwitter.model;

import java.util.Date;

/** Mood Class
 *  Abstract class for the mood type
 *  @author vonderoh
 */
public abstract class Mood {
    private Date date;

    /** Formats the Mood mood as a String
     * @return the string representation of the mood
     */
    public abstract String format();

    /** A Constructor for the Mood class
     */
    public Mood(){
        this.date = new Date();
    }

    /** A Constructor for the Mood class
     * @param date the date of the mood
     */
    public Mood(Date date){
        this.date = date;
    }

    /** Gets and return the mood's date
     * @return The date of the tweet
     */
    public Date getDate() {
        return date;
    }

    /** Sets the mood's date
     * @param date The date to be used for the tweet
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
