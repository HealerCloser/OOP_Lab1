import javax.swing.*;

public class show2number {
    public static void main(String[] args) {
        String num1, num2;
        String noti = "you have just entered: ";

        num1 = JOptionPane.showInputDialog(null, "please input the first number:", "input the first number", JOptionPane.INFORMATION_MESSAGE);
        noti += num1 + " and ";
        num2 = JOptionPane.showInputDialog(null, "please input the first number:", "input the first number", JOptionPane.INFORMATION_MESSAGE);
        noti += num2;

        JOptionPane.showMessageDialog(null, noti, "show 2 number", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
