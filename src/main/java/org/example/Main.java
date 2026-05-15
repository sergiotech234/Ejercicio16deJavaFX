package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        // Campos de texto
        TextField txtNombre = new TextField();
        txtNombre.setPromptText("Ingrese su nombre");

        TextField txtCorreo = new TextField();
        txtCorreo.setPromptText("Ingrese su correo");

        // Etiqueta para errores
        Label lblError = new Label();

        // Botón
        Button btnValidar = new Button("Validar");

        // Evento del botón
        btnValidar.setOnAction(e -> {

            // Limpiar mensaje anterior
            lblError.setText("");

            if (txtNombre.getText().trim().isEmpty() ||
                    txtCorreo.getText().trim().isEmpty()) {

                lblError.setText("Error: Todos los campos son obligatorios");
            } else {
                lblError.setText("Formulario válido");
            }
        });

        VBox root = new VBox(10);
        root.setPadding(new Insets(15));
        root.getChildren().addAll(
                new Label("Nombre:"),
                txtNombre,
                new Label("Correo:"),
                txtCorreo,
                btnValidar,
                lblError
        );

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("Formulario JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}