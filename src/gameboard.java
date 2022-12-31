import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class gameboard extends JPanel implements MouseListener {
    boolean color = true;   //true(black), false(white)
    int[][] stones = new int[8][8];     // 1 (black), 2 (white)
    gameboard(){
        setBounds(50, 50, 600, 600);
        setBackground(new Color(201, 146, 65));
        setBorder(new LineBorder(Color.black, 1));

        stones[3][3] = stones[4][4] = 2;
        stones[3][4] = stones[4][3] = 1;

        addMouseListener(this);
    }
    public void paint(Graphics g){
        super.paint(g);

        for(int i = 0; i < 9; i++){
            g.drawLine(0, 75 * i, 600, 75 * i);
            ((Graphics2D) g).setStroke(new BasicStroke(1.0f));
            g.drawLine(75 * i, 0, 75 * i, 600);
        }

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(stones[i][j] == 1){
                    g.setColor(Color.black);
                    g.fillOval(i * 75, j * 75, 75, 75);
                }
                if(stones[i][j] == 2){
                    g.setColor(Color.white);
                    g.fillOval(i * 75, j * 75, 75, 75);
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {    //마우스 버튼 클릭
        System.out.println("X = " + e.getX());
        System.out.println("Y = " + e.getY());

        if(stones[e.getX() / 75][e.getY() / 75] == 0){
            color = !color;
            if(color){
                stones[e.getX() / 75][e.getY() / 75] = 1;
            }
            else
                stones[e.getX() / 75][e.getY() / 75] = 2;
            repaint();
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {    //마우스 버튼 누름

    }

    @Override
    public void mouseReleased(MouseEvent e) {   //마우스 버튼을 놓음

    }

    @Override
    public void mouseEntered(MouseEvent e) {    //마우스가 윈도우 안에 들어옴

    }

    @Override
    public void mouseExited(MouseEvent e) {     //마우스가 윈도우 밖으로 나감

    }
}
