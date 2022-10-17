class Calculator2Test {

    public int nbErrors = 0;

    public void testAdd() {
        Calculator2 calculator = new Calculator2();
        double result = calculator.add(10, 50);

        if (result != 60) {
            throw new IllegalStateException("Mal resultado: " + result);
        }
    }
}
public class Calculator2 {
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {
        Calculator2Test test = new Calculator2Test();
        try {
            test.testAdd();
        }
        catch (Throwable e) {
            test.nbErrors++;
            e.printStackTrace();
        }
        if (test.nbErrors > 0) {
            throw new IllegalStateException("Hay " + test.nbErrors + " error(s)");
        }
    }
}
