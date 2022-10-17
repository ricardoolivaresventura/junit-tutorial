import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class Calculator2Test {

    public int nbErrors = 0;
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        assertEquals(60, result, 0);
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
