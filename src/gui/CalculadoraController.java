package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculadoraController implements Initializable {

	private double x, y, result;

	private String op;

	@FXML
	private TextField tela;
	@FXML
	private Button bt0;
	@FXML
	private Button bt1;
	@FXML
	private Button bt2;
	@FXML
	private Button bt3;
	@FXML
	private Button bt4;
	@FXML
	private Button bt5;
	@FXML
	private Button bt6;
	@FXML
	private Button bt7;
	@FXML
	private Button bt8;
	@FXML
	private Button bt9;
	@FXML
	private Button sum;
	@FXML
	private Button div;
	@FXML
	private Button sub;
	@FXML
	private Button mul;
	@FXML
	private Button clear;
	@FXML
	private Button back;
	@FXML
	private Button equal;

	@FXML
	public void clearAction() {
		tela.clear();
	}

	@FXML
	public void equalAction() {
		y = Double.parseDouble(tela.getText());
		switch (op) {
		case "+":
			result = x + y;
			break;
		case "-":
			result = x - y;
			break;
		case "/":
			result = x / y;
			break;
		case "*":
			result = x * y;
			break;
		}

		tela.setText(String.format("%.2f", result));
		x = Double.parseDouble(tela.getText());
		y = 0;
		op = "";
		result = 0;
	}

	@FXML
	public void sumAction() {
		x = Double.parseDouble(tela.getText());
		tela.clear();
		op = "+";

	}

	@FXML
	public void divAction() {
		x = Double.parseDouble(tela.getText());
		tela.clear();
		op = "/";
	}

	@FXML
	public void subAction() {
		x = Double.parseDouble(tela.getText());
		tela.clear();
		op = "-";
	}

	@FXML
	public void mulAction() {
		x = Double.parseDouble(tela.getText());
		tela.clear();
		op = "*";

	}

	@FXML
	public void bt0Action() {
		tela.setText(tela.getText() + "0");

	}

	@FXML
	public void bt1Action() {
		tela.setText(tela.getText() + "1");

	}

	@FXML
	public void bt2Action() {
		tela.setText(tela.getText() + "2");

	}

	@FXML
	public void bt3Action() {
		tela.setText(tela.getText() + "3");

	}

	@FXML
	public void bt4Action() {
		tela.setText(tela.getText() + "4");

	}

	@FXML
	public void bt5Action() {
		tela.setText(tela.getText() + "5");

	}

	@FXML
	public void bt6Action() {
		tela.setText(tela.getText() + "6");

	}

	@FXML
	public void bt7Action() {
		tela.setText(tela.getText() + "7");

	}

	@FXML
	public void bt8Action() {
		tela.setText(tela.getText() + "8");

	}

	@FXML
	public void bt9Action() {
		tela.setText(tela.getText() + "9");

	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

}
