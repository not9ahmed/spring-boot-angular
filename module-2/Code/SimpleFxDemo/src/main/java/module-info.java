module com.example.simplefxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.simplefxdemo to javafx.fxml;
    exports com.example.simplefxdemo;
}