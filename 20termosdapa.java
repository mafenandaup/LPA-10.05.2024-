package ioi;

import java.util.Scanner;

public class progressao {

	public static void main(String[] args) {
		int termos[] = new int[20];
		int razao, a1;
		System.out.println("digite o primeiro termo e a razão da p.a");
		Scanner scan = new Scanner(System.in);
		a1 = scan.nextInt();
		razao = scan.nextInt();
		termos[0]= a1;
		op(termos, a1, razao);
	}
	public static void op (int []v, int a1, int razao) {
		int soma = a1;
		System.out.println(a1);
		for (int i = 0; i<v.length; i++) {
	soma = soma + razao;
	System.out.println(soma);
		}
	}

}
