package com.clipcycle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Application entry point.
 * Launches a single JavaFX window with the filmstrip background color.
 * All Copy-List logic lives in the model package; this class only
 * bootstraps the UI.
 */
public class App extends Application {

    private static final double WINDOW_WIDTH  = 960;
    private static final double WINDOW_HEIGHT = 540;

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        root.getStyleClass().add("root-pane");

        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);

        // Load the design-system stylesheet
        scene.getStylesheets().add(
            getClass().getResource("/com/clipcycle/styles/clipcycle.css")
                      .toExternalForm()
        );

        stage.setTitle("ClipCycle");
        stage.setScene(scene);
        stage.setMinWidth(720);
        stage.setMinHeight(400);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
