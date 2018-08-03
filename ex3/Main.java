package ex3;

/**
 * 
 * @author henriquerc_18
 *
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Maca maca = new Maca();
		
		System.out.println("Informe a quantidade de maçãs: ");
		m.setQtdMaca(ler.nextInt());
		System.out.println("Quantidade de maçãs: " + m.getQtdMaca());
		System.out.println("Preço total: R$ " + m.calcularPreco());

	}

}
