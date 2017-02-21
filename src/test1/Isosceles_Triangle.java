package test1;

/**
 * Created by Administrator on 2017/2/19.
 */
public class Isosceles_Triangle {
    public static void main(String[] args) {
        printn(4);
    }
    private static void printn(int n)
    {
        for (int i = 1; i <= n; i++) {	//i为行数

            for (int k = 1; k <= n - i; k++) {	//k为每行空格数

                System.out.print(" ");

            }

            for (int j = 1; j <= 2 * i - 1; j++) {	//j为每行*数

                System.out.print("*");

            }

            System.out.println();
    }


    }
}
