import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Repositorio {

	
	static String a = "Buenos dias,";
	static String b = " esta es mi primera entrega de GitHub,";
	static String c = " muchas gracias";
	
	public static void main(String[] args) {
		System.out.println(a + b + c);
		
		
for (int i=-5; i<6; i++ ) {
			
			System.out.println(i);
		}
	
	

	for (int j=1; j<101 ; j++) {
		if ((j%2 == 0)&& (j%3 == 0)) {
			System.out.println(j);
		}
	}

	
	 int a [] = new int [100];
	 for (int k=0; k<a.length; k++) {
		 a[k] = (int) Math.pow(k, 2);
	 }
		 System.out.println (Arrays.toString(a));
	 
	
	 List<Integer> lista = new ArrayList<>();
	 for (int i=0; i<100; i++) {
		 lista.add(i);
	 }
	System.out.println(lista);
	
	
	Random random = new Random();
	List <Integer> lista2 = new ArrayList<>();
	for (int m = 0; m<1000; m++) {
		lista2.add(random.nextInt(250));
	}
	int valorMinimo= lista2.get(0);
	
	for(int numero : lista2) {
		if (numero<valorMinimo) {
			numero=valorMinimo;
		}
	}
	System.out.println(valorMinimo);
	
	
	
	}

	
	
	
	
}
