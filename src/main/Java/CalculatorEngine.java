import exceptions.ZeroDevException;

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

    public double devide (int[] nums) throws ZeroDevException{
        if (nums[1] != 0) {
            double answer = nums[0] / nums[1];
            return answer;
        }
        else {
            throw new ZeroDevException("Делить на ноль нельзя");
        }
    }
}