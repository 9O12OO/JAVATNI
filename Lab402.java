import javax.swing.*;

public class Lab402 {
    static void main() {
        String major = "";
        String id = JOptionPane.showInputDialog("Enter student-id ");


        if (id.length() != 10){
            JOptionPane.showMessageDialog(null,"");
        }


        String code = id.substring(2,5);

        switch (code){
            case "131": major = "Information Technology (IT)";
            break;

            case "132": major = "Multimedia Technology (MT)";
            break;

            case "133": major = "Digital Business Information Technology (BI)";
            break;

            case "134": major = "Digital Technology in Mass Communication (DC)";
            break;

            case "135": major = "Data Science and Data Analytics (DS)";
            break;

            default: major = "Cannot found major";
            break;
        }
        JOptionPane.showMessageDialog(null,"Student ID: " + id + "\nMajor: " + major);
    }
}
