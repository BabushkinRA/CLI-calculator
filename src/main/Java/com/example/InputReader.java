package com.example;

import java.util.Scanner;

import com.example.exceptions.WrongOperationException;

public class InputReader {

    public  double[] readNumbers() {
        double[] nums = new double[2];
        Scanner sc = new Scanner(System.in);
        String ln1 = "";
        String ln2 = "";
        Boolean validInput = false;

        while (!validInput) { 
            System.out.println("Введите первое число: ");
            ln1 = sc.nextLine();
            System.out.println("Введите второе число: ");
            ln2 = sc.nextLine();

            if (Validator.isDouble(ln1) && Validator.isDouble(ln2)) {
                nums[0] = Double.parseDouble(ln1);
                nums[1] = Double.parseDouble(ln2);
                validInput = true;
            } else {
                System.out.println("Числа заданны не верно, попробуйте снова");
            }
            
        }
        
        return nums; 
    }
 
    public String readOperation() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Введите операцию (+, -, *, /, ^): ");
            String operation = sc.nextLine();

            try {
                Validator.validateOperation(operation);
                return operation;
            } catch (WrongOperationException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}