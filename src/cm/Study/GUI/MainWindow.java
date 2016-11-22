/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.Study.GUI;

import com.jfoenix.controls.JFXButton;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Cressence
 */
public class MainWindow extends Stage{
    //title
    Label title = new Label("STUDY BUDDY");
    
//    menu
    MenuBar menubar = new MenuBar();
    Menu fileMenu = new Menu("File");
    Menu editMenu = new Menu("Edit");
    Menu aboutMenu = new Menu("About");
    Menu helpMenu = new Menu("Help");
    MenuItem save = new MenuItem("New");
    MenuItem print = new MenuItem("Print");
    MenuItem exitM = new MenuItem("Exit");
    
    //Image
    String imagePath = "study1.png";
    String newimagePath = "new.png";
    String settingsimagePath = "settings.jpg";
    Image image = new Image(getClass().getResourceAsStream(imagePath));
    Image newimage = new Image(getClass().getResourceAsStream(newimagePath));
    Image settingsimage = new Image(getClass().getResourceAsStream(settingsimagePath));
    ImageView imageView;
    
    //buttons
    JFXButton newTimetable;
    JFXButton alarmSettings;
    
    //layout
    VBox buttonVbox = new VBox();
    HBox hbox = new HBox();
    BorderPane root = new BorderPane();
    Scene scene = new Scene(root, 650, 450);
}
