package model;

public class Paralelogramo extends Quadrilatero{

	public Paralelogramo() {
		super();
	}
	
	@Override
	public float calcPerimetro() {
		float lado = (float) (getAltura()/(Math.sqrt(2)/2));
		return 2*(getBase() + lado);
	}

	@Override
	public float calcArea() {
		return getBase() * getAltura();
	}

}
