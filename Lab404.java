import java.util.Scanner;

public class Lab404 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        String word = "";
        String sentence = "";

        while (true){
            System.out.print("Enter word: ");
            word = scan.next();
            if (word.equalsIgnoreCase("stop")){
                break;
            }
            sentence = sentence + word+" " ;
        }
        System.out.print(sentence);
    }
}
