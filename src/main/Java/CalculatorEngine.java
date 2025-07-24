public class CalculatorEngine {
    public int sum (int[] nums) {
        return nums[0] + nums[1];
    }

    public int dec (int[] nums) {
        return nums[0] - nums[1];
    }

    public int multiply (int[] nums) {
        return nums[0] * nums[1];
    }

    public int devide (int[] nums) t {
        if (nums[1] != 0) {
            return nums[0] * nums[1];
        }
        else {
            System.out.println("Делить на 0 нельзя");
        }
    }
}