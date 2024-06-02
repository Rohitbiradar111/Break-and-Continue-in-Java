//This program shows break and continue statements in java -

public class breakandcontinue {
    public static void main(String args[])
    {
        //break statement - 
        for(int i=1;i<=15;i++)
        {
            if(i == 10)
            break;
            System.out.println(i+" ");
        }
        System.out.println("LOOP COMPLETED");

        System.out.print("\n");

        //continue statement - 
        for(int i=1;i<=15;i++)
        {
            if(i == 10)
            continue;
            System.out.print(i+" ");
        }
    }
}
