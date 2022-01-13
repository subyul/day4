package day4;
import java.util.Scanner;
public class BreakExample {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	while (true) {
		System.out.print(">>");
		String text = sc.nextLine();
		if(text.equals("exit"))
			break;
	}
	System.out.println("종료합니다....");
}

}
