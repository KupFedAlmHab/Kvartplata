package plata;
//добавляем библиотеки для работы с текстовыми полями, метками
//для создания графического окна
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

//Главный класс, реализующий интерфейс ActionListener
//Интерфейс нужен для обработки события нажатия на кнопку
public class plata implements ActionListener{
    JFrame frame = new JFrame("Кварплата"); //главное окно
    JPanel panelLeft = new JPanel(); //панель с метками
    JPanel panelRight = new JPanel(); //панель с текстовыми полями
    JPanel panelBottom = new JPanel(); //панель с кнопками
    public JTextField[] arrTf = new JTextField[18];//массив текстовых полей

    //конструктор
    public plata(){
        //устанавливаем менеджер компоновки для панели с метками
        //делаем выравнивание по вертикали
        panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.Y_AXIS));
        //устанавлиаем  размер 250 на 300 пикселей
        panelLeft.setPreferredSize(new Dimension(250, 300));

        //устанавливаем менеджер компоновки для панели с текстовыми полями
        //делаем выравнивание по вертикали
        panelRight.setLayout(new BoxLayout(panelRight, BoxLayout.Y_AXIS));
        //устанавливаем  размер 130 на 300 пикселей
        panelRight.setPreferredSize(new Dimension(130,300));

        //добавлям метки через метод addLabel
        addLabel(panelLeft, "Тариф на холодную воду:", Color.RED);
        addLabel(panelLeft, "Тариф на горячую воду:", Color.RED);
        addLabel(panelLeft, "Тариф на свет:", Color.RED);
        addLabel(panelLeft, "Тариф на газ:", Color.RED);
        addLabel(panelLeft, "Количество проживающих:", Color.RED);
        addLabel(panelLeft, "Объем потраченного газа:", Color.RED);
        addLabel(panelLeft, "Объем потраченной горячей воды:", Color.RED);
        addLabel(panelLeft, "Объем потраченной холодной воды:", Color.RED);
        addLabel(panelLeft, "Объем потраченного света:", Color.RED);
        addLabel(panelLeft, "Жилищные услуги:", Color.RED);
        addLabel(panelLeft, "Долг за прошлый месяц:", Color.RED);
        addLabel(panelLeft, "Переплата с прошлого месяца:", Color.RED);
        addLabel(panelLeft, "Подсчет холодной воды:", Color.BLUE);
        addLabel(panelLeft, "Подсчет горячей воды:", Color.BLUE);
        addLabel(panelLeft, "Подсчет газа:", Color.BLUE);
        addLabel(panelLeft, "Подсчет света:", Color.BLUE);
        addLabel(panelLeft, "Подсчет жилищных услуг:", Color.BLUE);
        addLabel(panelLeft, "Общая сумма:", Color.BLUE);
        //добавляем текстовые поля через цикл и записываем их в массив
        for(int i=0; i<arrTf.length; i++){
            if(arrTf.length>=0){
                //записываем ссылку из метода в массив для дальнейшей работы с текстовым полем
                arrTf[i] = addTextField(panelRight);}

        }


        //добавляем кнопки расчета и сброса
        JButton calc = addButton(panelBottom, "Расчет");
        //добавляем слушатель на событие нажатия
        calc.addActionListener(this);
        JButton reset = addButton(panelBottom, "Сброс");
        //добавляем слушатель на событие нажатия
        reset.addActionListener(this);


        //делаем главную форму видимой
        frame.setVisible(true);
        //устанавливаем действие при нажатии на крестик - завершение приложения
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //устанавливаем начальное положение относительно центра экрана (по центру)
        frame.setLocationRelativeTo(null);
        //Устанавливаем размер главного окна(400 на 450)
        frame.setSize(400,450);
        //Добавляем метку с информацией к работе в самый верх окна
        JLabel top = new JLabel("Красные поля являются обязательными для заполнения");
        //устанавливаем выравнивание текста в метке по центру
        top.setHorizontalAlignment(JLabel.CENTER);

        //добавляем панели на клавное окно
        frame.add(top, BorderLayout.NORTH);
        frame.add(panelLeft, BorderLayout.WEST);
        frame.add(panelRight, BorderLayout.EAST);
        frame.add(panelBottom, BorderLayout.SOUTH);
        frame.setResizable(false); //запрещаем изменение размеров главного окна

    }


    //метод добавления текстовых меток
    public void addLabel(JComponent container, String name, Color color){
        //создаем тестовую метку с именем name
        JLabel lb = new JLabel(name);
        //устанавливаем максимально допустимый
        lb.setMaximumSize(new Dimension(400,20));
        //устанавливаем цвета текста
        lb.setForeground(color);
        //устанавливаем выравнивание по правому краю
        lb.setHorizontalAlignment(JLabel.RIGHT);
        //добавляем рамку
        lb.setBorder(new EtchedBorder());
        //Добавляем текстовую метку в панель
        container.add(lb);
    }

    //метод добавления текстовых полей
    public JTextField addTextField(JComponent container){
        //Создаем текстовое поле
        JTextField tf = new JTextField();
        //устанавливаем его максимально допустимый размер
        tf.setMaximumSize(new Dimension(150,20));
        //добавляем текстовое поле на панель
        container.add(tf);
        //возвращаем ссылку на текстовое поле
        return tf;
    }

    //метод добавления кнопок
    public JButton addButton(JComponent container, String name){
        //Создаем кнопку
        JButton btn = new JButton(name);
        //Устанавливаем максимально допустимый размер
        btn.setMaximumSize(new Dimension(100,20));
        //Выравниваем по горизонтали по центру
        btn.setHorizontalAlignment(JButton.CENTER);

        //добавляем кнопку на панель
        container.add(btn);
        //возвращаем ссылку на кнопку
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


