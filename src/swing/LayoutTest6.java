package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //CardLayout:

public class LayoutTest6 extends JFrame implements ActionListener {
 //создаем панель для нашей "колоды"
 JPanel cardPanel = new JPanel();
 //Создаем 5 кнопок управления с нужными надписями
 JButton first = new JButton("First");
 JButton last = new JButton("Last");
 JButton next = new JButton("Next");
 JButton prev = new JButton("Prev");
 JButton show = new JButton("Show");
 public LayoutTest6() {
  //устанавливаем на cardPanel менеджер
  cardPanel.setLayout(new CardLayout(10, 10));
  //окрашиваем нашу панель в розовый цвет
  cardPanel.setBackground(Color.PINK);
  //добавляем на нее 12 меток с надписью - номер метки
  for (int k = 0; k < 12; k++) {
   cardPanel.add("" + k, new JLabel("" + k, JLabel.CENTER));
  }
  // создаем панель для кнопок управления
  JPanel buttons = new JPanel();
  //окрашиваем ее в зеленый цвет
  buttons.setBackground(Color.GREEN);
  //устанавливаем на ней менеджера компоновки
  buttons.setLayout(new FlowLayout(FlowLayout.CENTER));

  //добавляем кнопки на панель и связываем кнопки с обработчмками событий
  buttons.add(first);
  first.addActionListener(this);
  buttons.add(last);
  last.addActionListener(this);
  buttons.add(next);
  next.addActionListener(this);
  buttons.add(prev);
  prev.addActionListener(this);
  buttons.add(show);
  show.addActionListener(this);
  //панель с метками устанавливаем в центр фрейма
  getContentPane().add("Center", cardPanel);
  //панель с кнопками устанавливаем внизу
  getContentPane().add("South", buttons);
  setBounds(100, 100, 400, 300); }

 public static void main(String[] args) {
  LayoutTest6 flt = new LayoutTest6();
  flt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  flt.setVisible(true);
 }

 //описываем обработчиков
 public void actionPerformed(ActionEvent e) {
  //в зависимости от кнопки совершаем вызов того или иного метода
   if (e.getSource() == first) {
    ((CardLayout) cardPanel.getLayout()).first(cardPanel);
   }
  if (e.getSource() == last) {
   ((CardLayout) cardPanel.getLayout()).last(cardPanel);
  }
  if (e.getSource() == next) {
   ((CardLayout) cardPanel.getLayout()).next(cardPanel);
  }
  if (e.getSource() == prev) {
   ((CardLayout) cardPanel.getLayout()).previous(cardPanel);
  } //на эту кнопку навешиваем создание диалогового окна
  if (e.getSource() == show) {
   String answer = JOptionPane.showInputDialog("Input number: 0-11");
   if (answer != null) {
    ((CardLayout) cardPanel.getLayout()).show(cardPanel, answer);
   }
  }
 }
}