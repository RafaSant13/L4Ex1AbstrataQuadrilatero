package view;

import model.Paralelogramo;
import model.Trapezio;

public class Principal {

	public static void main(String[] args) {
		Paralelogramo p = new Paralelogramo();
		p.setAltura(10);
		p.setBase(5);
		System.out.printf("Perímetro : %.1f\nÁrea : %.1f\n",p.calcPerimetro(), p.calcArea());
		
		Trapezio t = new Trapezio();
		t.setAltura(5);
		t.setBase(8);
		t.setBaseMenor(6);
		t.setLadoA(5);
		t.setLadoB(5);
		System.out.printf("Perímetro : %.1f\nÁrea : %.1f\n",t.calcPerimetro(), t.calcArea());
	}

}
