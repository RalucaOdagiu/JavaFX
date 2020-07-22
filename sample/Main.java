
package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("Initializing APPLICATION");
    }
    @Override
    public void stop() throws Exception {
        System.out.println("Stop application");
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println("Entered start method");
        TextField textName = new TextField();

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        System.out.println("exiting start method");
    }
    public static void main(String[] args) {
        System.out.println("enter main");
        launch(args);
        System.out.println("Launched");
    }
}