package com.example;

import com.example.exceptions.WrongOperationException;

public class Validator {

    public void validateOperation(String operation) throws WrongOperationException {
        if (!operation.equals("+") && !operation.equals("-")
            && !operation.equals("*") && !operation.equals("/")) {
            throw new WrongOperationException("Неверная операция, введите заново");
        }
    }

    public static boolean isDouble(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
