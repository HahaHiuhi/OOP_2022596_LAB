import javax.swing.JOptionPane;

public class ChoosingOption2 {

public static void main(String[] args){

String[] choices = {"I do", "I don't"};
        int option = JOptionPane.showOptionDialog(
            null, 
            "Do you want to change to the first class ticket?", 
            " ", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            choices, 
            choices[0] 
        );



JOptionPane.showMessageDialog(null, "You've chosen:"
+ (option==JOptionPane.YES_OPTION?" I do": " I don't"));

System.exit(0);


}


}