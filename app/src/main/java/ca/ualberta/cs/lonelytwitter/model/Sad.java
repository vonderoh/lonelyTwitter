package ca.ualberta.cs.lonelytwitter.model;

import java.util.Date;

/** Sad Class
 *  Contain the data for the sad mood
 * @author vonderoh
 */
public class Sad extends Mood {

    /** Formats the Sad mood as a String
     * @return the string representation of the mood
     */
    @Override
    public String format() {
        return ":(";
    }

    /** A Constructor for the Sad class
     */
    public Sad() {
        super();
    }

    /** A Constructor for the Sad class
     * @param date The date to be used for the mood class
     */
    public Sad(Date date){
        super(date);
    }

}
