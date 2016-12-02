/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.Study.Entities;

import java.time.LocalTime;



/**
 *
 * @author Cressence
 */
public class Days {
    private int Day_Id;
    private String Day_Name;
    private String Free_From;
    private String Free_To;
    
    public Days(){
        
    }   

    public Days(String Day_Name, String Free_From, String Free_To) {
        this.Day_Name = Day_Name;
        this.Free_From = Free_From;
        this.Free_To = Free_To;
    }
        

    public int getDay_Id() {
        return Day_Id;
    }

    public void setDay_Id(int Day_Id) {
        this.Day_Id = Day_Id;
    }

    public String getDay_Name() {
        return Day_Name;
    }

    public void setDay_Name(String Day_Name) {
        this.Day_Name = Day_Name;
    }

    public String getFree_From() {
        return Free_From;
    }

    public void setFree_From(String Free_From) {
        this.Free_From = Free_From;
    }

    public String getFree_To() {
        return Free_To;
    }

    public void setFree_To(String Free_To) {
        this.Free_To = Free_To;
    }

    
}
