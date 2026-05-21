package org.example;

// Importación de clases necesarias de JavaFX
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Clase principal que hereda de Application
public class Main extends Application {

    // Método que inicia la interfaz gráfica
    @Override
    public void start(Stage stage) {

        // Campo de texto para introducir el nombre
        TextField txtNombre = new TextField();

        // Texto guía dentro del campo
        txtNombre.setPromptText(
                "Ingrese su nombre"
        );

        // Campo de texto para introducir el correo
        TextField txtCorreo = new TextField();

        // Texto guía del correo
        txtCorreo.setPromptText(
                "Ingrese su correo"
        );

        // Etiqueta que mostrará errores o mensajes
        Label lblError = new Label();

        // Crear botón validar
        Button btnValidar =
                new Button("Validar");

        // Evento que ocurre al pulsar el botón
        btnValidar.setOnAction(e -> {

            // Limpiar mensaje anterior
            lblError.setText("");

            // trim() elimina espacios al inicio y final
            // isEmpty() comprueba si está vacío
            if (txtNombre.getText()
                    .trim().isEmpty()
                ||
                txtCorreo.getText()
                    .trim().isEmpty()) {

                // Mostrar mensaje de error
                lblError.setText(
                    "Error: Todos los campos son obligatorios"
                );

            } else {

                // Mostrar mensaje correcto
                lblError.setText(
                    "Formulario válido"
                );
            }
        });

        // Crear VBox con separación de 10 píxeles
        VBox root = new VBox(10);

        // Añadir márgenes internos
        root.setPadding(new Insets(15));

        // Agregar componentes al contenedor
        root.getChildren().addAll(

                // Etiqueta Nombre
                new Label("Nombre:"),

                // Campo nombre
                txtNombre,

                // Etiqueta correo
                new Label("Correo:"),

                // Campo correo
                txtCorreo,

                // Botón validar
                btnValidar,

                // Etiqueta para mensajes
                lblError
        );

        // Crear escena
        Scene scene =
                new Scene(root, 350, 250);

        // Configurar ventana
        stage.setTitle(
                "Formulario JavaFX"
        );

        stage.setScene(scene);

        // Mostrar ventana
        stage.show();
    }

    // Método principal que inicia aplicación
    public static void main(String[] args) {
        launch(args);
    }
}
