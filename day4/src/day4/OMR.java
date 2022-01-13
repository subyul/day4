package day4;
import java.util.Random;
public class OMR {
public static void main(String[] args) {
	Random ran = new Random();
	
	System.out.print("[");
	int[] answer = {1, 3, 4, 2, 5};
	int[] hgd = new int[5];
	
	int count = 0;
	int cnt = 0;
	
	for(int j = 0; j < 5; j++) {
		System.out.print(answer[j]);
}
	System.out.println("]");
	
	for(int i = 0; i<5; i++) {
		if(answer[i]==hgd[i]) {
			System.out.print(i+"  ");
		}
	}
	
	System.out.print("[");
	for(int i = 0; i < 5; i++) {
		int num = ran.nextInt(5)+1;
		hgd [i] = num;
		System.out.print(hgd[i]);
	}
	System.out.println("]");
	System.out.print("[");
	for(int i = 0; i<5; i++) {
		if(answer[i]==hgd[i]) {
			System.out.print("O");
			cnt +=1;
		}
		
		else {
			System.out.print("X");
		}
	}
	System.out.println("]");
	System.out.println("¼ºÀû = "+cnt*20+"Á¡");
	
}
}
