package plata;

//��������� ���������� ��� ������ � ���������� ������, �������
//��� �������� ������������ ����
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

//������� �����, ����������� ��������� ActionListener
//��������� ����� ��� ��������� ������� ������� �� ������
public class Result extends JFrame {
	JFrame frame = new JFrame("���������� ��������"); // ������� ����
	JPanel panelLeft = new JPanel(); // ������ � �������
	JPanel panelRight = new JPanel(); // ������ � ���������� ������
	JPanel panelBottom = new JPanel(); // ������ � ��������
	public JTextField[] arrTf = new JTextField[18];// ������ ��������� �����
	private double q1;
	private double q2;
	private double q3;
	private double q4;
	private double q5;
	private double summa;
	

//�����������
	public Result(double q1, double q2, double q3, double q4,double q5, double summa) {
		this.q1 = q1;
		this.q2 = q2;
		this.q3 = q3;
		this.q4 = q4;
		this.q5 = q5;
		this.summa = summa;
//������������� �������� ���������� ��� ������ � �������
//������ ������������ �� ���������
		panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.Y_AXIS));
//������������ ������ 250 �� 300 ��������
		panelLeft.setPreferredSize(new Dimension(200, 300));

//������������� �������� ���������� ��� ������ � ���������� ������
//������ ������������ �� ���������
		panelRight.setLayout(new BoxLayout(panelRight, BoxLayout.Y_AXIS));
//������������� ������ 130 �� 300 ��������
		panelRight.setPreferredSize(new Dimension(130, 300));

//�������� ����� ����� ����� addLabel
		addLabel(panelLeft, "������� �������� ����:", Color.BLUE);
		addLabel(panelLeft, "������� ������� ����:", Color.BLUE);
		addLabel(panelLeft, "������� ����:", Color.BLUE);
		addLabel(panelLeft, "������� �����:", Color.BLUE);
		addLabel(panelLeft, "������� �������� �����:", Color.BLUE);
		addLabel(panelLeft, "����� �����:", Color.BLUE);
//��������� ��������� ���� ����� ���� � ���������� �� � ������
		for (int i = 12; i < arrTf.length; i++) {
			if (arrTf.length >= 0) {
//���������� ������ �� ������ � ������ ��� ���������� ������ � ��������� �����
				arrTf[i] = addTextField(panelRight);
			}

		}
		arrTf[12].setText(""+q1);
		arrTf[13].setText(""+q2);
		arrTf[14].setText(""+q3);
		arrTf[15].setText(""+q4);
		arrTf[16].setText(""+q5);
		arrTf[17].setText(""+summa);
//������ ������� ����� �������
		frame.setVisible(true);
//������������� ��������� ��������� ������������ ������ ������ (�� ������)
		frame.setLocationRelativeTo(null);
//������������� ������ �������� ����(400 �� 450)
		frame.setSize(350, 200);
//��������� ������ �� ������� ����
		frame.add(panelLeft, BorderLayout.WEST);
		frame.add(panelRight, BorderLayout.EAST);
		frame.add(panelBottom, BorderLayout.SOUTH);
		frame.setResizable(false); // ��������� ��������� �������� �������� ����

	}

//����� ���������� ��������� �����
	public void addLabel(JComponent container, String name, Color color) {
//������� �������� ����� � ������ name
		JLabel lb = new JLabel(name);
//������������� ����������� ���������� ������
		lb.setMaximumSize(new Dimension(400, 20));
//������������� ����� ������
		lb.setForeground(color);
//������������� ������������ �� ������� ����
		lb.setHorizontalAlignment(JLabel.RIGHT);
//��������� �����
		lb.setBorder(new EtchedBorder());
//��������� ��������� ����� � ������
		container.add(lb);
	}

//����� ���������� ��������� �����
	public JTextField addTextField(JComponent container) {
//������� ��������� ����
		JTextField tf = new JTextField();
//������������� ��� ����������� ���������� ������
		tf.setMaximumSize(new Dimension(150, 20));
//��������� ��������� ���� �� ������
		container.add(tf);
//���������� ������ �� ��������� ����
		return tf;
	}

//����� ���������� ������
	public JButton addButton(JComponent container, String name) {
//������� ������
		JButton btn = new JButton(name);
//������������� ����������� ���������� ������
		btn.setMaximumSize(new Dimension(100, 20));
//����������� �� ����������� �� ������
		btn.setHorizontalAlignment(JButton.CENTER);

//��������� ������
		container.add(btn);
//���������� ������ �� ������
		return btn;
	}

}