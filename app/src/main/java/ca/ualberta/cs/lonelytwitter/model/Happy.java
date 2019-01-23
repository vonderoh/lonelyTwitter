package ca.ualberta.cs.lonelytwitter.model;

import java.util.Date;

/** Happy Class
 *  Contain the data for the happy mood
 * @author vonderoh
 */
public class Happy extends Mood {

    /** Formats the Happy mood as a String
     * @return the string representation of the mood
     */
    @Override
    public String format() {
        return ":)";
    }

    /** A Constructor for the Happy class
     */
    public Happy() {
        super();
    }

    /** A Constructor for the Happy class
     * @param date The date to be used for the mood class
     */
    public Happy(Date date){
        super(date);
    }

}
