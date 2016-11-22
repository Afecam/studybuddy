/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.Study.DAO;

import cm.Study.Entities.Course_Day;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cressence
 */
public class Course_DayDAO extends javaConnect{
    public void saveCourse_Day(Course_Day courseDay) throws SQLException{
        String sql = "INSERT INTO Course_Day VALUES (?,?,?);";
        conn = openConnection();
        pst = conn.prepareStatement(sql);
        pst.setInt(1, courseDay.getCourseDay_id());
        pst.setInt(2,courseDay.getCourse_Id());
        pst.setInt(3, courseDay.getDay_Id());
        
        pst.executeUpdate();
        pst.close();
        System.out.println("Course_Day successfully saved");
    }
    
    public ArrayList<Course_Day> showCourse_Days() throws SQLException{
        ArrayList<Course_Day> courseDays = new ArrayList<>();
        String sql = "SELECT * FROM Course_Day;";
        conn = openConnection();
        stm = conn.createStatement();
        result = stm.executeQuery(sql);
        
        Course_Day courseDay = null;
        while(result.next()){
            courseDay = new Course_Day();
            courseDay.setCourseDay_id(result.getInt("CourseDay_Id"));
            courseDay.setCourse_Id(result.getInt("Course_Id"));
            courseDay.setDay_Id(result.getInt("Day_Id"));
            
            courseDays.add(courseDay);
        }
        
        stm.close();
        closeConnection();
        result.close();
        return courseDays;
    }
    
    public boolean deleteCourseDay() throws SQLException{
        String sql = "DELETE FROM Course_Day;";
        conn = openConnection();
        pst = conn.prepareStatement(sql);
        
        int n = pst.executeUpdate();
        pst.close();
        closeConnection();
        return n==1;
    }
    
    public int getLastId() throws SQLException{
        int resultId;
        String sql ="SELECT CourseDay_Id FROM Course_Day WHERE  CourseDay_Id = (SELECT MAX(CourseDay_Id)  FROM Course_Day);";
        conn = openConnection();
        stm = conn.createStatement();
        result = stm.executeQuery(sql);
        
        if(result.next()){
        resultId = result.getInt("CourseDay_Id");
        }else {
            resultId = 0;
        }
            stm.close();
            closeConnection();
            result.close();
        
        return resultId;
    }
}
