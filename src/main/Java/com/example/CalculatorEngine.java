package com.example;

import com.example.exceptions.ZeroDevException;

public class CalculatorEngine {
    private double sum (double[] nums) {
        return nums[0] + nums[1];
    }

    private double dec (double[] nums) {
        return nums[0] - nums[1];
    }

    private double multiply (double[] nums) {
        return nums[0] * nums[1];
    }

    private double devide (double[] nums) throws ZeroDevException{
        if (nums[1] != 0) {
            double answer = nums[0] / nums[1];
            return answer;
        }
        else {
            throw new ZeroDevException("Делить на ноль нельзя");
        }
    }

    public double solve (double[] nums, String operation) {
        double answer = 0;

        switch (operation) {
        case "+" -> answer = this.sum(nums);
        case "-" -> answer = this.dec(nums);
        case "*" -> answer = this.multiply(nums);
        case "/" -> {
            try {
                answer = this.devide(nums);
            } catch (ZeroDevException e) {
                System.out.println(e.getMessage());
            }
            }
        }

        return answer;
    }
}