package test1;

/**
 * Created by Administrator on 2017/2/19.
 */
public class Draw_a_right_triangle {
    public static void main(String[] args) {
        printn(3);
    }
    private static void printn(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
