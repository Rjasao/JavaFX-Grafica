package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewContoller {

	@FXML
	private Button btTest;
	
	@FXML 
	public void btTestAction() {
		//System.out.println("Clique");
		Alerts.showAlert("Ricardo", "Proibido fumar", "Boa tarde", AlertType.INFORMATION);
	}
}
