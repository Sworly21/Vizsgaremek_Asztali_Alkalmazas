package Vizsgaremek_asztali_alkalmazas_pack;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void loginButtonClicked() {
        String username = usernameTextField.getText();
        String password = passwordField.getText();

        if (username.equals("admin") && password.equals("admin123")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sikeres bejelentkezés");
            alert.setHeaderText(null);
            alert.setContentText("Sikeres bejelentkezés!");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hibás adatok");
            alert.setHeaderText(null);
            alert.setContentText("Hibás felhasználónév vagy jelszó!");
            alert.showAndWait();
        }

    }

}






