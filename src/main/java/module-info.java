module com.example.ejercicio2examen2evdi {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ejercicio2examen2evdi to javafx.fxml;
    exports com.example.ejercicio2examen2evdi;
}