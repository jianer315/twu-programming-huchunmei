package test1;

/**
 * Created by Administrator on 2017/2/19.
 */
public class FizzBuzz_Exercise {
    public static void main(String[] args) {
        FizzBuzz();
    }

    private static void  FizzBuzz()
    {
      for(int n=1;n<=100;n++)
      {
          if(n%3==0&&n%5!=0)
          {
              System.out.println("Fizz");
          }
          else if(n%3!=0&&n%5==0)
          {
              System.out.println("Buzz");
          }
          else if (n%3==0&&n%5==0)
          {
              System.out.println("FizzBuzz");
          }
          else
          {
              System.out.println(n);
          }
      }
    }
}
