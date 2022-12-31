import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class game extends JFrame {
    gameboard board = new gameboard();
    Font font = new Font("SanSerif", Font.BOLD, 20);
    static int num1, num2;
    static Color btn1 = Color.green;
    static Color btn2 = Color.GRAY;
    static JLabel score1, score2, player1, player2;
    game(){
        setTitle("지민이의 오델로 게임");
        setSize(900, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        player1 = new JLabel("Player 1 : ●");
        player2 = new JLabel("Player 2 : ○");
        score1 = new JLabel("● X " + num1);
        score2 = new JLabel("○ X " + num2);

        setLayout(null);
        player1.setOpaque(true);         //투명한가 불투명한가. true 불투명
        player2.setOpaque(true);
        player1.setHorizontalAlignment(player1.CENTER);     //중간으로 정렬
        player2.setHorizontalAlignment(player2.CENTER);
        score1.setHorizontalAlignment(score1.CENTER);
        score2.setHorizontalAlignment(score2.CENTER);

        player1.setBounds(700, 50,130,50);
        score1.setBounds(700, 100, 130, 50);
        player2.setBounds(700,350, 130, 50);
        score2.setBounds(700, 400, 130, 50);

        getContentPane().setBackground(Color.white);
        player1.setBackground(btn1);
        player2.setBackground(btn2);

        player1.setBorder(new LineBorder(Color.black, 2));
        player2.setBorder(new LineBorder(Color.black, 2));

        player1.setFont(font);
        player2.setFont(font);
        score1.setFont(font);
        score2.setFont(font);

        add(board);
        add(player1);
        add(player2);
        add(score1);
        add(score2);

        setVisible(true);
    }
    public static void main(String[] args) {
        new game();
    }
}
