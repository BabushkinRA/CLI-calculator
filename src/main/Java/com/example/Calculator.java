package com.example;

public class Calculator {
    public static void main(String[] args) {
        CalculatorEngine ce = new CalculatorEngine();
        InputReader ir = new InputReader();
        ResultOnDisplay rod = new ResultOnDisplay();
        while (true) {
            double[] nums = ir.readNumbers();
            String operation = ir.readOperation();
        
            rod.showResult(ce.solve(nums, operation));
        }
    }
}
