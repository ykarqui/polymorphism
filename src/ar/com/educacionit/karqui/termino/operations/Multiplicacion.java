package ar.com.educacionit.karqui.termino.operations;

import ar.com.educacionit.karqui.termino.Termino;

public class Multiplicacion extends Operacion{
	
	public Multiplicacion(Termino left, Termino right) {
		super(left,right);
	}
	
	@Override
	public int valuar() {
		return left.valuar() * right.valuar();
	}

}
