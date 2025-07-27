package com.example;

import com.example.exceptions.ZeroDevException;

public class CalculatorEngine {
    private static double sum (double[] nums) {
        return nums[0] + nums[1];
    }

    private static double dec (double[] nums) {
        return nums[0] - nums[1];
    }

    private static double multiply (double[] nums) {
        return nums[0] * nums[1];
    }

    private static double devide (double[] nums) throws ZeroDevException{
        if (nums[1] != 0) {
            double answer = nums[0] / nums[1];
            return answer;
        }
        else {
            throw new ZeroDevException("Делить на ноль нельзя");
        }
    }

    private static double exponentiation (double[] nums) {
        return Math.pow(nums[0], nums[1]);
    }

    public static double solve (double[] nums, String operation) {
        double answer = 0;

        switch (operation) {
        case "+" -> answer = sum(nums);
        case "-" -> answer = dec(nums);
        case "*" -> answer = multiply(nums);
        case "/" -> {
            try {
                answer = devide(nums);
            } catch (ZeroDevException e) {
                System.out.println(e.getMessage());
            }
            }
        case "^" -> answer = exponentiation(nums);
        }

        return answer;
    }
}