package application;

import java.io.IOException;
import java.util.Locale;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	

	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/gui/Calculadora.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("Calculadora");
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		launch(args);
	}
}
