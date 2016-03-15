import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

/**
 * Created by deepdoradla on 14/03/2016.
 */
public class RecursionTest {
    Factorial f = new Factorial();

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void factorialMinus1()
    {
        Factorial f = new Factorial();
        long result = f.calculate(0);
        TestCase.assertEquals(-1, result);
    }

    @Test
    public void factorial0()
    {
        Factorial f = new Factorial();
        long result = f.calculate(0);
        TestCase.assertEquals(1, result);
    }

    @Test
    public void factorial1()
    {
        Factorial f = new Factorial();
        long result = f.calculate(1);
        TestCase.assertEquals(1,result);
    }

    @Test
    public void factorial2()
    {
        Factorial f = new Factorial();
        long result = f.calculate(2);
        TestCase.assertEquals(2,result);
    }

    @Test
    public void factorial3(){
        Factorial f = new Factorial();
        long result = f.calculate(3);
        TestCase.assertEquals(6,result);
    }

    @Test
    public void factorial13()
    {
        Factorial f = new Factorial();
        long result = f.calculate(13);
        TestCase.assertEquals(6227020800L,result);
    }

    @Test
    public void factorialMaxInt()
    {
        Factorial f = new Factorial();
        exception.expect(StackOverflowError.class);
        long result = f.calculate(Integer.MAX_VALUE);
    }


}
