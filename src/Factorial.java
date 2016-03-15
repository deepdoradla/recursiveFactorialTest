/**
 * Created by deepdoradla on 14/03/2016.
 */
public class Factorial {
    public int calculate(int number)
    {
        if (number < 0)
            return -1;

        if(number == 0)
        {
            return 1;
        }
        else
        {
            return(number * calculate(number - 1));
        }
    }

    public static void main(String[] args){

        Factorial f = new Factorial();
        long result = f.calculate(5);
        System.out.println("" + result);
    }
}
