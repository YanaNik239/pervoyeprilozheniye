package app;
import io.github.humbleui.jwm.*;
import java.util.function.Consumer;

/**
 * Класс окна приложения
 */
public class Application  implements Consumer<Event> {
    /**
     * окно приложения
     */
    private final Window window;

    /**
     * Конструктор окна приложения
     */
    public Application() {
        window = App.makeWindow();
        window.setEventListener(this);
        window.setWindowSize(900, 900);
        window.setWindowPosition(100, 100);
        window.setVisible(true);
        window.setTitle("Java 2D");
    }

    /**
     * Обработчик событий
     *
     * @param e событие
     */
    @Override
    public void accept(Event e) {
        if (e instanceof EventWindowClose) {
            App.terminate();
        }else if (e instanceof EventWindowCloseRequest) {
            window.close();
        }
    }
}
