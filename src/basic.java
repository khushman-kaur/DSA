import java.util.*;

public class basic {
//Write an IF statement that checks, if a number is greater than five .
    public static boolean checkNum(int num){
    if(num>5){
        return true;
    }
    return false;
}
// write an if statement that checks string is empty.
    static void emptyString(String abc){
        if(abc==""){
            System.out.println("empty String");
        }
        else
        System.out.println("it is not empty");
}
// Write an if else statement that checks a number is even or odd
    static void checkEvenOdd(int n){
        if(n%2==0){
            System.out.println("even number");
        }
        else
            System.out.println("odd number");
    }

// write a for loop that prints the number 1 to 10
    static void printNum(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

    }   
// write a for loop that prints the even numbers between 1 to 10
    static void printEvenNum(int n){
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
            System.out.println(i);
            }
        }

    } 
// write a for loop that prints the odd numbers between 1 to 10 
    static void printOddNum(int n){
        for (int i = 1; i <= n; i++) {
            if(i%2!=0){
            System.out.println(i);
            }
        }

    } 
// write a function that takes into numbers and returns their sum.
    static int sum(int a,int b){
        return a+b;
    }
// write a function that takes in a string, and Returns the length of a string.
    public static int stringLength(String abc){
       
        int i=0;
        try {
            for (i = 0; ; i++) {    
                abc.charAt(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return i;
    }
    ////Second way to calculate length of string
    public static int stringLengthSecond(String abc){
       int length=0;
        char [] seq=abc.toCharArray();
        for (char c : seq) {
            length++;
        }
        return length;

       
    }
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
       String n=sc.nextLine();
       int length=stringLengthSecond(n);
       System.out.println(length);
        
    }
}
