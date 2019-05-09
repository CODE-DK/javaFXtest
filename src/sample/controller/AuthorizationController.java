package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * контроллер для страницы авторизации
 *
 * @author dkom91
 */
public class AuthorizationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button singInButton;

    @FXML
    private Button registrationButton;

    @FXML
    void initialize() {
        singInButton.setOnAction(event -> {
            System.out.println("sing in button");
        });
        registrationButton.setOnAction(event -> {
            System.out.println("registration button");
        });
    }
}
