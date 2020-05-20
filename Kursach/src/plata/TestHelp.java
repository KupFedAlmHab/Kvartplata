package plata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

//создание класса
public class TestHelp {

	@Test
	public void test() {
		//создание экземпл€ра класса
		Rash rash = new Rash();
		//расчет с введенными данными
		double[] result = new double[6];
		result = rash.stoimost(1,2,3,4,5,6,7,8,9,10);
		System.out.print(result[0]);
		//сравнение переменной result и верного значени€
		if ((result[0]==8)&&(result[1]==14)&&(result[2]==24)&&(result[3]==27)&&(result[4]==50)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}

	}
	}
