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
        Course course;
        int num;
        ArrayList randArrayList = new ArrayList();
        
        String calculationString = "Calculation";
        String likeString = "Like";
        String notinterString = "Not interesting";
        
        for (int i = 0; i < courseDao.showCourses().size(); i++) {
            course = new Course();
            course = courseDao.showCourses().remove(i);
            if (course.getFavourite().equalsIgnoreCase(calculationString)) {
                   num = dayDao.randomId();
                    if (!randArrayList.contains(dayDao.getLastId())) {
                        randArrayList.add(num);
                         System.out.print(num + " ");  
                    }else {
                       
                        System.out.print(num + "2  "); 
                    }                                      
                System.out.print("***************1A "); 
            }else if (course.getFavourite().equalsIgnoreCase(notinterString)) {
                    num = dayDao.randomId();
                    if (!randArrayList.contains(dayDao.getLastId())) {
                        randArrayList.add(num);
                         System.out.print(num + " ");  
                    }else {
                        
                        System.out.print(num + "2  "); 
                    }                    
                System.out.print("***************2 ");
            }else {
                     num = dayDao.randomId();
                     if (!randArrayList.contains(dayDao.getLastId())) {
                        randArrayList.add(num);
                    System.out.print(num + " ");                  
                }
            }
        }
    }
 
}
