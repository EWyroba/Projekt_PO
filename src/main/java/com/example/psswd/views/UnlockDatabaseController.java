package com.example.psswd.views;

import com.example.psswd.SceneController;
import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableStringValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

/**
 * Klasa obsługująca okno podania hasła do bazy danych
 */
public class UnlockDatabaseController {

    /**
     * Pole tekstowe do wpisania hasła
     */
    @FXML
    private PasswordField passwordField;

    /**
     * Zmienna przechowująca wpisane hasło
     */
    private SimpleStringProperty unlockPassword;

    /**
     * Funkcja ustawia zmienną unlockPassword na wartość podaną w argumencie
     * @param unlockPassword hasło do ustawienia [SimpleStringProperty]
     */
    public void setUnlockPassword(SimpleStringProperty unlockPassword) {
        this.unlockPassword = unlockPassword;
    }

    /**
     * Funkcja do zamykania okna wprowadzania hasła po kliknięciu przycisku "CANCEL"
     * @param actionEvent event wywołujący funkcję (kliknięcie CANCEL) [ActionEvent]
     */
    @FXML
    private void onCancelClick(ActionEvent actionEvent) {
        SceneController.destroyStage(actionEvent);
    }

    /**
     * Funkcja ustawiająca zmienną przechowującą hasło na wpisaną wartość po kliknięciu "UNLOCK"
     * @param actionEvent event wywołujący funkcję (kliknięcie UNLOCK) [ActionEvent]
     */
    @FXML
    private void onUnlockClick(ActionEvent actionEvent) {
        unlockPassword.set(passwordField.getText());
        SceneController.destroyStage(actionEvent);
    }



}
