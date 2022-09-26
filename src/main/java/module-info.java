module com.example.t22inf {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.t22inf to javafx.fxml;
    exports com.example.t22inf;
}