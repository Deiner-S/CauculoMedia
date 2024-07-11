package Classes;

public class Main {

	public static void main(String[] args) {
		int nota1 = 8;
		int nota2 = 5;
		int nota3 = 6;
		int nota4 = 9;
		
		int media = 0;
		
		media = nota1 + nota2 + nota3 + nota4;
		media /= 4;
		
		System.out.println("Media da turma está em: "+ media);
		
		mat(nota1, nota2);
	}
	
	public static void mat(int v1, int v2) {
		
		System.out.println("Maximo " + Math.max(v1,v2));
		System.out.println("Minimo " + Math.min(v1,v2));		
		System.out.println("Raiz quadrada " + Math.sqrt(v1)); // raiz quadrada
		System.out.println("Valor absoluto " + Math.abs(v1)); // Valor absoluto
		System.out.println("Numero aleatorio entre 0.0 e 1.0 " + Math.random()); // numero aleatorio entre 0.0 e 1.0
		
		
	}
	

}
