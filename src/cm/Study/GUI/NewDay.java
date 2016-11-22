/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.Study.GUI;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXListView;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Cressence
 */
public class NewDay extends Stage{
    String imString = "study2.jpg";
    Label titleLb = new Label("Enter the following information on your free time");
    Label nbLabel = new Label("NB: the time should be when you want to read");
    
    Image studyImage = new Image(getClass().getResourceAsStream(imString));
    ImageView imageView;
    
    HBox titleHBox = new HBox();
    
    Label daysLb = new Label("Days");
    JFXComboBox dayCombo = new JFXComboBox();
    Label fromLabel = new Label("From");
    JFXDatePicker timeFrom = new JFXDatePicker();    
    Label toLabel = new Label("To");
    JFXDatePicker timeTo = new JFXDatePicker();    
    VBox comboVBox = new VBox();
    
    JFXButton okButton = new JFXButton("OK");
    VBox leftVBox = new VBox();
    
    JFXListView<Label> dayListView = new JFXListView<Label>();
    JFXButton nextButton = new JFXButton("Next");
    JFXButton previousButton = new JFXButton("Previous");
    VBox rightVBox = new VBox();
    VBox daysVBox = new VBox();
    VBox froVBox = new VBox();
    VBox toVBox = new VBox();
    
    HBox buttonHBox = new HBox();
    HBox middleHBox = new HBox();
    VBox root = new VBox();
    
   
}
