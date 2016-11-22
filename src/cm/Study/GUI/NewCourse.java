/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.Study.GUI;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Cressence
 */
public class NewCourse extends Stage{
    String calculationString = "Calculation";
    String notinterString = "Not interesting";
    String likeString = "Like";
    String imagePath = "study1.png";
    Image image = new Image(getClass().getResourceAsStream(imagePath));
    
    String imString = "study2.jpg";
    Label titleLb = new Label("Enter the following information on your courses");
    
    Image studyImage = new Image(getClass().getResourceAsStream(imString));
    ImageView imageView;
    
    HBox titleHBox = new HBox();
    
    RequiredFieldValidator validator = new RequiredFieldValidator(); 
    
    Label courseLb = new Label("Enter courses");
    JFXTextField courseTf = new JFXTextField();
    VBox courseVb = new VBox();
    
    Label creditValueLb = new Label("Credit value");
    JFXTextField creditValueTf = new JFXTextField();
    VBox creditVb = new VBox();
    
    ToggleGroup opinionGroup = new ToggleGroup();
    Label radioLabel = new Label("What i think of the course");
    JFXRadioButton difficulRadioButton = new JFXRadioButton("Calculations");
    JFXRadioButton notInterRadioButton = new JFXRadioButton("Not interesting");
    JFXRadioButton likeRadioButton = new JFXRadioButton("Like");
    VBox radioVBox = new VBox();
    
    JFXButton okButton = new JFXButton("OK");
    VBox leftVBox = new VBox();
    
    JFXListView<Label> courseListView = new JFXListView<Label>();
    ContextMenu listContextMenu = new ContextMenu();
    MenuItem deleteItem = new MenuItem("Delete");
    MenuItem updateItem = new MenuItem("Update");
    JFXButton nextButton = new JFXButton("Next");
    VBox rightVBox = new VBox();
    
    
    HBox middleHBox = new HBox();
    VBox root = new VBox();
    
    Scene courseScene;
    
}
