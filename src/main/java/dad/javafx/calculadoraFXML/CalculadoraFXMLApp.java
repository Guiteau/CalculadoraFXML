package dad.javafx.calculadoraFXML;

import dad.javafx.calculadoraFXML.contoller.CalculadoraFXMLController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraFXMLApp extends Application {

	CalculadoraFXMLController controller;

	@Override
	public void start(Stage primaryStage) throws Exception {

		controller = new CalculadoraFXMLController();

		Scene scene = new Scene(controller.getView());

		primaryStage.setTitle("Calculadora");
		primaryStage.setScene(scene);
		primaryStage.show();
	

	}

	public static void main(String[] args) {

		launch(args);

	}

}
