package mvc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import mvc.controller.Controller;
import mvc.model.ManageSystem;
import mvc.view.MainView;

public class Entry extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        ManageSystem manageSystem = new ManageSystem();
        MainView mainView = new MainView();
        Controller controller = new Controller(manageSystem,mainView);
        primaryStage.setScene(new Scene(controller.getView()));
        primaryStage.show();
    }
}
