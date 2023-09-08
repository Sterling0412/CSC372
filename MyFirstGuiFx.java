package com.example.csc372assignment31;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.Group;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


import java.io.IOException;
import java.util.Random;

public class MyFirstGuiFx extends Application {
    /**
     * Create double for random hue
     */
    double randomHue = 120 + new Random().nextDouble() * 60;

    /**
     * Create color with random hue
     */
    Color randomGreenColor = Color.hsb(randomHue, 1.0, 1.0);

    @Override
    public void start(Stage stage) throws IOException {
        /**Create text area and make editable*/
        TextArea textArea = new TextArea();
        textArea.setEditable(true);
        textArea.setWrapText(true);
/**Create scroll pane*/
        ScrollPane scrollPane = new ScrollPane(textArea);
/**Create border pane*/
        BorderPane pane = new BorderPane();
        pane.setCenter(scrollPane);


        /**Create a menu*/
        Menu myMenu = new Menu("Options");
        /**Create menu Items*/
        MenuItem option1 = new MenuItem("Date and Time");
        MenuItem option2 = new MenuItem("Write File");
        MenuItem option3 = new MenuItem("Change Color");
        MenuItem option4 = new MenuItem("Exit");
        /**Set action for options*/

        /**Add all option to menu*/
        myMenu.getItems().addAll(option1, option2, option3, option4);
        /**Create menu bar and add items*/
        MenuBar menuBar = new MenuBar(myMenu);
        VBox vBox = new VBox(menuBar);
        vBox.getChildren().add(pane);
        vBox.setSpacing(50);
        vBox.setStyle("-fx-background-color: #00ff00");
        /** Set the stage*/
        Scene scene = new Scene(vBox, 900, 500);
        stage.setTitle("My First Gui JavaFx");
        stage.setScene(scene);
        stage.show();
/**Create action to display date and time for option 1*/
        option1.setOnAction(e -> {
            DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            textArea.setText(dateTime.format(now));
        });
        /**Create action to write file for option 2*/
        option2.setOnAction(e -> {
            try {
                FileWriter fw = new FileWriter("log.txt");
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                pw.println(textArea);
                pw.close();
                System.out.println("SUCCESS! Data was written to file!");
            } catch (Exception d) {
                System.out.println("FAILURE! " + d.getMessage());
            }


        });
        /**Create action to change background color for option 3*/
        option3.setOnAction(e -> {


            vBox.setStyle("-fx-background-color: " + toRGBCode(randomGreenColor));

        });
/**Create action to exit for option 4*/
        option4.setOnAction(e -> {
            System.exit(0);
        });


    }


    public static void main(String[] args) {
        launch();
    }

    /**
     * Create method to get a random color
     */
    private String toRGBCode(Color color) {
        return String.format("#%02X%02X%02X",
                (int) (color.getRed() * 255),
                (int) (color.getGreen() * 255),
                (int) (color.getBlue() * 255));
    }

}