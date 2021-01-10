module com.mycompany.tableview {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.tableview to javafx.fxml;
    exports com.mycompany.tableview;
}
