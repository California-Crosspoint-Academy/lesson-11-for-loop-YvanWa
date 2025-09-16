//Yifan Wang
public class note{
    public static void main(String[]args){
        //example 1
        int j=0, sum=0;
        for(j=3; j<=79;j++){//j=3 is initializing expression  //j<=79 is control expression
        //j++is step expression
            sum=sum+j;
            System.out.println(sum);
        }
        System.out.println("The final sum is "+sum);
        //The break command:
//If the keyword break is executed inside a for-loop,the loop is immediately exited
//(regardless of the control statement).Execution continues with the statement
//immediately following the closing brace of the for-loop.
//you can do no braces for if there is only one line of code or just one basic structure inside a loop
//the total time of executing is the out loop times inside one
    }
}