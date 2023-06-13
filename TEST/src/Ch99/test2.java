package Ch99;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("높이 입력 : ");
		int h = sc.nextInt();
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<h) {
			j=0;
			while(j<=(h-2)-i) {
				System.out.print(" ");
				j++;
			}
			k=0;
			while(k<=2*i) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
	}
}
