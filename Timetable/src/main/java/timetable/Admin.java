package timetable;
 
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
@Entity
public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;
 
    // Persistent Fields:
    @Id @GeneratedValue
    Long id;
    private String course;
    private String date;
    private String time;
    private String duration;
    private String repeatFreq;
    private String lecturer;
    private String maxAtt;
    private String compulsory;
    private String venue;
    
    /*private Date date;
    private Time time;
    private int duration;
    private int repeatFreq;
    private String lecturer;
    private int maxAtt;
    private boolean compulsory;
    private String venue;*/
 
    // Constructors:
    public Admin() {
    }
 
    //public Admin(String course, Date date, Time time, int duration, int repeatFreq, String lecturer, int maxAtt, boolean compulsory, String venue) {
    public Admin(String course, String date, String time, String duration, String repeatFreq, String lecturer, String maxAtt, String compulsory, String venue) {
        this.course = course;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.repeatFreq = repeatFreq;
        this.lecturer = lecturer;
        this.maxAtt = maxAtt;
        this.compulsory = compulsory;
        this.venue = venue;
    }
 
    // String Representation:
    @Override
    public String toString() {
    	String a = course + "\t" + date + "\t" + time + "\t" + duration + "\t" + repeatFreq + "\t" + lecturer + "\t" + maxAtt + "\t" + compulsory + "\t" + venue;
    	return a;
    }
}