package Calculator;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Models model = new Models();
            Views view = new Views();
            new Controller(model, view);
        });
    }
}
