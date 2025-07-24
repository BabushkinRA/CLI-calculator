public class Сalculator {
    public static void main {
        CalculatorEngine ce = new CalculatorEngine;
        InputReader ir = new InputReader;
        ResultOnDisplay rod = new ResultOnDisplay;

        int[] nums = ir.readNumbers;
        String operation = ir.readOperation;
        
        try {
            switch (operation) {
                case '+':
                    rod.showResult(ce.sum(nums));
                    break
                case '-':
                    rod.showResult(ce.sum(nums));
                    break
                case '*':
                    rod.showResult(ce.sum(nums));
                    break
                case '/':
                    rod.showResult(ce.sum(nums));
                    break
            }
        } catch (ZeroDevExeption e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Спасибо за использование нашего калькулятора ;)")
        }
    }
}
