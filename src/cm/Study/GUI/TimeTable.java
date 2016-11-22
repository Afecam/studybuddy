/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.Study.GUI;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
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
    JFXButton backBtn = new JFXButton("Edit");
    
    //table
    TableView table = new TableView();
    
    TableColumn mondayT = new TableColumn("Monday");
    TableColumn teusdayT = new TableColumn("Tuesday");
    TableColumn wednesdayT = new TableColumn("Wednesday");
    TableColumn thursdayT = new TableColumn("Thursday");
    TableColumn fridayT = new TableColumn("Friday");
    TableColumn saturdayT = new TableColumn("Saturday");
    TableColumn sundayT = new TableColumn("Sunday");
    
    //layout
    VBox tableVb = new VBox();
    BorderPane tableroot = new BorderPane();
    
}
