package plata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

//создание класса
public class RashetTest {
	@Test
	public void test() throws Exception {
		//созданиеэкземпл€ракласса
		Rash rash = new Rash();
		//расчет с введеннымиданными
		var result = rash.kvartira(5,5,5,5,5,15,1);
	
		//сравнение переменной result и верного значени€
		if (result==39) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}
	}
