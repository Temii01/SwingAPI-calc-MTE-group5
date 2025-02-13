import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {

    private JTextField textField;
    private double number1, number2, result;
    private char operation;

    public Calculator() {
        super("Simple Calculator");
        setLayout(new BorderLayout());

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        add(panel, BorderLayout.CENTER);

        String[] buttons = {"7", "8", "9", "/",
                              "4", "5", "6", "*",
                              "1", "2", "3", "-",
                              "0", ".", "=", "+"};

        for (String button : buttons) {
            JButton jButton = new JButton(button);
            jButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();
                    if (command.equals("+") || command.equals("-") ||
                            command.equals("*") || command.equals("/")) {
                        number1 = Double.parseDouble(textField.getText());
                        operation = command.charAt(0);
                        textField.setText("");
                    } else if (command.equals("=")) {
                        number2 = Double.parseDouble(textField.getText());
                        switch (operation) {
                            case '+':
                                result = number1 + number2;
                                break;
                            case '-':
                                result = number1 - number2;
                                break;
                            case '*':
                                result = number1 * number2;
                                break;
                            case '/':
                                result = number1 / number2;
                                break;
                        }
                        textField.setText(String.valueOf(result));
                    } else {
                        textField.setText(textField.getText() + command);
                    }
                }
            });
            panel.add(jButton);
        }

        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
