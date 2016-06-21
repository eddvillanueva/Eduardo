import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public Main() {
	}

		public static void main(String[] args) 
		{
	
		Matematicas m1 = new Matematicas();
		Matematicas m2 = new Matematicas();
		BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Ingrese el valor 1");
		System.out.println(valor);
		System.out.println(m1.valor);
		m1.setSuma(valor);
		
		System.out.println("Ingrese el valor 1");
		System.out.println(valor);
		System.out.println(m2.valor);
		m2.setSuma(valor);
			
		System.out.println(m1.valor + m2.valor);

		
		
	}
		

}
