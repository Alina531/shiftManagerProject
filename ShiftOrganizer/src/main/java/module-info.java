module com.example.shiftorganizer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.shiftorganizer to javafx.fxml;
    exports com.example.shiftorganizer;
}