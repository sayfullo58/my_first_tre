import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class home_work {
    public static void main(String[] args) {
        //1
     String myFirstProblem;
     //2
     final int NUM = 7;
     //3
     String word = "hi";
     //4
     myFirstProblem = NUM+word;
     //5
        System.out.println("myFirstProblem="+myFirstProblem );
        System.out.println("NUM =" + NUM);
        System.out.println("word="+ word);
//
        if (NUM<0) {
            System.out.println(-3);}
else if (NUM>0){
            System.out.println(6);
        }
else {
            String number = "0";
        }
        //ввод имени
        System.out.print("ваше имя:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("привет," +name+"!");
        scanner.close();
    }
}
