package ca.ualberta.cs.lonelytwitter.model;

import java.util.Date;

/** Tweet Class
 *  Contain the data for each Tweet
 *  @author vonderoh
 */
public class Tweet {

    private String message;
    private Date date;

    /** The Constructor for the Tweet class
     * @param message The message to be used for the tweet
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /** Gets and return the tweet's message
     * @return The message of the tweet
     */
    public String getMessage() {
        return message;
    }

    /** Sets the tweet's message
     * @param message The message to be used for the tweet
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /** Gets and return the tweet's date
     * @return The date of the tweet
     */
    public Date getDate() {
        return date;
    }

    /** Sets the tweet's date
     * @param date The date to be used for the tweet
     */
    public void setDate(Date date) {
        this.date = date;
    }


    /** Determines and returns a String the tweet's message
     * @return The string representation of the Tweet
     */
    @Override
    public String toString(){
        return date+" : "+message;
    }
}
