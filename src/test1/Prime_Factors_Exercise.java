package test1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/19.
 */
public class Prime_Factors_Exercise {
    public static void main(String[] args) {
        generate(40);
    }
    private static void generate(int n)
    {   int flag=0;
        List <Integer>list=new ArrayList<Integer>();
        for(int i=2;i<n;i++)
        {   if(n%i==0)
            {
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                    {
                        flag=1;
                    }
                }
                if(flag==0)
                {
                    list.add(i);
                }
            }
            flag=0;

        }
        if (list.size()>0) {
            for (int k = 0; k < list.size(); k++) {
                System.out.println(list.get(k));
            }
        }
        else
        {
            System.out.println("empty list");
        }

    }
}
