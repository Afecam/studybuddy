/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.Study.Main;

import cm.Study.GUI.MainWindow;
import cm.Study.GUI.MainWindowController;
import cm.Study.GUI.NewCourse;
import cm.Study.GUI.NewCourseController;
import cm.Study.GUI.NewDay;
import cm.Study.GUI.TimeTable;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Cressence
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws SQLException {
        mainWindow();
     
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void mainWindow(){
        MainWindow mainWindow = new MainWindow();
        MainWindowController mainCOntroller = new MainWindowController(mainWindow);
    }
    
    public void newCourse() throws SQLException{
        NewCourse newCourse = new NewCourse();
        NewDay newDay = new NewDay();
        TimeTable newTimeTable = new TimeTable();
        NewCourseController newCourseController = new NewCourseController(newCourse, newDay, newTimeTable);
    }
}
