import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {

        String name = "";
        boolean isvalid = false;


        while (isvalid == false){
            name = JOptionPane.showInputDialog("Enter your full name ");
            if (name == null) System.exit(0);
            name = name.trim();

            if (name.contains(" ")){
                isvalid = true;
            }else {
                JOptionPane.showInputDialog(null,
                        "Please Enter again.");
            }
        }
        int spaceindex = name.indexOf(" ");

        String firstname = name.substring(0, spaceindex);
        String lastname = name.substring(spaceindex + 1);

        String formfirstname = firstname.substring(0, 1).toUpperCase() + firstname.substring(1).toLowerCase();
        String formlastname = lastname.toUpperCase();

        String form = formfirstname + " " + formlastname;

        JOptionPane.showMessageDialog(null, "Welcome," + form);
    }
}