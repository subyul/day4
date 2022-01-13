package day4;
import java.util.Scanner;
public class ArrayLength {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("정수 5개를 입력하세요");
	int intArray [] = new int[5];
	
	double sum = 0.0;
	
	for(int i = 0; i<intArray.length;i++) {
		intArray[i] = sc.nextInt();
		}
	for(int i = 0; i<intArray.length;i++) {
		sum += intArray[i];
	}
	System.out.println("평균은" + sum/intArray.length);
}
}
