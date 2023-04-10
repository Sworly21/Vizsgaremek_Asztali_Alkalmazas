module com.example.vizsgaremek_asztali_alkalmazas {
    requires javafx.controls;
    requires javafx.fxml;


    opens Vizsgaremek_asztali_alkalmazas_pack to javafx.fxml;
    exports Vizsgaremek_asztali_alkalmazas_pack;
}