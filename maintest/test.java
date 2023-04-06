package maintest;

import java.util.Scanner;
public class test{
    public static void main(String[] args){
        
            Scanner scanner = new Scanner(System.in);
           int choice;
            do {
                System.out.println("1. Add bag type");
                System.out.println("2. Add handbag");
                System.out.println("3. Remove handbag");             
               choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter your choice1");
                        break;
                    case 2:
                    System.out.println("Enter your choice2");
                        break;
                    case 3:
                    System.out.println("Enter your choice3");
                        break;
                        case 4:
                        ////////////////////////////////
                        default:
                        System.exit(choice);
                }
                   
            } while (choice >4);
        }
    }
    


