module com.example.weatherapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires org.json;

    opens com.example.weatherapp to javafx.fxml;
    exports com.example.weatherapp;
}
