public class swaptwonum
{
    public static void main(String args[])
    {
        int a=10,b=20;
        System.out.println("Befor Swapping the numbers\n"+a+" "+b);

        // //USING THAIRD VARIBLE SWAP TWO NUMBERS
        // int t=a;
        // a=b;
        // b=t;
        // System.out.println("After swappning two numbers\n"+a+" "+b);


        //WITHOUT USING THIRD VARIBLE SWAP TWO NUMERS
        // using + and - operator 
        // a=a+b;  //10+20=30
        // b=a-b;  //30-20=10
        // a=a-b;  //30-10=20
        // System.out.println("After Swaping two number\n"+a+" "+b);


        //using * and / operator

        a=a*b;  //10*20=200
        b=a/b;  //200/20=10
        a=a/b;  //200/10=20
        System.out.println("After swapping two numbers\n"+a+" "+b);





    }
}