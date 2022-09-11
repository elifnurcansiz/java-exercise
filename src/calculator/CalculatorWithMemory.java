package calculator;

import java.util.ArrayList;
import java.util.List;

public class CalculatorWithMemory {
    private List<Memory> memory = new ArrayList<>();

    public CalculatorWithMemory() {

    }

    public int operate(String operation, int firstArgument, int lastArgument) {
        int result;

        switch (operation) {
            case "add":
                result = this.add(firstArgument, lastArgument);
                break;
            case "divide":
                result = this.divide(firstArgument, lastArgument);
                break;
            case "multiply":
                result = this.multiply(firstArgument, lastArgument);
                break;

            default:
                System.out.println("Wrong operation");
                throw new RuntimeException("Wrong operation defined");
        }

        this.addMemory(new Memory(operation, firstArgument, lastArgument, result));

        return result;
    }

    private int add(int firstArgument, int lastArgument) {
        return firstArgument + lastArgument;
    }

    private int divide(int firstArgument, int lastArgument) {
        return firstArgument / lastArgument;
    }

    private int multiply(int firstArgument, int lastArgument) {
        return firstArgument * lastArgument;
    }

    private void addMemory(Memory memory1) {
        this.memory.add(memory1);
    }

    public List<Memory> getMemory() {
        return memory;
    }
}
