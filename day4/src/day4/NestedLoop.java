package day4;
import java.util.Scanner;
public class NestedLoop {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	for(int i = 1; i < 10; i++) {
		for(int j = 1; j < 10; j++) {
			System.out.print(i + "*" + j + "=" + i*j);
			System.out.print('\t');
		}
		System.out.println();
	}
}
}
