import org.example.Main;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class MyTests {


    private  Main main;

    @BeforeEach
    public void setUp(){
        main = new Main();
    }

    @Test
    public void testEvenOddNumber() {

        int number = 2;
        boolean result = main.evenOddNumber(number);
        Assertions.assertTrue(result, "Не верный возврат значений метода evenOddNumber");

        number = 1;
        result = main.evenOddNumber(number);
        Assertions.assertFalse(result, "Не верный возврат значений метода evenOddNumber");
    }

    @Test
    public void testNumberInInterval() {

        int number = 100;
        boolean result = main.numberInInterval(number);
        Assertions.assertTrue(result, "Не верный возврат значений метода numberInInterval");

        number = 101;
        result = main.numberInInterval(number);
        Assertions.assertFalse(result, "Не верный возврат значений метода numberInInterval");
    }


}













