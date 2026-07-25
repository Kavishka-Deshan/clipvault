module com.clipcycle {
    requires javafx.controls;
    requires javafx.fxml;

    // Let JavaFX reflectively access these packages (needed for FXML loading)
    opens com.clipcycle to javafx.fxml;

    exports com.clipcycle;
    exports com.clipcycle.model;
}

