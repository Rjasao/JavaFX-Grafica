package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewContoller {

	@FXML
	private Button btTest;
	
	@FXML
	public void btTestAction() {
		System.out.println("Clique");
	}
	
}
