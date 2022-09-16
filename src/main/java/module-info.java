module com.example.promocaojava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.promocaojava to javafx.fxml;
    exports com.example.promocaojava;
}