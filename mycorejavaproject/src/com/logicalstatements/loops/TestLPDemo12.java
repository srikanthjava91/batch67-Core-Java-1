package com.logicalstatements.loops;

import java.util.Scanner;

//Q14) WAP to print Reverse number of given number ..?
//Q15)WAP to find the Given number is Palindrome or not..?
public class TestLPDemo12 {

	int revNum(int n) {
		int rev = 0;
		int r = 0;

		// 345
		while (n != 0) {
			r = n % 10;// 345%10-> 5, 34%10-> 4,3%10-> 3
			n = n / 10;// 345/10->34, 34/10 -> 3, 3/10 -> 0
			rev = rev * 10 + r;// 543
		}

		return rev;
	}

	void main() {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number  : ");
		int n = sc.nextInt();
		int reverseNum = revNum(n);
		System.out.println("Reverse number of a given number: " + reverseNum);

		if (reverseNum == n) {
			System.out.println("The given number is Palindrome !!");
		} else {
			System.out.println("The given number is not a Palindrome !!");
		}
	}
}
