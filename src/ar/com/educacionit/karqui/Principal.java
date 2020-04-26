package ar.com.educacionit.karqui;

import ar.com.educacionit.karqui.termino.Numero;
import ar.com.educacionit.karqui.termino.operations.Multiplicacion;
import ar.com.educacionit.karqui.termino.operations.Resta;
import ar.com.educacionit.karqui.termino.operations.Suma;

public class Principal {
	public static void main (String [] args) {
		
		Numero n1 = new Numero(4);
		Numero n2 = new Numero(6);
		Numero n3 = new Numero(-1);
		
		Suma s1 = new Suma(n1, n2);
		Multiplicacion s2 = new Multiplicacion(s1, n3);
		Resta s3 = new Resta(s2, n1);
		
		int result = s3.valuar();
		
		System.out.println("El resultado es : " + result);
	}
}
