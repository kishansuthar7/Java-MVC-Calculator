package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controller implements ActionListener {

    private final Models cm;
    private final Views cv;

    public Controller(Models cm, Views cv) {
        this.cm = cm;
        this.cv = cv;

        cv.add.addActionListener(this);
        cv.sub.addActionListener(this);
        cv.mul.addActionListener(this);
        cv.div.addActionListener(this);
        cv.perc.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(cv.txta.getText().trim());
            double b = Double.parseDouble(cv.txtb.getText().trim());

            double r;

            if (e.getSource() == cv.add) {
                r = cm.add(a, b);
            } else if (e.getSource() == cv.sub) {
                r = cm.subtract(a, b);
            } else if (e.getSource() == cv.mul) {
                r = cm.multiply(a, b);
            } else if (e.getSource() == cv.div) {
                r = cm.divide(a, b);
            } else if (e.getSource() == cv.perc) {
                r = cm.percentage(a, b);
            } else {
                return;
            }

            cv.txtresult.setText(String.valueOf(r));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                cv,
                "Please enter valid numbers in both fields.",
                "Invalid Input",
                JOptionPane.ERROR_MESSAGE
            );
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(
                cv,
                ex.getMessage(),
                "Calculation Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
