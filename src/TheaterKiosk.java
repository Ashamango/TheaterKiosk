import java.util.Scanner;

public class TheaterKiosk { // class TheaterKiosk
    public static void main(String[] args) { // main
            Scanner in = new Scanner(System.in);
            int WRIST_BAND = 21; // num WRIST_BAND = 21

            // Prompt and input
            System.out.print("Please enter your age:  "); // output "Please enter your age: "
            int age = in.nextInt(); // input age

            if(age >=WRIST_BAND) //if age>= WRIST_BAND then
            {
                System.out.print("You get a wrist band."); // output "You get a wrist band."
                in.nextLine();
            } // endif
        } // return
    } // end class


