import exceptions.ZeroDevException;

public class Calculator {
    public static void main(String[] args) {
        CalculatorEngine ce = new CalculatorEngine();
        InputReader ir = new InputReader();
        ResultOnDisplay rod = new ResultOnDisplay();

        int[] nums = ir.readNumbers();
        String operation = ir.readOperation();
        switch (operation) {
        case "+" -> rod.showResult(ce.sum(nums));
        case "-" -> rod.showResult(ce.dec(nums));
        case "*" -> rod.showResult(ce.multiply(nums));
        case "/" -> {
            try {
                rod.showResult(ce.devide(nums));
            } catch (ZeroDevException e) {
                System.out.println(e.getMessage());
            }
            }
        }

    }
}
