package calculator;

public class Memory {
    String operation;
    int firstArgument;
    int secondArgument;
    int result;

    public Memory(String operation, int firstArgument, int secondArgument, int result) {
        this.operation = operation;
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
        this.result = result;
    }
}
