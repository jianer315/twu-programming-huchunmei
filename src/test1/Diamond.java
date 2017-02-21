package test1;

/**
 * Created by Administrator on 2017/2/19.
 */
public class Diamond {
    public static void main(String[] args) {
       PrintDiamond(2);//要打印的菱形的行数！

    }
    private static void PrintDiamond(int n)
    {
     if(n < 0){
          System.out.println("您输入的数据不合法：必须是大于0的整数！");
         return;
        }else {
          n=2*n-1;
   }

        //mid为最中间是第几行(行号)！
        //比如输出图形为9行的菱形,中间行就是第5行,mid就是5;
        int mid = (n + 1) / 2;
        for(int i = 1; i <= n; i++){
            int j,k;
            if(i <= mid){
                for(j = 1; j <= mid - i; j++){
                    System.out.print(" ");
                }
                for(k = 1; k <= 2 * i - 1; k++){
                    System.out.print("*");
                }
            }else{
                for(j = 1; j <= i - mid; j++){
                    System.out.print(" ");
                }
                for(k = 1; k <= n - 2 * (j -1); k++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
