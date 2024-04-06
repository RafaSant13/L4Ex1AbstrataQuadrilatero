package model;

public class Trapezio extends Paralelogramo{
	
	private float baseMenor;
	private float ladoA;
	private float ladoB;

	public Trapezio() {
		super();
	}
	
	public float getBaseMenor() {
		return baseMenor;
	}



	public void setBaseMenor(float baseMenor) {
		this.baseMenor = baseMenor;
	}



	public float getLadoA() {
		return ladoA;
	}



	public void setLadoA(float ladoA) {
		this.ladoA = ladoA;
	}



	public float getLadoB() {
		return ladoB;
	}



	public void setLadoB(float ladoB) {
		this.ladoB = ladoB;
	}
	

	@Override
	public float calcPerimetro() {
		return baseMenor + getBase() + ladoA + ladoB;
	}
	
	@Override
	public float calcArea() {
		return ((baseMenor + getBase()) * getAltura())/2;
	}
	

}
