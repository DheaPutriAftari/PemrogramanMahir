package tugas1Pm;

import java.util.Scanner;
public class Rekursif {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return n;
        } else {
            return (n * factorial(n-1));
        }
    }
}

