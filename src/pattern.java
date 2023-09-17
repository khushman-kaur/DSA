import java.util.*;

public class pattern {
  public static void main(String[] args) {
    pattern4(5);
  }  
// PRINT THESE PATTERNS
//
// PATTERN 1
// *
// *  *
// *  *  *
// *  *  *  *

static void pattern1 (int n){
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println(); 
    }
  }
//PATTERN 2
// * * * * *
// * * * * *
// * * * * *
// * * * * *

static void pattern2 (int n){
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            System.out.print("* ");
        }
        System.out.println(); 
    }
  }

//PATTERN 3
// * * * * *
// * * * *
// * * *
// * *
// *

static void pattern3 (int n){
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= 5-i+1; j++) {
            System.out.print("* ");
        }
        System.out.println(); 
    }
  }

//PATTERN 4
//1
//1 2
//1 2 3
//1 2 3 4

static void pattern4 (int n){
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println(); 
    }
  }
}
