package convertTemperatureUnits;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UserInterface extends Application
{
    private LayoutPane layout = new LayoutPane();
    public void start(Stage stage)
    {
        stage.setTitle("Temperature Conversion Calculator");
        Scene scene = new Scene(layout.getPaneForLayout(),400,400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
