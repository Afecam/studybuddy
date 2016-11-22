/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.Study.GUI;


import cm.Study.Main.Main;
import com.jfoenix.controls.JFXButton;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.print.PrinterJob;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;

/**
 *
 * @author Cressence
 */
public class MainWindowController {
    MainWindow mainwindowStage;

    public MainWindowController(MainWindow mainwindowStage) {
        this.mainwindowStage = mainwindowStage;
        initialize();
    }
    
    public void initialize() {
        mainwindowStage.scene.getStylesheets().add(Main.class.getResource("styles.css").toExternalForm());
        
        
        mainwindowStage.imageView = getImageView(mainwindowStage.image, 300, 300);
        mainwindowStage.newTimetable = new JFXButton("New Timetable", getImageView(mainwindowStage.newimage, 30, 30));
        mainwindowStage.newTimetable.getStyleClass().add("button-raised");
        mainwindowStage.alarmSettings = new JFXButton("Alarm Settings", getImageView(mainwindowStage.settingsimage, 30, 30));
        mainwindowStage.alarmSettings.getStyleClass().add("button-raised");
        mainwindowStage.menubar.getMenus().addAll(mainwindowStage.fileMenu, mainwindowStage.editMenu, 
                mainwindowStage.aboutMenu, mainwindowStage.helpMenu);
        mainwindowStage.fileMenu.getItems().addAll(mainwindowStage.save, mainwindowStage.print, mainwindowStage.exitM);
        mainwindowStage.root.setTop(mainwindowStage.menubar);
        
        mainwindowStage.buttonVbox.getChildren().addAll(mainwindowStage.title, mainwindowStage.newTimetable, mainwindowStage.alarmSettings);
        mainwindowStage.title.getStyleClass().add("title");
        mainwindowStage.hbox.getChildren().addAll(mainwindowStage.imageView, mainwindowStage.buttonVbox);
        mainwindowStage.buttonVbox.setAlignment(Pos.CENTER);
        mainwindowStage.hbox.setAlignment(Pos.CENTER);
        mainwindowStage.buttonVbox.setSpacing(30);
        mainwindowStage.hbox.setSpacing(30);
        mainwindowStage.hbox.getStyleClass().add("main-background");
        mainwindowStage.root.setCenter(mainwindowStage.hbox);  
        
        //events
        mainwindowStage.exitM.setOnAction((ActionEvent t)->
        {System.exit(0);});
        mainwindowStage.print.setAccelerator(KeyCombination.keyCombination("Ctrl+P"));
        mainwindowStage.save.setAccelerator(KeyCombination.keyCombination("Ctrl+N"));
        mainwindowStage.print.setOnAction((ActionEvent ae) ->
        {
            print(mainwindowStage.hbox);
        });
        mainwindowStage.save.setOnAction((ActionEvent ae) ->
        {
            try {
                newCourse();
            } catch (SQLException ex) {
                Logger.getLogger(MainWindowController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        mainwindowStage.newTimetable.setOnAction((ActionEvent t) ->
        {
            try {
                newCourse();
            } catch (SQLException ex) {
                Logger.getLogger(MainWindowController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        mainwindowStage.getIcons().add(mainwindowStage.image);
        mainwindowStage.setResizable(false);
        mainwindowStage.setScene(mainwindowStage.scene);
        mainwindowStage.setTitle("StudyBuddy");
        mainwindowStage.showAndWait();
    }
    
    public void print (Node node){
               PrinterJob job = PrinterJob.createPrinterJob();
        if (job != null && job.showPrintDialog(node.getScene().getWindow())){
        boolean success = job.printPage(node);
        if (success) {
            job.endJob();
        }
      }
    }
    
     public ImageView getImageView(Image image, double fitWidth, double fitHeight){
        ImageView view = new ImageView(image);
        view.setFitHeight(fitHeight);
        view.setFitWidth(fitWidth);
        
        return view;
    }
    
    public void newCourse() throws SQLException{
        NewCourse newCourse = new NewCourse();
        NewDay newDay = new NewDay();
        TimeTable newTimeTable = new TimeTable();
        NewCourseController newCourseController = new NewCourseController(newCourse, newDay, newTimeTable);
    }
}
