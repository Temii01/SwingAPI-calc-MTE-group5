# SwingAPI-calc-MTE-group5


Calculator Program Explanation

*Importing Libraries*

The program starts by importing the necessary libraries:

```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
```

- `javax.swing.*`: This library provides classes for creating graphical user interfaces (GUIs) in Java, such as `JFrame`, `JPanel`, `JButton`, and `JTextField`.
- `java.awt.*`: This library provides classes for creating GUI components, such as `GridLayout` and `BorderLayout`.
- `java.awt.event.*`: This library provides classes for handling events, such as button clicks and key presses.

*Calculator Class*

The `Calculator` class implements the `ActionListener` interface, which provides a method for handling events:

```
public class Calculator implements ActionListener {
```

*GUI Components*

The program creates several GUI components:

- `JFrame frame`: The main window of the calculator.
- `JTextField textField`: The text field at the top of the calculator that displays the numbers and results.
- `JPanel panel`: The panel that holds the buttons.
- `JButton[] buttons`: An array of buttons that represent the digits and operators.

*Button Values and Operations*

The program defines an array of button values and an empty string to store the operation:

```
String[] buttonValues = {"7", "8", "9", "/",
                            "4", "5", "6", "*",
                            "1", "2", "3", "-",
                            "0", ".", "=", "+"};
String operation = "";
```

*Numbers and Result*

The program defines three variables to store the numbers and result:

```
double number1, number2, result;
```

*createGUI Method*

The `createGUI` method creates and configures the GUI components:

```
private void createGUI() {
    frame = new JFrame("Calculator");
    frame.setSize(300, 300);
    frame.setLayout(new BorderLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    textField = new JTextField();
    textField.setHorizontalAlignment(JTextField.RIGHT);
    frame.add(textField, BorderLayout.NORTH);

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(4, 4));
    buttons = new JButton[buttonValues.length];

    for (int i = 0; i < buttonValues.length; i++) {
        buttons[i] = new JButton(buttonValues[i]);
        buttons[i].addActionListener(this);
        panel.add(buttons[i]);
    }

    frame.add(panel, BorderLayout.CENTER);
    frame.setVisible(true);
}
```

This method:

1. Creates a new `JFrame` with the title "Calculator".
2. Sets the size of the frame to 300x300 pixels.
3. Sets the layout of the frame to `BorderLayout`.
4. Sets the default close operation of the frame to `EXIT_ON_CLOSE`.
5. Creates a new `JTextField` and sets its horizontal alignment to right.
6. Adds the text field to the north region of the frame.
7. Creates a new `JPanel` and sets its layout to `GridLayout` with 4 rows and 4 columns.
8. Creates an array of `JButton`s and adds each button to the panel.
9. Adds the panel to the center region of the frame.
10. Makes the frame visible.

*actionPerformed Method*

The `actionPerformed` method handles events triggered by button clicks:

```
public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand();

    if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
        number1 = Double.parseDouble(textField.getText());
        operation = command;
        textField.setText("");
    } else if (command.equals("=")) {
        number2 = Double.parseDouble(textField.getText());
        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        }
        textField.setText(String.valueOf(result));
    } else {
        textField.setText(textField.getText() + command);
    }
}
```

This method:

1. Gets the command associated with the event.
2. Checks if the command is an operator (+, -, *, /).
3. If it's an operator, parses the current text in the text field as a double and stores it in `number1`.
4. Stores the operator in the `operation` variable.
5. Clears the text field.
6. If the command is "=", parses the current text in the text field as a double and stores it in `number2`.
7. Performs the calculation based on the operator and stores the result.



*System Requirements*

- Java Development Kit (JDK) 8 or later
- Java Runtime Environment (JRE) 8 or later
- Operating System: Windows, macOS, or Linux
- RAM: 128 MB or more
- Disk Space: 100 MB or more

*Software Installation*

1. Download and install the JDK from the Oracle website: https://www.oracle.com/java/technologies/javase-downloads.html
2. Download and install a Java IDE (Integrated Development Environment) such as Eclipse or NetBeans: https://www.eclipse.org/downloads/ or https://netbeans.apache.org/download/index.html
3. Create a new Java project in your IDE and copy the calculator code into the project.
4. Compile and run the program using the IDE.


*Running the Application*

To run the application, follow these steps:

1. Save the code in a file called `Calculator.java`.
2. Open a terminal or command prompt and navigate to the directory where you saved the file.
3. Compile the code using the command `javac Calculator.java`.
4. Run the application using the command `java Calculator`.
5. A window will appear with a text field at the top and a grid of buttons below.
6. Enter numbers and operations using the buttons, and the result will be displayed in the text field.

Note: Make sure you have the JDK and JRE installed on your system, and the Java IDE is properly configured to run Java programs.




