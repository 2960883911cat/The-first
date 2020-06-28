package day;

import java.util.Scanner;

public class hannuot2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("请输入盘子数量");
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			int n=in.nextInt();
			han(n,'a','b','c');
		}
		
	}
	public static void han(int n,char a,char b,char c) {
		if(n==1) {
			buzhou(a,b);
			buzhou(b,c);
		}
		else {
			han(n-1,a,b,c);
			buzhou(a,b);
			han(n-1,c,b,a);
			buzhou(b,c);
			han(n-1,a,b,c);
			
		}
	}
	public static void buzhou(char x,char y) {
		System.out.println(x+"--"+y);
	}

}
