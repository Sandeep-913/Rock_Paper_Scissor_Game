//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;

public class RockPaperScissorsMain implements ActionListener {
    JFrame f = new JFrame();
    JLabel L = new JLabel(new ImageIcon("C:\\Users\\DELL\\Desktop\\languages\\java\\LOGO.jpeg"));
    JLabel l1 = new JLabel("ROCK PAPER SCISSOR");
    JButton newGame = new JButton("NEW GAME");
    JButton newGameDark = new JButton("NEW GAME(DARK MODE)");
    JButton Exit = new JButton("CLOSE GAME");

    RockPaperScissorsMain() {
        this.L.setBounds(100, 100, 500, 300);
        this.f.add(this.L);
        this.l1.setBounds(100, 10, 500, 75);
        this.l1.setForeground(Color.black);
        this.l1.setHorizontalAlignment(0);
        this.l1.setBorder(new MatteBorder(2, 2, 2, 2, Color.blue));
        this.f.add(this.l1);
        this.newGame.setBounds(200, 450, 300, 50);
        this.newGame.addActionListener(this);
        this.newGameDark.setBounds(200, 550, 300, 50);
        this.newGameDark.addActionListener(this);
        this.Exit.setBounds(200, 650, 300, 50);
        this.Exit.addActionListener(this);
        this.f.add(this.newGame);
        this.f.add(this.newGameDark);
        this.f.add(this.Exit);
        this.f.setLayout((LayoutManager)null);
        this.f.setBounds(200, 25, 750, 800);
        this.f.setDefaultCloseOperation(3);
        this.f.setVisible(true);
    }

    public static void main(String[] args) {
        new RockPaperScissorsMain();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.newGame) {
            new rockPaperScissors();
        } else if (e.getSource() == this.newGameDark) {
            new rockPaperScissorsdark();
        } else if (e.getSource() == this.Exit) {
            this.f.dispose();
        }

    }
}
