package mvc.view;

import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class MainView extends VBox {

    private TextField id_input;
    private TextField name_input;
    private CheckBox attend_input;
    private Button submit;
    private TextArea info;

    public MainView() {

        submit = new Button("Submit");
        Label id = new Label("Id Input:");
        id_input = new TextField();
        Label name = new Label("Name Input:");
        name_input = new TextField();
        Label attend = new Label("Attend Input:");
        attend_input = new CheckBox();
        info = new TextArea();
        info.setDisable(true);
        this.getChildren().addAll(
                id, id_input,
                name, name_input,
                attend, attend_input,
                submit, info);
        setup();

    }

    public TextField getId_input() {
        return id_input;
    }

    public TextField getName_input() {
        return name_input;
    }

    public CheckBox getAttend_input() {
        return attend_input;
    }

    public Button getSubmit() {
        return submit;
    }

    public TextArea getInfo() {
        return info;
    }

    private void setup() {
        this.getStylesheets().add("mvc/view/style.css");
    }
}
