/**Program: Palindromic Prime 
*File: PalPrime.java
*Summary: This program lists palindromic prime numbers between 1 to 100,000
*Author: Jake D. Babcock
*Date: November 10, 2017
**/
public class PalPrime {

   // main method, prints both palindrome and prime number
   // prints in lines of 4 numbers.   
  
    public static void main(String[] args) {
    
        int count = 0;
        for (int i = 0; count < 113; i++) { //113 palindromic prime numbers between 1-100000
            if (isPrime(i) && isPalindrome(i)){
                System.out.printf("%10d" , i); // put spaces between each retrieved number
                count ++;
             if (count % 4 == 0 && i !=0)
                   System.out.println(); // print line after every 4th number per assignment example
                       
            }
        }
      
               
    }
//isPrime method extracts prime numbers, verifies that it
//isnt divisible by 2.     
public static boolean isPrime(long n){
    if (n < 2) return false;
    
    for (int i = 2; i <= n / 2; i++){
        if (n % i == 0) return false;
    }
     return true;
}
//reverses number, converts to palindrome
public static long reverse(long number){
    
    long reverse = 0;
    while (number != 0){
        reverse *= 10; 
        reverse += number % 10;
        number /= 10;
    }
            return reverse;
}
//isPalindrome method
public static boolean isPalindrome(long number){
    return (number == reverse(number));
}
}