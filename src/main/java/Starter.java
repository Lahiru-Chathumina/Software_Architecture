import Config.AppModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {
    public static void Main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        Injector injector = Guice.createInjector(new AppModule());
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Home.fxml"));

        fxmlLoader.setControllerFactory(injector::getInstance);

        stage.setScene(new Scene(fxmlLoader.load()));
        stage.show();


    }
}
