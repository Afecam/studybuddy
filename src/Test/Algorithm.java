/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import cm.Study.DAO.CourseDao;
import cm.Study.DAO.DayDAO;
import cm.Study.Entities.Course;
import cm.Study.Entities.Days;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Cressence
 */
public class Algorithm {
   
    public static void main(String args[]) throws SQLException{     
        DayDAO dayDao = new DayDAO();
        CourseDao courseDao = new CourseDao();
        Days days;
        Course course;
        int courseId = 0;
        int num = 2;
        ArrayList dayArrayList1 = new ArrayList();
        
        String calculationString = "Calculation";
        String likeString = "Like";
        String notinterString = "Not interesting";
        
        if (courseDao.showCourses().size() == dayDao.showDays().size()) {
            for (int i = 0; i < dayDao.showDays().size(); i++) {
                days = new Days();
                days = dayDao.showDays().remove(i);
                
                dayArrayList1 = addCourse( courseId);  
                for (int j = 0; j < dayArrayList1.size(); j++) {
                    if (dayArrayList1.remove(j).equals(num)) {
                        System.err.println("yes");
                    }else {
                        System.out.println("no");
                    }
                }

            }
        }else if (dayDao.showDays().size() > courseDao.showCourses().size()) {
            
        }else
        {
            System.out.println("not equal");
        }
        
        
    }
    
    public static ArrayList addCourse(int courseId) throws SQLException{
        ArrayList dayArrayList = new ArrayList();
        DayDAO dayDao = new DayDAO();
        CourseDao courseDao = new CourseDao();
        courseId = courseDao.randomId();
                if (!dayArrayList.contains(courseId)) {
                    dayArrayList.add(courseId);
                    System.out.println(courseId);
                }else {
                    addCourse(courseId);
                }
                return dayArrayList;
    }
}
 
