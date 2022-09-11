package calculator;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory();

        int result1 = calculator.operate("add", 4, 5);
        int result2 = calculator.operate("divide", 8, 4);
        int result3 = calculator.operate("multiply", 3, 6);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        for (Memory memory : calculator.getMemory()) {
            System.out.println(memory.operation);
            System.out.println(memory.firstArgument);
            System.out.println(memory.secondArgument);
            System.out.println(memory.result);
        }

    }
}
