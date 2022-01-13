package day4;
public class Lottery_ticket {
public static void main(String[] args) {
	int intArray1 [] = {0, 0, 7, 7, 7, 0, 0, 0};
	int intArray2 [] = {7, 0, 7, 7, 0, 0, 0, 0};
	int intArray3 [] = {7, 0, 7, 7, 7, 0, 7, 0};	
	int cnt = 0;
	int check = 0;
	
	for(int i = 0; i<8; i++) {
		if(intArray1[i]==7) {
			cnt += 1;
			if(cnt == 3) {
				check = 1;
			}
		}
		else {
			cnt = 0;
		}
	}
	if(check == 1) {
		System.out.println("´çÃ·");
	}
	else {
		System.out.println("Å»¶ô");
	}
	cnt = 0;
	check = 0;
	for(int i = 0; i<8; i++) {
		if(intArray2[i]==7) {
			cnt += 1;
			if(cnt == 3) {
				check = 1;
			}
		}
		else {
			cnt = 0;
		}
	}
	if(check == 1) {
		System.out.println("´çÃ·");
	}
	else {
		System.out.println("Å»¶ô");
}
	cnt = 0;
	check = 0;
	for(int i = 0; i<8; i++) {
		if(intArray3[i]==7) {
			cnt += 1;
			if(cnt == 3) {
				check = 1;
			}
		}
		else {
			cnt = 0;
		}
	}
	if(check == 1) {
		System.out.println("´çÃ·");
	}
	else {
		System.out.println("Å»¶ô");
	
}
}
}