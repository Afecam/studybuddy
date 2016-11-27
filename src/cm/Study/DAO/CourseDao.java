/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.Study.DAO;

import cm.Study.Entities.Course;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cressence
 */
public class CourseDao extends javaConnect{
    
    public void saveCourse(Course course) throws SQLException{
        String sql = "INSERT INTO Course VALUES (?,?,?,?);";
        conn = openConnection();
        pst = conn.prepareStatement(sql);
        pst.setInt(1, course.getCourse_Id());
        pst.setString(2,course.getCourse_Name());
        pst.setInt(3, course.getCredit_value());
        pst.setString(4, course.getFavourite());
        
        pst.executeUpdate();
        pst.close();
        System.out.println("Course successfully saved");
    }
    
    public void updateCourse(Course course) throws SQLException{
        String sql = "UPDATE Course SET Course_Name = ?, Credit_Value = ? WHERE Course_Id = ?;";
        conn = openConnection();
        pst = conn.prepareStatement(sql);
        pst.setString(1, course.getCourse_Name());
        pst.setInt(2, course.getCredit_value());
        pst.setInt(3, course.getCourse_Id());
        
        pst.executeUpdate();
        pst.close();
        System.out.println("Course successfully updated");
    }
    
    public ArrayList<Course> showCourses() throws SQLException{
        ArrayList<Course> courses = new ArrayList<>();
        String sql = "SELECT * FROM Course;";
        conn = openConnection();
        stm = conn.createStatement();
        result = stm.executeQuery(sql);
        
        Course course = null;
        while(result.next()){
            course = new Course();
            course.setCourse_Id(result.getInt("Course_Id"));
            course.setCourse_Name(result.getString("Course_Name"));
            course.setCredit_value(result.getInt("Credit_Value"));
            course.setFavourite(result.getString("Favourite"));
            
            courses.add(course);
        }
        
        stm.close();
        closeConnection();
        result.close();
        return courses;
    }
    
    public boolean deleteCourse(String courseName) throws SQLException{
        String sql = "DELETE FROM Course WHERE Course_Name = ?;";
        conn = openConnection();
        pst = conn.prepareStatement(sql);
        pst.setString(1, courseName);
        
        int n = pst.executeUpdate();
        pst.close();
        closeConnection();
        return n==1;
    }
    
    public int getLastId() throws SQLException{
        int resultId;
        String sql ="SELECT Course_Id FROM Course WHERE  Course_Id = (SELECT MAX(Course_Id)  FROM Course);";
        conn = openConnection();
        stm = conn.createStatement();
        result = stm.executeQuery(sql);
        
        if(result.next()){
        resultId = result.getInt("Course_Id");
        }else {
            resultId = 0;
        }
            stm.close();
            closeConnection();
            result.close();
        
        return resultId;
    }
    
    public int randomId() throws SQLException{
       int resultId;
        String sql ="SELECT Course_Id FROM Course ORDER BY RANDOM() LIMIT 1;";
        conn = openConnection();
        stm = conn.createStatement();
        result = stm.executeQuery(sql);
        
        if(result.next()){
        resultId = result.getInt("Course_Id");
        }else {
            resultId = 0;
        }
            stm.close();
            closeConnection();
            result.close();
        
        return resultId;
    }
}
