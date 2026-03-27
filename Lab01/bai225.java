package Lab01;

import javax.swing.JOptionPane;

public class bai225 {
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number:", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number:", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        String quotientStr;
        if (num2 == 0) {
            quotientStr = "Cannot divide by zero (Không thể chia cho 0)";
        } else {
            quotientStr = String.valueOf(num1 / num2);
        }

        String result = "First number: " + num1 + " | Second number: " + num2 + "\n\n"
                + "Sum (+): " + sum + "\n"
                + "Difference (-): " + difference + "\n"
                + "Product (*): " + product + "\n"
                + "Quotient (/): " + quotientStr;

        JOptionPane.showMessageDialog(null, result,
                "Calculation Results", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}