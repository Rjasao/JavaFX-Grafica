package gui;

import java.util.Locale;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewContoller {
	
	@FXML
	private TextField txtNumber1;
	
	@FXML
	private TextField txtNumber2;
	
	@FXML
	private Label labelResult;
	
	@FXML
	private Button btSum;
	
	@FXML 
	public void btSumAction() {
		Locale.setDefault(Locale.US);
		Double number1 = Double.parseDouble(txtNumber1.getText());
		Double number2 = Double.parseDouble(txtNumber2.getText());
		Double sum = number1 + number2;
		labelResult.setText(String.format("%.2f", sum));
	}
}
