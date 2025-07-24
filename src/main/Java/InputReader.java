
import java.util.Scanner;

public class InputReader {
    public int[] readNumbers() {
        int[] nums = new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        nums[0] = sc.nextInt();
        System.out.println("Введите второе число: ");
        nums[1] = sc.nextInt();
        return nums; 
    }
}