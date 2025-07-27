package com.example;

public class Calculator {
    public static void main(String[] args) {

        InputReader ir = new InputReader();
        ResultOnDisplay rod = new ResultOnDisplay();
        while (true) {
            double[] nums = ir.readNumbers();
            String operation = ir.readOperation();
        
            rod.showResult(CalculatorEngine.solve(nums, operation));
        }
    }
}
