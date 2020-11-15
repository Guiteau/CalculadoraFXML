package dad.javafx.calculadoraFXML.contoller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import dad.javafx.calculadoraFXML.model.CalculadoraFXMLModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CalculadoraFXMLController implements Initializable{
	
	CalculadoraFXMLModel calculator = new CalculadoraFXMLModel();

	   @FXML
	    private GridPane root;

	    @FXML
	    private TextField pantallaText;

	    @FXML
	    private Button sieteButton;

	    @FXML
	    private Button ochoButton;

	    @FXML
	    private Button nueveButton;

	    @FXML
	    private Button cuatroButton;

	    @FXML
	    private Button unoButton;

	    @FXML
	    private Button ceroButton;

	    @FXML
	    private Button cincoButton;

	    @FXML
	    private Button dosButton;

	    @FXML
	    private Button seisButton;

	    @FXML
	    private Button tresButton;

	    @FXML
	    private Button comaButton;

	    @FXML
	    private Button masButton;

	    @FXML
	    private Button menosButton;

	    @FXML
	    private Button multiplicarButton;

	    @FXML
	    private Button ceButton;

	    @FXML
	    private Button cButton;

	    @FXML
	    private Button dividirButton;

	    @FXML
	    private Button igualButton;
	    
	    @FXML
	    void OnSieteButtonAction(ActionEvent event) {

	    	calculator.insertar('7');
	    	calculator.getPantalla();
	    	
	    }

	    @FXML
	    void onCButtonAction(ActionEvent event) {
	    	
	    	calculator.borrar();
	    	calculator.getPantalla();

	    }

	    @FXML
	    void onCeButtonAction(ActionEvent event) {

	    	calculator.borrarTodo();
	    	calculator.getPantalla();
	    	
	    }

	    @FXML
	    void onCeroButtonAction(ActionEvent event) {

	    	calculator.insertar('0');
	    	calculator.getPantalla();
	    	
	    }

	    @FXML
	    void onCincoButtonAction(ActionEvent event) {

	    	calculator.insertar('5');
	    	calculator.getPantalla();
	    	
	    }

	    @FXML
	    void onComaButtonAction(ActionEvent event) {
	    	
	    	calculator.insertarComa();
	    	calculator.getPantalla();

	    }

	    @FXML
	    void onCuatroButtonAction(ActionEvent event) {
	    	
	    	calculator.insertar('4');
	    	calculator.getPantalla();

	    }

	    @FXML
	    void onDividirButtonAction(ActionEvent event) {
	    	
	    	calculator.operar('/');
	    	calculator.getPantalla();

	    }

	    @FXML
	    void onDosButtonAction(ActionEvent event) {
	    	
	    	calculator.insertar('2');
	    	calculator.getPantalla();

	    }

	    @FXML
	    void onIgualButtonAction(ActionEvent event) {

	    	calculator.operar('=');
	    	calculator.getPantalla();
	    	
	    }

	    @FXML
	    void onMasButtonAction(ActionEvent event) {

	    	calculator.operar('+');
	    	calculator.getPantalla();
	    	
	    }

	    @FXML
	    void onMenosButtonAction(ActionEvent event) {

	    	calculator.operar('-');
	    	calculator.getPantalla();
	    	
	    }

	    @FXML
	    void onMultiplicarButtonAction(ActionEvent event) {

	    	calculator.operar('*');
	    	calculator.getPantalla();
	    	
	    }

	    @FXML
	    void onNueveButtonAction(ActionEvent event) {
	    	
	    	calculator.insertar('9');
	    	calculator.getPantalla();

	    }

	    @FXML
	    void onOchoButtonAction(ActionEvent event) {
	    	
	    	calculator.insertar('8');
	    	calculator.getPantalla();

	    }

	    @FXML
	    void onSeisButtonAction(ActionEvent event) {

	    	calculator.insertar('6');
	    	calculator.getPantalla();
	    	
	    }

	    @FXML
	    void onTresButtonAction(ActionEvent event) {

	    	calculator.insertar('3');
	    	calculator.getPantalla();
	    	
	    }

	    @FXML
	    void onUnoButtonAction(ActionEvent event) {

	    	calculator.insertar('1');
	    	calculator.getPantalla();
	    	
	    }	    
	    
	    public CalculadoraFXMLController() throws IOException {
	    	
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraInterfazFXML.fxml"));
			loader.setController(this);
			loader.load();
    	
	    }
	    
		public GridPane getView() {
			return root;
		}

		@Override
		public void initialize(URL location, ResourceBundle resources) {

			pantallaText.textProperty().bindBidirectional(calculator.pantalla);
					
		}
	    
}
