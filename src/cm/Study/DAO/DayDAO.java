/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.Study.DAO;

import cm.Study.Entities.Days;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cressence
 */
public class DayDAO extends javaConnect{
    
    public void saveDay(Days day) throws SQLException{
        String sql = "INSERT INTO Days VALUES (?,?,?,?);";
        conn = openConnection();
        pst = conn.prepareStatement(sql);
        pst.setInt(1, day.getDay_Id());
        pst.setString(2,day.getDay_Name());
        pst.setString(3, day.getFree_From());
        pst.setString(4, day.getFree_To());
        
        pst.executeUpdate();
        pst.close();
        System.out.println("Day successfully saved");
    }
    
    public void updateDay(Days day) throws SQLException{
        String sql = "UPDATE Days SET Day_Name = ?, Free_From = ?, Free_To = ? WHERE Day_Id = ?;";
        conn = openConnection();
        pst = conn.prepareStatement(sql);
        pst.setString(1, day.getDay_Name());
        pst.setString(2, day.getFree_From());
        pst.setString(3, day.getFree_To());
        pst.setInt(4, day.getDay_Id());
        
        pst.executeUpdate();
        pst.close();
        System.out.println("Day successfully updated");
    }
    
    public ArrayList<Days> showDays() throws SQLException{
        ArrayList<Days> days = new ArrayList<>();
        String sql = "SELECT * FROM Days;";
        conn = openConnection();
        stm = conn.createStatement();
        result = stm.executeQuery(sql);
        
        Days day = null;
        while(result.next()){
            day = new Days();
            day.setDay_Id(result.getInt("Day_Id"));
            day.setDay_Name(result.getString("Day_Name"));
            day.setFree_From(result.getString("Free_From"));
            day.setFree_To(result.getString("Free_To"));
            
            days.add(day);
        }
        
        stm.close();
        closeConnection();
        result.close();
        return days;
    }
    
    public boolean deleteDay(String dayName) throws SQLException{
        String sql = "DELETE FROM Days WHERE Day_Name = ?;";
        conn = openConnection();
        pst = conn.prepareStatement(sql);
        pst.setString(1, dayName);
        
        int n = pst.executeUpdate();
        pst.close();
        closeConnection();
        return n==1;
    }
    
    public boolean deleteAll() throws SQLException{
        String sql = "DELETE FROM Days;";
        conn = openConnection();
        pst = conn.prepareStatement(sql);
        
        int n = pst.executeUpdate();
        pst.close();
        closeConnection();
        return n==1;
    }
    
    public int getLastId() throws SQLException{
        int resultId;
        String sql ="SELECT Day_Id FROM Days WHERE  Day_Id = (SELECT MAX(Day_Id)  FROM Days);";
        conn = openConnection();
        stm = conn.createStatement();
        result = stm.executeQuery(sql);
        
        if(result.next()){
        resultId = result.getInt("Day_Id");
        }else {
            resultId = 0;
        }
            stm.close();
            closeConnection();
            result.close();
        
        return resultId;
    }
    
    public ArrayList<Days> getFreeTime(String theday) throws SQLException{
        ArrayList<Days> freeTime = new ArrayList<>();
        String sql = "SELECT Day_Id, Free_From, Free_To FROM Days WHERE Day_Name=?";
        conn = openConnection();
         pst = conn.prepareStatement(sql);
        pst.setString(1, theday);
        result = pst.executeQuery();
        
        Days day = null;
        while(result.next()){
            day = new Days();
            day.setDay_Id(result.getInt("Day_Id"));
            day.setDay_Name(theday);
            day.setFree_From(result.getString("Free_From"));
            day.setFree_To(result.getString("Free_To"));
            
            freeTime.add(day);
        }
        
        pst.close();
        closeConnection();
        result.close();
        return freeTime;
    }
    
    public int randomId() throws SQLException{
       int resultId;
        String sql ="SELECT Day_Id FROM Days ORDER BY RANDOM() LIMIT 1;";
        conn = openConnection();
        stm = conn.createStatement();
        result = stm.executeQuery(sql);
        
        if(result.next()){
        resultId = result.getInt("Day_Id");
        }else {
            resultId = 0;
        }
            stm.close();
            closeConnection();
            result.close();
        
        return resultId;
    }
}
