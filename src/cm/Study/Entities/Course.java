/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.Study.Entities;

/**
 *
 * @author Cressence
 */
public class Course {
    private int Course_Id;
    private String course_Name;
    private int credit_value;
    private String favourite;

    public Course(String course_Name, int credit_value, String favourite) {
        this.course_Name = course_Name;
        this.credit_value = credit_value;
        this.favourite = favourite;
    }
    
    public Course(){
        
    }

    public String getCourse_Name() {
        return course_Name;
    }

    public int getCourse_Id() {
        return Course_Id;
    }

    public String getFavourite() {
        return favourite;
    }
    

    public int getCredit_value() {
        return credit_value;
    }

    public void setCourse_Id(int Course_Id) {
        this.Course_Id = Course_Id;
    }

    public void setCourse_Name(String course_Name) {
        this.course_Name = course_Name;
    }

    public void setCredit_value(int credit_value) {
        this.credit_value = credit_value;
    }

    public void setFavourite(String favourite) {
        this.favourite = favourite;
    }
    
    
}
