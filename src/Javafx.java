/**
 * Date: 9/19/17
 * @Author: Shea Salloum
 * License: GNU
 */

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;

public class Javafx extends Application {
   //prompt user with JOption to ener height
    //convert data from string to appropate data
    // out put the information in feet cm and in. Use javafx and JoptionPane


    @Override
    public void start(Stage primaryStage) throws Exception {
        // Swing input dialog


        JOptionPane pane = new JOptionPane(JOptionPane.showInputDialog("Enter your height"));


        //input
        TextInputDialog textInputDialog = new TextInputDialog("140.5");
        textInputDialog.setTitle("Matrics Converter");
        textInputDialog.setHeaderText("Centimeter to feet and inches Converter");
        textInputDialog.setContentText("Enter your height in cm");
        textInputDialog.setX(500);
        textInputDialog.setY(525);
        Optional<String> result = textInputDialog.showAndWait();

        //logic gor siwng
        double heightInCmswing = Double.parseDouble(result.get()); //logic
        double heightInInchesswing= heightInCmswing * 0.39;
        int heightInFeetswing = (int)(heightInInchesswing/12);
        int remainderHeightInInchesswing = (int) (heightInInchesswing%12);

         // logic for javafx
        double heightInCm = Double.parseDouble(result.get()); //logic
        double heightInInches= heightInCm * 0.39;
        int heightInFeet = (int)(heightInInches/12);
        int remainderHeightInInches = (int) (heightInInches%12);
        //
        JOptionPane.showMessageDialog(null, "your height is " +heightInFeetswing + " feet "
        + remainderHeightInInchesswing );
        pane.setBounds(500, 525,1000,1000);
        pane.setVisible(true);

        Alert alert= new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Height Converter");
        alert.setHeaderText("Your height is! ");
        alert.setContentText(heightInFeet + " feet" + remainderHeightInInches + "inches");
        alert.setX(500);
        alert.setY(525);

        alert.showAndWait();

    }
}

