package aula02;

public class aula2 {

	public static void main(String[] args) {
		calculadora cal = new calculadora();

		int n1 = 10;
		int n2 = 25;osadhfdo9sahfosdhgfiuosghfiasdgfiasgfadf

		// System.out.println("soma: " + somar(n1, n2));
		// System.out.println("subtraçao:" + (n1 - n2));
		// System.out.println("multiplicacao:" + (n1 * n2));
		// System.out.println("Divisao:" + (n1 * n2));
		System.out.println("soma: " + cal.somar(n1, n2));
		System.out.println("subtracao: " + cal.subtrair(n1, n2));
		System.out.println("multiplicao: " + cal.multiplicacao(n1, n2));
		System.out.println("divisao: " + cal.divisao(n1, n2));

	}

}
