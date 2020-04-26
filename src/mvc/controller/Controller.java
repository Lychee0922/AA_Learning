package mvc.controller;

import mvc.model.ManageSystem;
import mvc.view.MainView;

public class Controller {
    private ManageSystem model;
    private MainView view;

    public Controller(ManageSystem model, MainView view) {
        this.model = model;
        this.view = view;
        this.view.getInfo().setText(this.model.allStudents());
    }

    public ManageSystem getModel() {
        return model;
    }

    public MainView getView() {
        return view;
    }

    //TODO link CRUD operation to VIEW
}
