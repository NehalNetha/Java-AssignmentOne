
package assignmentOne;
import java.util.Scanner;



class Main {
    public static void main(String[] args){

        while(true){
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Do you wanna work with 1.Arrays? 2.Numbers");
            String operation = myObj.nextLine();

            switch (operation) {
                case "end":
                    break;
                case "1":
                    UserInput input = new UserInput();
                    input.input();
                case "2":
                    calculator cal = new calculator();
                    cal.cal();
                    
            }

        }
    }

   
}