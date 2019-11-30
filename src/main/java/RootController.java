import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class RootController implements Initializable {
	@FXML
	private GridPane rootView;

	@FXML
	private Button ceroButton;

	@FXML
	private Button puntoButton;

	@FXML
	private Button unoButton;

	@FXML
	private Button dosButton;

	@FXML
	private Button tresButton;

	@FXML
	private Button cuatroButton;

	@FXML
	private Button cincoButton;

	@FXML
	private Button seisButton;

	@FXML
	private Button sieteButton;

	@FXML
	private Button ochoButton;

	@FXML
	private Button nueveButton;

	@FXML
	private Button ceButton;

	@FXML
	private Button multiButton;

	@FXML
	private Button igualButton;

	@FXML
	private Button cButton;

	@FXML
	private Button divideButton;

	@FXML
	private Button sumaButton;

	@FXML
	private Button restaButton;

	@FXML
	private TextField operadorField;

	private Calculadora model = new Calculadora();

	public RootController() throws IOException {
		FXMLLoader loader=new FXMLLoader(getClass().getResource("CalculadoraView.fxml"));
		loader.setController(this);
		loader.load();
	}

	public void initialize(URL location, ResourceBundle resources) {
		operadorField.textProperty().bindBidirectional(model.pantallaProperty());

	}

	@FXML
	void onCButtonAction(ActionEvent event) {
		model.borrar();
	}

	@FXML
	void onCEButtonAction(ActionEvent event) {
		model.borrarTodo();
	}

	@FXML
	void onCeroButtonAction(ActionEvent event) {
		model.insertar('0');
	}

	@FXML
	void onCincoButtonAction(ActionEvent event) {
		model.insertar('5');
	}

	@FXML
	void onCuatroButtonAction(ActionEvent event) {
		model.insertar('4');
	}

	@FXML
	void onDivideButtonAction(ActionEvent event) {
		model.operar('/');
	}

	@FXML
	void onDosButtonAction(ActionEvent event) {
		model.insertar('2');
	}

	@FXML
	void onIgualButtonAction(ActionEvent event) {
		model.operar('=');
	}

	@FXML
	void onMultiButtonAction(ActionEvent event) {
		model.operar('*');
	}

	@FXML
	void onNueveButtonAction(ActionEvent event) {
		model.insertar('9');
	}

	@FXML
	void onOchoButtonAction(ActionEvent event) {
		model.insertar('8');
	}

	@FXML
	void onPuntoButtonAction(ActionEvent event) {
		model.operar('.');
	}

	@FXML
	void onRestaButtonAction(ActionEvent event) {
		model.operar('-');
	}

	@FXML
	void onSeisButtonAction(ActionEvent event) {
		model.insertar('6');
	}

	@FXML
	void onSieteButtonAction(ActionEvent event) {
		model.insertar('7');
	}

	@FXML
	void onSumaButtonAction(ActionEvent event) {
		model.operar('+');
	}

	@FXML
	void onTresButtonAction(ActionEvent event) {
		model.insertar('3');
	}

	@FXML
	void onUnoButtonAction(ActionEvent event) {
		model.insertar('1');
	}

	public GridPane getView() {
		return rootView;
	}

}
