package plata;
//��������� ���������� ��� ������ � ���������� ������, �������
//��� �������� ������������ ����
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;


//��������� ����� ��� ��������� ������� ������� �� ������
public class plata implements ActionListener{
    JFrame frame = new JFrame("���������"); //������� ����
    JPanel panelLeft = new JPanel(); //������ � �������
    JPanel panelRight = new JPanel(); //������ � ���������� ������
    JPanel panelBottom = new JPanel(); //������ � ��������
    public JTextField[] arrTf = new JTextField[18];//������ ��������� �����

    //�����������
    public plata(){
        //������������� �������� ���������� ��� ������ � �������
        //������ ������������ �� ���������
        panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.Y_AXIS));
        //������������  ������ 250 �� 300 ��������
        panelLeft.setPreferredSize(new Dimension(250, 300));

        //������������� �������� ���������� ��� ������ � ���������� ������
        //������ ������������ �� ���������
        panelRight.setLayout(new BoxLayout(panelRight, BoxLayout.Y_AXIS));
        //�������������  ������ 130 �� 300 ��������
        panelRight.setPreferredSize(new Dimension(130,300));

        //�������� ����� ����� ����� addLabel
        addLabel(panelLeft, "����� �� �������� ����:", Color.RED);
        addLabel(panelLeft, "����� �� ������� ����:", Color.RED);
        addLabel(panelLeft, "����� �� ����:", Color.RED);
        addLabel(panelLeft, "����� �� ���:", Color.RED);
        addLabel(panelLeft, "���������� �����������:", Color.RED);
        addLabel(panelLeft, "����� ������������ ����:", Color.RED);
        addLabel(panelLeft, "����� ����������� ������� ����:", Color.RED);
        addLabel(panelLeft, "����� ����������� �������� ����:", Color.RED);
        addLabel(panelLeft, "����� ������������ �����:", Color.RED);
        addLabel(panelLeft, "�������� ������:", Color.RED);
        addLabel(panelLeft, "���� �� ������� �����:", Color.RED);
        addLabel(panelLeft, "��������� � �������� ������:", Color.RED);
        addLabel(panelLeft, "������� �������� ����:", Color.BLUE);
        addLabel(panelLeft, "������� ������� ����:", Color.BLUE);
        addLabel(panelLeft, "������� ����:", Color.BLUE);
        addLabel(panelLeft, "������� �����:", Color.BLUE);
        addLabel(panelLeft, "������� �������� �����:", Color.BLUE);
        addLabel(panelLeft, "����� �����:", Color.BLUE);
        //��������� ��������� ���� ����� ���� � ���������� �� � ������
        for(int i=0; i<arrTf.length; i++){
            if(arrTf.length>=0){
                //���������� ������ �� ������ � ������ ��� ���������� ������ � ��������� �����
                arrTf[i] = addTextField(panelRight);}

        }


        //��������� ������ ������� � ������
        JButton calc = addButton(panelBottom, "������");
        //��������� ��������� �� ������� �������
        calc.addActionListener(this);
        JButton reset = addButton(panelBottom, "�����");
        //��������� ��������� �� ������� �������
        reset.addActionListener(this);


        //������ ������� ����� �������
        frame.setVisible(true);
        //������������� �������� ��� ������� �� ������� - ���������� ����������
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //������������� ��������� ��������� ������������ ������ ������ (�� ������)
        frame.setLocationRelativeTo(null);
        //������������� ������ �������� ����(400 �� 450)
        frame.setSize(400,450);
        //��������� ����� � ����������� � ������ � ����� ���� ����
        JLabel top = new JLabel("������� ���� �������� ������������� ��� ����������");
        //������������� ������������ ������ � ����� �� ������
        top.setHorizontalAlignment(JLabel.CENTER);

        //��������� ������ �� ������� ����
        frame.add(top, BorderLayout.NORTH);
        frame.add(panelLeft, BorderLayout.WEST);
        frame.add(panelRight, BorderLayout.EAST);
        frame.add(panelBottom, BorderLayout.SOUTH);
        frame.setResizable(false); //��������� ��������� �������� �������� ����

    }


    //����� ���������� ��������� �����
    public void addLabel(JComponent container, String name, Color color){
        //������� �������� ����� � ������ name
        JLabel lb = new JLabel(name);
        //������������� ����������� ����������
        lb.setMaximumSize(new Dimension(400,20));
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
    public JTextField addTextField(JComponent container){
        //������� ��������� ����
        JTextField tf = new JTextField();
        //������������� ��� ����������� ���������� ������
        tf.setMaximumSize(new Dimension(150,20));
        //��������� ��������� ���� �� ������
        container.add(tf);
        //���������� ������ �� ��������� ����
        return tf;
    }

    //����� ���������� ������
    public JButton addButton(JComponent container, String name){
        //������� ������
        JButton btn = new JButton(name);
        //������������� ����������� ���������� ������
        btn.setMaximumSize(new Dimension(100,20));
        //����������� �� ����������� �� ������
        btn.setHorizontalAlignment(JButton.CENTER);

        //��������� ������ �� ������
        container.add(btn);
        //���������� ������ �� ������
        return btn;
    }
  //����� �������
  	public void kvartira() throws Exception {
  		double c = 0;
  		double h = 0;
  		double s = 0;
  		double g = 0;
  		double k = 0;
  		double vg = 0;
  		double vh = 0;
  		double vc = 0;
  		double vs = 0;
  		double u = 0;
  		double d = 0;
  		double p = 0;
  		double q1 = 0;
  		double q2 = 0;
  		double q3 = 0;
  		double q4 = 0;
  		double q5 = 0;
  		double summa = 0;

  		for (int i = 0; i < 12; i++) {
  			if (arrTf[i].getText().length() == 0) {
  				arrTf[i].setText(" ");
  			}
  		}

  		if (!arrTf[0].getText().equals(" ")) {
  			c = Double.valueOf(arrTf[0].getText()); // cold water
  		}
  		if (!arrTf[1].getText().equals(" ")) {
  			h = Double.valueOf(arrTf[1].getText()); // hot water
  		}
  		if (!arrTf[2].getText().equals(" ")) {
  			s = Double.valueOf(arrTf[2].getText()); // svet
  		}
  		if (!arrTf[3].getText().equals(" ")) {
  			g = Double.valueOf(arrTf[3].getText()); // gas
  		}
  		if (!arrTf[4].getText().equals(" ")) {
  			k = Double.valueOf(arrTf[4].getText()); // kolichestvo projivayuchih
  		}
  		if (!arrTf[5].getText().equals(" ")) {
  			vg = Double.valueOf(arrTf[5].getText()); // v potrachennogo gasa
  		}
  		if (!arrTf[6].getText().equals(" ")) {
  			vh = Double.valueOf(arrTf[6].getText()); // v potrachennogo hot water
  		}
  		if (!arrTf[7].getText().equals(" ")) {
  			vc = Double.valueOf(arrTf[7].getText()); // v potrachennogo cold water
  		}
  		if (!arrTf[8].getText().equals(" ")) {
  			vs = Double.valueOf(arrTf[8].getText()); // v potrachennogo svet
  		}
  		if (!arrTf[9].getText().equals(" ")) {
  			u = Double.valueOf(arrTf[9].getText()); // kommunalnye uslugy
  		}
  		if (!arrTf[10].getText().equals(" ")) {
  			d = Double.valueOf(arrTf[10].getText()); // dolg
  		}
  		if (!arrTf[11].getText().equals(" ")) {
  			p = Double.valueOf(arrTf[11].getText());// pereplata
  		}
  		
  		
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
  		if ((q1 != 0) || (q2 != 0) || (q3 != 0) || (q4 != 0) || (q5 != 0) || (d >= 0) || (p >= 0)) {
  			summa = q1 + q2 + q3 + q4 + q5 + d - p; // summa
  	}
  			
  	}
  	public static void main(String[] args) {
		new Auto();
}
  //����� ��������� ������� ������� �� ������
  	@Override
  	public void actionPerformed(ActionEvent e) {
  //������ ��� ������, �� ������� ������
  		if (e.getActionCommand().equals("������")) {
  			try {
  				//��������� ������
  								kvartira();
  								
  							} catch (Exception ex) {
  								JOptionPane.showMessageDialog(null, "��������� ������������ �����");
  							}

  		} else {
  //������� ��� ����
  			for (int i = 0; i < arrTf.length; i++) {
  				arrTf[i].setText("");
  			}
  		}
  	}
  }
