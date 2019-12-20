/*
Usage:
Author:Amau
Time:2019-12-17 23:40:00
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class ButtonExample extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws  Exception {
    FileInputStream fileInputStream=new FileInputStream("D:\\workspace\\ideaworkspace\\Gradle\\src\\main\\java\\ok.png");
    Image imageOk=new Image(fileInputStream);
    /*Image imageOk = new Image(getClass().getResourceAsStream("ok.png"));*/
    Button button = new Button("Accept", new ImageView(imageOk));

    StackPane stackPane=new StackPane();
    stackPane.getChildren().add(button);
    Scene scene=new Scene(stackPane,300,275);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Button usage");
    primaryStage.show();
  }
}
