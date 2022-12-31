import javax.swing.*;
import java.awt.*;

public class game extends JFrame {
    gameboard board = new gameboard();
    game(){
        setTitle("지민이의 오델로 게임");
        setSize(900, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(null);

        getContentPane().setBackground(Color.white);

        add(board);

        setVisible(true);
    }
    public static void main(String[] args) {
        new game();
    }
}
