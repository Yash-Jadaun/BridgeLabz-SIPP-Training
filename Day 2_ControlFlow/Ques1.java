import java.util.Scanner;
public class Ques1{
    
    public static int function(int n){
        if(n==1){
            return 1;
        }

        return n*function(n-1);
    }
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int n= sc.nextInt();
        int result = function(n);
        System.out.println("The factorial of " + n + " is: " + " "+  result);
        
    }
}