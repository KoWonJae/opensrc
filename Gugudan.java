package OssExma09;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력하고 싶은 단 입력 :");
		int num = sc.nextInt();
		if(num == 0) {
			for(int i = 2; i <=9; i++) {
				for(int j =1 ; j<=9 ; j++) {
					System.out.print(i + " x " + j + " = " + i*j + " ");
				}
				System.out.println();
			}
		} else {
			for(int i = 0; i < 9 ; i++) {
				System.out.println(num + " x " + (i+1) + " = " + num*(i+1) );
			}
		}

	}

}
