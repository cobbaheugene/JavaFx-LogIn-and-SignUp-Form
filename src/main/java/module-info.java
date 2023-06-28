module com.javafxproject.javafx_login_and_signup_form {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafxproject.javafx_login_and_signup_form to javafx.fxml;
    exports com.javafxproject.javafx_login_and_signup_form;
}