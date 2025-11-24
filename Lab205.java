import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {



       int minutes = Integer.parseInt(
               JOptionPane.showInputDialog("Input minutes"));

        int Hour = 60;
       int Total_hour = minutes / Hour;
       int minutes_1 = minutes%60;

        JOptionPane.showMessageDialog(null,
        minutes + " minutes is " + Total_hour + " hour " + minutes_1 + " minute");
    }

}
