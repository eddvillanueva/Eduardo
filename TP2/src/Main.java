import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public Main() {
	}

		public static void main(String[] args) 
		{
	//	Scanner s = new Scanner(System.in);
		Matematicas m1 = new Matematicas();
		Matematicas m2 = new Matematicas();
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese el valor 1");
		int valor = Integer.parseInt(entrada.readLine());
		System.out.println(valor);
		System.out.println(m1.valor);
		
		System.out.println("Ingrese el valor 2");
		valor = Integer.parseInt(entrada.readLine());
		System.out.println(valor);
		System.out.println(m2.valor);
			
		System.out.println(m1.valor + m2.valor);

		
		
	}
		

}
