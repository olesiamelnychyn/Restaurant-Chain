package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;

public class empController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txt_fname;

    @FXML
    private ComboBox<?> cmbox_pos;

    @FXML
    private Button btn_back;

    @FXML
    private Button btn_add;

    @FXML
    private Button btn_delete;

    @FXML
    private Button btn_undo;

    @FXML
    private SplitMenuButton btn_export;

    @FXML
    private Button btn_help;

    @FXML
    private Tooltip tool_tip;

    @FXML
    private TextField txt_lname;

    @FXML
    private ComboBox<?> cmbox_rest;

    @FXML
    private ImageView img_view;

    @FXML
    private RadioButton rbtn_male;

    @FXML
    private RadioButton rbtn_female;

    @FXML
    void initialize() {
        assert txt_fname != null : "fx:id=\"txt_fname\" was not injected: check your FXML file 'empWindow.fxml'.";
        assert cmbox_pos != null : "fx:id=\"cmbox_pos\" was not injected: check your FXML file 'empWindow.fxml'.";
        assert btn_back != null : "fx:id=\"btn_back\" was not injected: check your FXML file 'empWindow.fxml'.";
        assert btn_add != null : "fx:id=\"btn_add\" was not injected: check your FXML file 'empWindow.fxml'.";
        assert btn_delete != null : "fx:id=\"btn_delete\" was not injected: check your FXML file 'empWindow.fxml'.";
        assert btn_undo != null : "fx:id=\"btn_undo\" was not injected: check your FXML file 'empWindow.fxml'.";
        assert btn_export != null : "fx:id=\"btn_export\" was not injected: check your FXML file 'empWindow.fxml'.";
        assert btn_help != null : "fx:id=\"btn_help\" was not injected: check your FXML file 'empWindow.fxml'.";
        assert tool_tip != null : "fx:id=\"tool_tip\" was not injected: check your FXML file 'empWindow.fxml'.";
        assert txt_lname != null : "fx:id=\"txt_lname\" was not injected: check your FXML file 'empWindow.fxml'.";
        assert cmbox_rest != null : "fx:id=\"cmbox_rest\" was not injected: check your FXML file 'empWindow.fxml'.";
        assert img_view != null : "fx:id=\"img_view\" was not injected: check your FXML file 'empWindow.fxml'.";
        assert rbtn_male != null : "fx:id=\"rbtn_male\" was not injected: check your FXML file 'empWindow.fxml'.";
        assert rbtn_female != null : "fx:id=\"rbtn_female\" was not injected: check your FXML file 'empWindow.fxml'.";

    }
}
