package assignmentOne;

import java.util.Scanner;


public class calculator {
    
    public void cal() {



        while(true){
            System.out.println(">");

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter the operation");

            String operation = myObj.nextLine();


        
            
            Scanner myObjOne = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter the input one: ");
            String numberOne = myObjOne.nextLine();

            Scanner myObjTwo = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter the input one: ");
            String numberTwo = myObjTwo.nextLine();


            //adding logic to perform the operation that user wants

            switch (operation) {
                case "addition":
                    int add = Integer.parseInt(numberOne) +Integer.parseInt(numberTwo) ;
                    System.out.println(add);
                case "subtraction":
                    int sub = Integer.parseInt(numberOne) - Integer.parseInt(numberTwo) ;
                    System.out.println(sub);
                case "multiplication":
                    int multi = Integer.parseInt(numberOne) * Integer.parseInt(numberTwo) ;
                    System.out.println(multi);
                case "division":
                    int div = Integer.parseInt(numberOne) / Integer.parseInt(numberTwo) ;
                    System.out.println(div);
            }

        }
    }
      
    }

