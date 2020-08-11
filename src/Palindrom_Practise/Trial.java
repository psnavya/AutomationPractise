package Palindrom_Practise;

/**
 * Created by IN22913003 on 07-12-2019.
 */
public class Trial {
    public static void main(String[] args)
    {
        int w,x,y,z,count=0;
        w=7;
        x=4;
        y=2;
        z=1;
        char[] s2;

        //String s2=new String();
        for(int i=0;i<w;i++)
        {
           if(x%2==0 &&y%2==0 &&z%2==0)
           {
               for(i=0;i<x/2;i++) {
                   s2[i] = "a";
                   count++;
               }
               for(i=count;i<x/2+y/2;i++)
               {
                   s2[i]='y';
                   count++;
               }
               for(i=count;i<w/2;i++)
               {
                   s2[i]='*';
                   count++;
               }
               StringBuilder str2=new StringBuilder(s2.toString());
               str2=str2.reverse();
               str2.toString().concat(str2.toString());
               System.out.print("Palindrome is: "+str2);

           }


        }

    }
}
