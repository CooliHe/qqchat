package Main;

import Controller.Controller;
import javafx.application.Application;
import javafx.stage.Stage;
/**
 * @author CooliHe
 * For：QQ实时聊天程序 Main方法体
 * Time：7.18
 */
public class Main extends Application {

    @Override
    public void start(Stage window) throws Exception{
        new Controller().exec();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
