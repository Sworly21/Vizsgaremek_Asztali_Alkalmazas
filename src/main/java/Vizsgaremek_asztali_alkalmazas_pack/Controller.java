package Vizsgaremek_asztali_alkalmazas_pack;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onBejelentkezesButtonClick() {

        welcomeText.setText("Üdvözöljük!");
    }
}