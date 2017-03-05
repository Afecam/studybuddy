/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.Study.GUI;

import com.jfoenix.controls.JFXButton;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Cressence
 */
public class TimeTable extends Stage{
  
     //title
    Label title = new Label("Your reading timetable... Success!!!!");
    
//    menu
    MenuBar menubar = new MenuBar();
    Menu fileMenu = new Menu("File");
    Menu editMenu = new Menu("Edit");
    Menu aboutMenu = new Menu("About");
    Menu helpMenu = new Menu("Help");
    MenuItem save = new MenuItem("New");
    MenuItem print = new MenuItem("Print");
    MenuItem exitM = new MenuItem("Exit");
    
    //Button
    JFXButton backBtn = new JFXButton("Edit | New");
    
    VBox mondayBox = new VBox();
    VBox teusdayBox = new VBox();
    VBox wednesdayBox = new VBox();
    VBox thursdayBox = new VBox();
    VBox fridayBox = new VBox();
    VBox saturdayBox = new VBox();
    VBox sundayBox = new VBox();
    HBox firstHBox = new HBox();
    HBox secondHBox = new HBox();
    HBox thirdHBox = new HBox();
    
    //layout
    VBox tableVb = new VBox();
    BorderPane tableroot = new BorderPane();
    
}
