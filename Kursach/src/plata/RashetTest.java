package plata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

//�������� ������
public class RashetTest {
	@Test
	public void test() throws Exception {
		//������������������������
		Rash rash = new Rash();
		//������ � �����������������
		var result = rash.kvartira(5,5,5,5,5,15,1);
	
		//��������� ���������� result � ������� ��������
		if (result==39) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}
	}
