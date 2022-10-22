package aulas;

import java.util.Scanner;

public class Aula_18 {

	public static void main(String[] args) {
		//leia um numero do usuario e imprima a mensagem "invalido"
		// caso o numero lido seja menor que zero ou maior do que 100
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("digite o numero:");
		x = sc.nextInt();
		
		if(x < 0 || x >100){
		System.out.println("Invalido");
		}	
		else{
		System.out.println("Valido");	
		}
	}
}
// ORenatoBarbosa
