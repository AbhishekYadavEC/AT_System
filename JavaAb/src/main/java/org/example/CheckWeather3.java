package org.example;
import java.util.*;
public class CheckWeather3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else if (isPrime(num)) {
            System.out.println("The number is odd-prime");
        } else {
            System.out.println("The number is odd-non-prime");
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
