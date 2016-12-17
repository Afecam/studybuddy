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
        
<<<<<<< HEAD
        if (dayDao.showDays().size() == courseDao.showCourses().size()) {
            for (int i = 0; i < dayDao.showDays().size(); i++) {
                num = courseDao.randomId();
                if (!randArrayList.contains(num)) {
                    randArrayList.add(num);
                    System.out.println(num  + "found  ");
                } else {
                    check(randArrayList);
                }
            }
        }else if (dayDao.showDays().size() > courseDao.showCourses().size()) {
            
        }
        
//        for (int i = 0; i < courseDao.showCourses().size(); i++) {
//            course = new Course();
//            course = courseDao.showCourses().remove(i);
//            if (course.getFavourite().equalsIgnoreCase(calculationString)) {
//                   num = dayDao.randomId();
//                    if (!randArrayList.contains(dayDao.getLastId())) {
//                        randArrayList.add(num);
//                         System.out.print(num + " ");  
//                    }else {
//                       
//                        System.out.print(num + "2  "); 
//                    }                                      
//                System.out.print("***************end "); 
//            }else if (course.getFavourite().equalsIgnoreCase(notinterString)) {
//                    num = dayDao.randomId();
//                    if (!randArrayList.contains(dayDao.getLastId())) {
//                        randArrayList.add(num);
//                         System.out.print(num + " ");  
//                    }else {
//                        
//                        System.out.print(num + "2  "); 
//                    }                    
//                System.out.print("***************end ");
//            }else {
//                     num = dayDao.randomId();
//                     if (!randArrayList.contains(dayDao.getLastId())) {
//                        randArrayList.add(num);
//                    System.out.print(num + " ");                  
//                }
//            }
//        }
    }
    
    public static ArrayList check(ArrayList randArrayList) throws SQLException{
        int num;
        CourseDao courseDao = new CourseDao();
        num = courseDao.randomId();
        if (!randArrayList.contains(num)) {
                    randArrayList.add(num);
                    System.out.println(num + "not found");
        } else {
            check(randArrayList);
        }
        return randArrayList;
=======
        
        
        
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
>>>>>>> first-branch
    }
}
 
