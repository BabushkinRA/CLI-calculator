import java.util.Scanner;

import exceptions.WrongOperationException;

public class InputReader {

    public  double[] readNumbers() {
        double[] nums = new double[2];
        Scanner sc = new Scanner(System.in);
        String ln1 = "";
        String ln2 = "";
        do {
            System.out.println("Введите первое число: ");
            ln1 = sc.nextLine();
            System.out.println("Введите второе число: ");
            ln2 = sc.nextLine();
            nums[0] = Double.parseDouble(ln1);
            nums[1] = Double.parseDouble(ln2);
        } while (!(Validator.isDouble(ln1) && Validator.isDouble(ln2)));

        return nums; 
    }
 
    public String readOperation() {
        Scanner sc = new Scanner(System.in);
        Validator v = new Validator();

        while (true) {
            System.out.println("Введите операцию (+, -, *, /): ");
            String operation = sc.nextLine();

            try {
                v.validateOperation(operation);
                return operation;
            } catch (WrongOperationException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}