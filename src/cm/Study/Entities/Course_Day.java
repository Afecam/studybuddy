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
public class Course_Day {
    private int CourseDay_id;
    private int Course_Id;
    private int Day_Id;

    public Course_Day() {
    }

    public Course_Day( int Course_Id, int Day_Id) {
        this.Course_Id = Course_Id;
        this.Day_Id = Day_Id;
    }

    public void setCourseDay_id(int CourseDay_id) {
        this.CourseDay_id = CourseDay_id;
    }

    public void setCourse_Id(int Course_Id) {
        this.Course_Id = Course_Id;
    }

    public void setDay_Id(int Day_Id) {
        this.Day_Id = Day_Id;
    }

    public int getCourseDay_id() {
        return CourseDay_id;
    }

    public int getCourse_Id() {
        return Course_Id;
    }

    public int getDay_Id() {
        return Day_Id;
    }
    
    
}
