package com.company;
import java.util.Scanner;

public class Main {

    static void summation(int n1,int n2){
        System.out.println("Answer is " +(n1+n2));
    }
    static void substraction(int n1,int n2){
        System.out.println("Answer is " +(n1-n2));
    }
    static void multiply(int n1,int n2){
        System.out.println("Answer is " +(n1*n2));
    }
    static void divide(int n1,int n2){
        System.out.println("Answer is " +(n1/n2));
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to do?\n\nPress num 1 for summation\nPress num 2 for subtraction\nPress num 3 for multiplication\nPress num 4 for divide ");
        System.out.println("Press your option : "  );
        int operator = scanner.nextInt();
        System.out.println("Enter the number 1: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the number 2 : ");
        int n2 = scanner.nextInt();

        switch (operator){
            case 1:
                summation(n1,n2);
                break;
            case 2:
                substraction(n1,n2);
                break;
            case 3:
                multiply(n1,n2);
                break;
            case 4:
                divide(n1,n2);
                break;
            default:
                System.out.println("Invalid operator!!");
        }
    }
}