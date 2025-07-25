import java.util.Scanner;

public class InputReader {
    public  int[] readNumbers() {
        int[] nums = new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        nums[0] = sc.nextInt();
        System.out.println("Введите второе число: ");
        nums[1] = sc.nextInt();
        return nums; 
    }
 
    public String readOperation() {
    Scanner sc = new Scanner(System.in);
    String operation;
    
    do {
        System.out.println("Введите операцию (+, -, *, /): ");
        operation = sc.nextLine().trim();
        
        if (!operation.equals("+") && !operation.equals("-") && 
            !operation.equals("*") && !operation.equals("/")) {
            System.out.println("Неверная операция! Попробуйте снова.");
        }
    } while (!operation.equals("+") && !operation.equals("-") && 
             !operation.equals("*") && !operation.equals("/"));
    
    sc.close();
    return operation;
    }
}