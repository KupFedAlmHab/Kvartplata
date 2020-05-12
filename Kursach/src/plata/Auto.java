package plata;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Auto extends JFrame {
	public Auto() {
		// ���������� �������� ������
		setTitle("���� �����������");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// ������ �� ��������� ������� ����
		setResizable(false);
		setBounds(400, 220, 100, 40);
// �������� ������
		JPanel autoPanel = new JPanel(null);

//���������� ������ "�����"
		JLabel log = new JLabel("�����");
		log.setBounds(25, 10, 50, 20);

//���������� ������ "������"
		JLabel pas = new JLabel("������");
		pas.setBounds(25, 50, 50, 20);

//���������� ���� ��� ����� ������
		JTextField login = new JTextField();
		login.setBounds(100, 5, 200, 30);

//���������� ���� ��� ����� ������
		JPasswordField pass = new JPasswordField();
		pass.setBounds(100, 45, 200, 30);

//���������� ������ ������� ���������
		JButton start = new JButton("������");
		start.setBounds(150, 90, 100, 40);

//���������� ��������� ��� ������, ������������ ������� ����������� � ������ ���������
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count1 = 0;
				String password = new String(pass.getPassword());
				try {
//���������� ����� �� �������� ����������� ������
					File file = new File("log.txt");
// ������� ������ FileReader ��� ������� File
					FileReader fr = new FileReader(file);
// ������� BufferedReader � ������������� FileReader ��� ����������� ����������
					BufferedReader reader = new BufferedReader(fr);
// ������� ������� ������ ������
					String line = reader.readLine();
					int id = 0;
					String l = "";
					for (int i = 0; i < 10; i++) {
						if (line.startsWith("L:")) {
							String[] logi = line.split(":");
							l = logi[1];
						} 
							
						// ����� ���������� ������ ����� ������������
						if (l.equalsIgnoreCase(login.getText())) {
							id = i;
							break;
						}
						else {
							line = reader.readLine();
						}
					}
					reader.close();

//���������� ����� �� �������� ����������� ������
					File file1 = new File("log.txt");
// ������� ������ FileReader ��� ������� File
					FileReader fr1 = new FileReader(file1);
// ������� BufferedReader � ������������� FileReader ��� ����������� ����������
					BufferedReader reader1 = new BufferedReader(fr1);
// ������� ������� ������ ������
					String line1 = reader1.readLine();

					String p = "";
					int svyaz = 0;
					for (int j = 0; j < 10; j++) {
						if (line1.startsWith("P:")) {
							String[] parol = line1.split(":");
							p = parol[1];
							svyaz = j;
						}
						if ((p.equalsIgnoreCase(password)) && (svyaz == (id + 1))) {
							count1 = 1;
						} else {
// ��������� ��������� ������ � �����
							line1 = reader1.readLine();
						}
						// ����� ���������� ������ ����� ������������

					}

					if (count1 == 1) {
						new plata();
					} else {
						JOptionPane.showMessageDialog(null, "������� �������� ������");

					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
//���������� ��������� �� ������
		autoPanel.add(pas);
		autoPanel.add(log);
		autoPanel.add(login);
		autoPanel.add(pass);
		autoPanel.add(start);
		setContentPane(autoPanel);
		setDefaultLookAndFeelDecorated(true);
//��������� ������� ����
		setSize(400, 200);
		setVisible(true);
	}
}