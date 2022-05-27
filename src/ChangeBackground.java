import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeBackground extends JFrame {
    private JButton button1;
    private JButton button2;
    private JPanel pane1;
    MyListener listener = new MyListener();
    public ChangeBackground(){
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("이벤트 예제");
        pane1 = new JPanel();
        button1 = new JButton("노란색");
        button1.addActionListener(listener);
        pane1.add(button1);
        button2 = new JButton("핑크색");
        button2.addActionListener(listener);
        pane1.add(button2);
        this.add(pane1);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1){
                pane1.setBackground(Color.YELLOW);
            } else if(e.getSource() == button2) {
                pane1.setBackground(Color.PINK);
            }
        }
    }

    public static void main(String[] args) {
        ChangeBackground t = new ChangeBackground();
    }
}
