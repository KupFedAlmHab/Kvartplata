package plata;
//��������� ���������� ��� ������ � ���������� ������, �������
//��� �������� ������������ ����
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

//������� �����, ����������� ��������� ActionListener
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new plata();
            }
        });
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
   
    }


