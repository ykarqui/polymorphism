package ar.com.educacionit.karqui.termino.operations;

import ar.com.educacionit.karqui.termino.Termino;

public abstract class Operacion implements Termino{
	
	protected Termino left;
	protected Termino right;
	
	public Operacion(Termino left, Termino right) {
		this.left = left;
		this.right = right;
	}
	
}
