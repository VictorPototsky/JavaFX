package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;

public class HelloController {

    @FXML
    private TextField inputField;

    @FXML
    private Button sendButton;

    @FXML
    private TextArea chatField;

    @FXML
    void initialize() {
        assert inputField != null : "fx:id=\"inputField\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert sendButton != null : "fx:id=\"sendButton\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert chatField != null : "fx:id=\"textArea\" was not injected: check your FXML file 'hello-view.fxml'.";

    }
    @FXML
    void checkEnterButton(KeyEvent event) {
        if (event.getCode().getName().equals("Enter")){
            onButtonClick();
        }

    }

    @FXML
    void onButtonClick() {

//        chatField.setEditable(false);
        String message = inputField.getText().trim();
        if (!message.isBlank()) {
            chatField.appendText(message);
            chatField.appendText("\n");
            inputField.clear();
        }

    }
}