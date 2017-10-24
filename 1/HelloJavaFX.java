import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
  @Override
  public void start(Stage primaryStage) {
    Label welcome = new Label("Welcome");
    welcome.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

    Label username = new Label("Username");
    Label password = new Label("Password");

    String secretPhrase = new String("abracadabra");

    TextField usernameField = new TextField();
    TextField passwordField = new TextField();

    Label hello = new Label();
    hello.setTextFill(Color.CRIMSON);
    hello.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

    Button sign = new Button();
    sign.setText("Sign in");
    sign.setOnAction(event -> {
      if (passwordField.getText().equals(secretPhrase)) {
        String name = usernameField.getText();
        hello.setText("Hello, " + name + "!");
      } else {
        hello.setText("Wrong password!");
      }
    });

    GridPane root = new GridPane();
    root.setHgap(10);
    root.setVgap(10);
    root.setAlignment(Pos.CENTER);

    root.add(welcome, 0, 0);
    root.add(username, 0, 1);
    root.add(usernameField, 1, 1);
    root.add(password, 0, 2);
    root.add(passwordField, 1, 2);
    root.add(sign, 0, 3);
    root.add(hello, 0, 4, 2, 1);

    Scene scene = new Scene(root, 300, 250);

    primaryStage.setTitle("Hello JavaFX!");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  public static void main(String[] args) {
    launch(args);
  }
}