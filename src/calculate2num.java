import javax.swing.*;

public class calculate2num {
    public static void main(String[] args) {
        String strnum1, strnum2;
        String noti = "you have just entered: ";

        strnum1 = JOptionPane.showInputDialog(null, "please input the first number:", "input the first number", JOptionPane.INFORMATION_MESSAGE);
        noti += strnum1 + " and ";
        strnum2 = JOptionPane.showInputDialog(null, "please input the first number:", "input the first number", JOptionPane.INFORMATION_MESSAGE);
        noti += strnum2;
        double num1 = Double.parseDouble(strnum1);
        double num2 = Double.parseDouble(strnum2);
        noti += "\n Sum: " + Double.toString(num1 + num2);
        noti += "\n Difference: " + Double.toString(Math.abs(num1 - num2));
        noti += "\n Product: " + Double.toString(num1 * num2);
        if(num2 == 0){
            noti += "\n Quotient: Undefined";
        } else {
            noti += "\nQuotient: " + Double.toString(num1 / num2);
        }


        JOptionPane.showMessageDialog(null, noti, "show 2 number", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
