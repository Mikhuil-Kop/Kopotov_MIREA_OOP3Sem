package PR_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

public class Window extends JFrame {
    JTextField jta = new JTextField(10);
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    JButton button = new JButton("Проверить");

    boolean isNumber(String str) {
        int iterator = 0;
        int counter = 0;
        while(iterator < str.length()) {
            if(Character.isDigit(str.charAt(iterator))) counter++;
            iterator++;
        }
        if(str.length() == counter)
            return true;
        else
            return false;
    }


    Window() {
        super("Window");
        setLayout(new FlowLayout());
        setSize(400, 100);
        setVisible(true);
        add(jta);
        add(button);
        jta.setFont(fnt);
        setVisible(true);

        HashMap<String, String> map = new HashMap<>();
        map.put("111111111111", "Миша");
        map.put("222222222222", "Диаволо");
        map.put("666666666666", "ДИО");
        map.put("555555555555", "Таня");

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    if (jta.getText().length() == 0)
                        throw new EmptyStringException("Строка пуста");

                    if (!isNumber(jta.getText()))
                        throw new Exception("Не число");

                    if (jta.getText().length() != 12)
                        throw new Exception("Длинна != 12");

                    if (map.get(jta.getText()) == null)
                        throw new UserNotFoundException("Пользователь не найден");

                    JOptionPane.showMessageDialog(null, "ИНН " + jta.getText() + " принадлежит пользователю " + map.get(jta.getText()));
                }
                catch (EmptyStringException ex) {
                    JOptionPane.showMessageDialog(null, "Перехвачено исключение типа EmptyStringException\n" + ex.toString());
                }
                catch (UserNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Перехвачено исключение типа UserNotFoundException\n" + ex.toString());
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Перехвачено исключение неизвестного типа\n" + ex.toString());
                }
            }
        });
    }

    public static void main(String[] args) {
        new Window();
    }
}
