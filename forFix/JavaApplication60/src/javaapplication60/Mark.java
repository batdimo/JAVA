/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication60;

/**
 *
 * @author s504
 */
public class Mark {

    private String date;
    private String subject;
    private int mark;

    public Mark() {
    }

    public Mark(String date, String subject, int mark) {
        this.date = date;
        this.subject = subject;
        this.mark = mark;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Mark{" + "date=" + date + ", subject=" + subject + ", mark=" + mark + '}';
    }
    
    
}
