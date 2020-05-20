package plata;

import org.junit.jupiter.api.Test;

public class Rash {
	public double[] stoimost(double c,double h,double s,double g,double k, double vg, double vh, double vc, double vs, double u){
		double q1=0;
		double q2=0;
		double q3=0;
		double q4=0;
		double q5=0;
		
		if ((c != 0) & (vc != 0)) {
			q1 = c * vc; // Cena na cold water
		}
		if ((h != 0) & (vh != 0)) {
			q2 = h * vh; // Cena na hot water
		}
		if ((g != 0) & (vg != 0)) {
			q3 = g * vg; // Cena na gas
		}
		if ((s != 0) & (vs != 0)) {
			q4 = s * vs; // Cena na svet
		}
		if ((k != 0) & (u != 0)) {
			q5 = k * u; // Cena na kommunalnye uslugy
		}
		double[] arr = new double[6];
		arr[0]=q1;
		arr[1]=q2;
		arr[2]=q3;
		arr[3]=q4;
		arr[4]=q5;
		return arr;
	}
	public double kvartira(double q1,double q2,double q3,double q4,double q5, double d, double p) throws Exception {
		double summa;
		summa = 0;
		if ((q1 != 0) || (q2 != 0) || (q3 != 0) || (q4 != 0) || (q5 != 0) || (d >= 0) || (p >= 0)) {
			summa = q1 + q2 + q3 + q4 + q5 + d - p; // summa
	}
		new Result(q1,  q2,  q3,  q4,  q5,  summa);	
		return summa;
	}
}
	