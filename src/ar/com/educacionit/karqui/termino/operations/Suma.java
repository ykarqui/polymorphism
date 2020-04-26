package ar.com.educacionit.karqui.termino.operations;

import ar.com.educacionit.karqui.termino.Termino;

public class Suma extends Operacion{
	
	public Suma(Termino left, Termino right) {
		super(left,right);
	}
	
	@Override
	public int valuar() {
		return left.valuar() + right.valuar();
	}

}
