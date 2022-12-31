import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class result extends JFrame implements ActionListener {
    Font font = new Font("SanSerif", Font.BOLD, 20);
    Font winfont = new Font("SanSerif", Font.BOLD, 50);
    JLabel win1, win2;
    result(){
        setTitle("게임 결과");
        setSize(600,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(null);
        JButton again = new JButton("Try Again");
        JButton exit = new JButton("Exit");
        win1 = new JLabel("!!!! Player 1 Win !!!!");
        win2 = new JLabel("!!!! Player 2 Win !!!!");

        win1.setBounds(70, 100, 480, 80);
        win2.setBounds(70, 100, 480, 80);
        again.setBounds(150, 250, 300,60);
        exit.setBounds(150, 330, 300, 60);

        getContentPane().setBackground(Color.white);
        again.setBackground(Color.PINK);
        exit.setBackground(Color.pink);

        again.setFont(font);
        exit.setFont(font);
        win1.setFont(winfont);
        win2.setFont(winfont);

        add(again);
        add(exit);
        if(game.num1 > game.num2){
            add(win1);
        }
        else{
            add(win2);
        }

        again.addActionListener(this);
        exit.addActionListener(this);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Exit")){
            setVisible(false);
        }
        if(e.getActionCommand().equals("Try Again")){
            new game();
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new result();
    }
}
