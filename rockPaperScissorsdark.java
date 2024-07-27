//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class rockPaperScissorsdark implements ActionListener {
    JFrame f = new JFrame("ROCK PAPER SCISSOR");
    JPanel p = new JPanel((LayoutManager)null);
    JLabel result = new JLabel();
    JButton rockButton;
    JButton paperButton;
    JButton scissorButton;
    Integer RIGHTCOUNTER = 0;
    String RIGHTCOUNTER1;
    JLabel RIGHTCOUNT = new JLabel("YOU WON: 0");
    Integer LEFTCOUNTER = 0;
    String LEFTCOUNTER1;
    JLabel LEFTCOUNT = new JLabel("OPPONENT WON: 0");
    Integer TOTALCOUNTER = 0;
    String TOTALCOUNTER1;
    JLabel TOTALCOUNT = new JLabel("TOTAL CHANCES: 0");
    ImageIcon ROCKLEFT = new ImageIcon("C:\\Users\\DELL\\Desktop\\languages\\java\\ROCKLEFT.png");
    ImageIcon ROCKRIGHT = new ImageIcon("C:\\Users\\DELL\\Desktop\\languages\\java\\ROCKRIGHT.png");
    ImageIcon SCISSORSLEFT = new ImageIcon("C:\\Users\\DELL\\Desktop\\languages\\java\\SCISSORSLEFT.png");
    ImageIcon SCISSORSRIGHT = new ImageIcon("C:\\Users\\DELL\\Desktop\\languages\\java\\SCISSORSRIGHT.png");
    ImageIcon PAPERRIGHT = new ImageIcon("C:\\Users\\DELL\\Desktop\\languages\\java\\PAPERRIGHT.png");
    ImageIcon PAPERLEFT = new ImageIcon("C:\\Users\\DELL\\Desktop\\languages\\java\\PAPERLEFT.png");
    ImageIcon BAHUBALI = new ImageIcon("C:\\Users\\DELL\\Desktop\\languages\\java\\BAHUBALI.jpg");
    ImageIcon BALLALADEVA = new ImageIcon("C:\\Users\\DELL\\Desktop\\languages\\java\\BALLALADEVA.jpg");
    JLabel RIGHTSIDE;
    JLabel RIGHT = new JLabel("COMPUTER");
    JLabel LEFT = new JLabel("PLAYER");
    Font font = new Font("ALGERIAN", 0, 25);
    Font font1 = new Font("TIMES NEW ROMAN", 1, 25);
    JLabel LEFTSIDE;
    int a;
    int b;
    Random r = new Random();

    rockPaperScissorsdark() {
        this.p.setBackground(Color.black);
        this.p.setSize(750, 800);
        this.RIGHTSIDE = new JLabel(this.BALLALADEVA);
        this.LEFTSIDE = new JLabel(this.BAHUBALI);
        this.RIGHTSIDE.setBounds(50, 50, 300, 290);
        this.RIGHTSIDE.setBackground(Color.black);
        this.LEFTSIDE.setBounds(400, 50, 300, 290);
        this.LEFTSIDE.setBackground(Color.black);
        this.RIGHT.setBounds(50, 0, 300, 50);
        this.RIGHT.setFont(this.font);
        this.RIGHT.setBorder(new MatteBorder(4, 4, 4, 4, Color.cyan));
        this.RIGHT.setForeground(Color.white);
        this.RIGHT.setHorizontalAlignment(0);
        this.LEFT.setBounds(400, 0, 300, 50);
        this.LEFT.setFont(this.font);
        this.LEFT.setBorder(new MatteBorder(4, 4, 4, 4, Color.cyan));
        this.LEFT.setForeground(Color.white);
        this.LEFT.setHorizontalAlignment(0);
        this.rockButton = new JButton("ROCK(r)");
        this.rockButton.registerKeyboardAction(this, KeyStroke.getKeyStroke('r'), 2);
        this.paperButton = new JButton("PAPER(p)");
        this.paperButton.registerKeyboardAction(this, KeyStroke.getKeyStroke('p'), 2);
        this.scissorButton = new JButton("SCISSOR(s)");
        this.scissorButton.registerKeyboardAction(this, KeyStroke.getKeyStroke('s'), 2);
        this.result.setBounds(250, 450, 250, 50);
        this.result.setFont(this.font);
        this.result.setForeground(new Color(220, 243, 77));
        this.result.setBorder(new LineBorder(Color.white));
        this.result.setHorizontalAlignment(0);
        this.TOTALCOUNT.setBounds(50, 550, 300, 50);
        this.TOTALCOUNT.setHorizontalAlignment(0);
        this.TOTALCOUNT.setFont(this.font1);
        this.TOTALCOUNT.setForeground(Color.green);
        this.TOTALCOUNT.setBorder(new MatteBorder(3, 3, 3, 3, Color.WHITE));
        this.RIGHTCOUNT.setBounds(50, 650, 300, 50);
        this.RIGHTCOUNT.setHorizontalAlignment(0);
        this.RIGHTCOUNT.setFont(this.font1);
        this.RIGHTCOUNT.setForeground(Color.green);
        this.RIGHTCOUNT.setBorder(new MatteBorder(3, 3, 3, 3, Color.WHITE));
        this.LEFTCOUNT.setBounds(400, 650, 300, 50);
        this.LEFTCOUNT.setHorizontalAlignment(0);
        this.LEFTCOUNT.setFont(this.font1);
        this.LEFTCOUNT.setForeground(Color.green);
        this.LEFTCOUNT.setBorder(new MatteBorder(3, 3, 3, 3, Color.WHITE));
        this.rockButton.setBounds(50, 350, 150, 50);
        this.rockButton.setBackground(Color.white);
        this.paperButton.setBounds(300, 350, 150, 50);
        this.paperButton.setBackground(Color.white);
        this.scissorButton.setBounds(550, 350, 150, 50);
        this.scissorButton.setBackground(Color.white);
        this.rockButton.addActionListener(this);
        this.paperButton.addActionListener(this);
        this.scissorButton.addActionListener(this);
        this.f.add(this.p);
        this.p.add(this.RIGHTCOUNT);
        this.p.add(this.LEFTCOUNT);
        this.p.add(this.TOTALCOUNT);
        this.p.add(this.RIGHT);
        this.p.add(this.LEFT);
        this.p.add(this.result);
        this.p.add(this.rockButton);
        this.p.add(this.paperButton);
        this.p.add(this.scissorButton);
        this.p.add(this.RIGHTSIDE);
        this.p.add(this.LEFTSIDE);
        this.f.setBounds(200, 25, 750, 800);
        this.f.setLayout((LayoutManager)null);
        this.f.setDefaultCloseOperation(2);
        this.f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Integer var2;
        if (e.getSource() == this.rockButton) {
            this.b = 0;
            this.LEFTSIDE.setIcon(this.ROCKRIGHT);
            this.a = this.r.nextInt(3);
            if (this.a == 0) {
                this.RIGHTSIDE.setIcon(this.ROCKLEFT);
                this.result.setText("TIED :|");
                var2 = this.TOTALCOUNTER;
                this.TOTALCOUNTER = this.TOTALCOUNTER + 1;
                this.TOTALCOUNTER1 = this.TOTALCOUNTER.toString();
                this.TOTALCOUNT.setText("TOTAL CHANCES: " + this.TOTALCOUNTER1);
                this.WINCHECKER(this.RIGHTCOUNTER, this.LEFTCOUNTER, this.TOTALCOUNTER);
            } else if (this.a == 1) {
                this.RIGHTSIDE.setIcon(this.SCISSORSLEFT);
                this.result.setText("YOU WON :)");
                var2 = this.RIGHTCOUNTER;
                this.RIGHTCOUNTER = this.RIGHTCOUNTER + 1;
                this.RIGHTCOUNTER1 = this.RIGHTCOUNTER.toString();
                this.RIGHTCOUNT.setText("YOU WON: " + this.RIGHTCOUNTER1);
                var2 = this.TOTALCOUNTER;
                this.TOTALCOUNTER = this.TOTALCOUNTER + 1;
                this.TOTALCOUNTER1 = this.TOTALCOUNTER.toString();
                this.TOTALCOUNT.setText("TOTAL CHANCES: " + this.TOTALCOUNTER1);
                this.WINCHECKER(this.RIGHTCOUNTER, this.LEFTCOUNTER, this.TOTALCOUNTER);
            } else if (this.a == 2) {
                this.RIGHTSIDE.setIcon(this.PAPERLEFT);
                this.result.setText("YOU LOST :(");
                var2 = this.LEFTCOUNTER;
                this.LEFTCOUNTER = this.LEFTCOUNTER + 1;
                this.LEFTCOUNTER1 = this.LEFTCOUNTER.toString();
                this.LEFTCOUNT.setText("OPPONENT WON: " + this.LEFTCOUNTER1);
                var2 = this.TOTALCOUNTER;
                this.TOTALCOUNTER = this.TOTALCOUNTER + 1;
                this.TOTALCOUNTER1 = this.TOTALCOUNTER.toString();
                this.TOTALCOUNT.setText("TOTAL CHANCES: " + this.TOTALCOUNTER1);
                this.WINCHECKER(this.RIGHTCOUNTER, this.LEFTCOUNTER, this.TOTALCOUNTER);
            }
        } else if (e.getSource() == this.scissorButton) {
            this.b = 1;
            this.LEFTSIDE.setIcon(this.SCISSORSRIGHT);
            this.a = this.r.nextInt(3);
            if (this.a == 0) {
                this.RIGHTSIDE.setIcon(this.ROCKLEFT);
                this.result.setText("YOU LOST :(");
                var2 = this.LEFTCOUNTER;
                this.LEFTCOUNTER = this.LEFTCOUNTER + 1;
                this.LEFTCOUNTER1 = this.LEFTCOUNTER.toString();
                this.LEFTCOUNT.setText("OPPONENT WON: " + this.LEFTCOUNTER1);
                var2 = this.TOTALCOUNTER;
                this.TOTALCOUNTER = this.TOTALCOUNTER + 1;
                this.TOTALCOUNTER1 = this.TOTALCOUNTER.toString();
                this.TOTALCOUNT.setText("TOTAL CHANCES: " + this.TOTALCOUNTER1);
                this.WINCHECKER(this.RIGHTCOUNTER, this.LEFTCOUNTER, this.TOTALCOUNTER);
            } else if (this.a == 1) {
                this.RIGHTSIDE.setIcon(this.SCISSORSLEFT);
                this.result.setText("TIED :|");
                var2 = this.TOTALCOUNTER;
                this.TOTALCOUNTER = this.TOTALCOUNTER + 1;
                this.TOTALCOUNTER1 = this.TOTALCOUNTER.toString();
                this.TOTALCOUNT.setText("TOTAL CHANCES: " + this.TOTALCOUNTER1);
                this.WINCHECKER(this.RIGHTCOUNTER, this.LEFTCOUNTER, this.TOTALCOUNTER);
            } else if (this.a == 2) {
                this.RIGHTSIDE.setIcon(this.PAPERLEFT);
                this.result.setText("YOU WON :)");
                var2 = this.RIGHTCOUNTER;
                this.RIGHTCOUNTER = this.RIGHTCOUNTER + 1;
                this.RIGHTCOUNTER1 = this.RIGHTCOUNTER.toString();
                this.RIGHTCOUNT.setText("YOU WON: " + this.RIGHTCOUNTER1);
                var2 = this.TOTALCOUNTER;
                this.TOTALCOUNTER = this.TOTALCOUNTER + 1;
                this.TOTALCOUNTER1 = this.TOTALCOUNTER.toString();
                this.TOTALCOUNT.setText("TOTAL CHANCES: " + this.TOTALCOUNTER1);
                this.WINCHECKER(this.RIGHTCOUNTER, this.LEFTCOUNTER, this.TOTALCOUNTER);
            }
        } else if (e.getSource() == this.paperButton) {
            this.b = 2;
            this.LEFTSIDE.setIcon(this.PAPERRIGHT);
            this.a = this.r.nextInt(3);
            if (this.a == 0) {
                this.RIGHTSIDE.setIcon(this.ROCKLEFT);
                this.result.setText("YOU WON :)");
                var2 = this.RIGHTCOUNTER;
                this.RIGHTCOUNTER = this.RIGHTCOUNTER + 1;
                this.RIGHTCOUNTER1 = this.RIGHTCOUNTER.toString();
                this.RIGHTCOUNT.setText("YOU WON: " + this.RIGHTCOUNTER1);
                var2 = this.TOTALCOUNTER;
                this.TOTALCOUNTER = this.TOTALCOUNTER + 1;
                this.TOTALCOUNTER1 = this.TOTALCOUNTER.toString();
                this.TOTALCOUNT.setText("TOTAL CHANCES: " + this.TOTALCOUNTER1);
                this.WINCHECKER(this.RIGHTCOUNTER, this.LEFTCOUNTER, this.TOTALCOUNTER);
            } else if (this.a == 1) {
                this.RIGHTSIDE.setIcon(this.SCISSORSLEFT);
                this.result.setText("YOU LOST :(");
                var2 = this.LEFTCOUNTER;
                this.LEFTCOUNTER = this.LEFTCOUNTER + 1;
                this.LEFTCOUNTER1 = this.LEFTCOUNTER.toString();
                this.LEFTCOUNT.setText("OPPONENT WON: " + this.LEFTCOUNTER1);
                var2 = this.TOTALCOUNTER;
                this.TOTALCOUNTER = this.TOTALCOUNTER + 1;
                this.TOTALCOUNTER1 = this.TOTALCOUNTER.toString();
                this.TOTALCOUNT.setText("TOTAL CHANCES: " + this.TOTALCOUNTER1);
                this.WINCHECKER(this.RIGHTCOUNTER, this.LEFTCOUNTER, this.TOTALCOUNTER);
            } else if (this.a == 2) {
                this.RIGHTSIDE.setIcon(this.PAPERLEFT);
                this.result.setText("TIED :|");
                var2 = this.TOTALCOUNTER;
                this.TOTALCOUNTER = this.TOTALCOUNTER + 1;
                this.TOTALCOUNTER1 = this.TOTALCOUNTER.toString();
                this.TOTALCOUNT.setText("TOTAL CHANCES: " + this.TOTALCOUNTER1);
                this.WINCHECKER(this.RIGHTCOUNTER, this.LEFTCOUNTER, this.TOTALCOUNTER);
            }
        }

    }

    void WINCHECKER(Integer RIGHTCOUNTER, Integer LEFTCOUNTER, Integer TOTALCOUNTER) {
        int a;
        if (RIGHTCOUNTER != 10 && LEFTCOUNTER != 10) {
            if (TOTALCOUNTER == 15) {
                if (RIGHTCOUNTER > LEFTCOUNTER) {
                    JOptionPane.showMessageDialog((Component)null, "YOU WON :)");
                    a = JOptionPane.showConfirmDialog((Component)null, "DO U WANT TO PLAY NEW GAME ? ", (String)null, 0);
                    this.f.dispose();
                    if (a == 0) {
                        new rockPaperScissorsdark();
                    } else {
                        new RockPaperScissorsMain();
                    }
                } else if (LEFTCOUNTER > RIGHTCOUNTER) {
                    JOptionPane.showMessageDialog((Component)null, "YOU LOST :(");
                    a = JOptionPane.showConfirmDialog((Component)null, "DO U WANT TO PLAY NEW GAME ? ", (String)null, 0);
                    this.f.dispose();
                    if (a == 0) {
                        new rockPaperScissorsdark();
                    } else {
                        new RockPaperScissorsMain();
                    }

                    new rockPaperScissorsdark();
                } else if (LEFTCOUNTER == RIGHTCOUNTER) {
                    JOptionPane.showMessageDialog((Component)null, "TIED :|");
                    a = JOptionPane.showConfirmDialog((Component)null, "DO U WANT TO PLAY NEW GAME ? ", (String)null, 0);
                    this.f.dispose();
                    if (a == 0) {
                        new rockPaperScissorsdark();
                    } else {
                        new RockPaperScissorsMain();
                    }
                }
            }
        } else if (RIGHTCOUNTER == 10) {
            JOptionPane.showMessageDialog((Component)null, "YOU WON :)");
            a = JOptionPane.showConfirmDialog((Component)null, "DO U WANT TO PLAY NEW GAME ? ", (String)null, 0);
            this.f.dispose();
            if (a == 0) {
                new rockPaperScissorsdark();
            } else {
                new RockPaperScissorsMain();
            }
        } else if (LEFTCOUNTER == 10) {
            JOptionPane.showMessageDialog((Component)null, "YOU LOST :(");
            a = JOptionPane.showConfirmDialog((Component)null, "DO U WANT TO PLAY NEW GAME ? ", (String)null, 0);
            this.f.dispose();
            if (a == 0) {
                new rockPaperScissorsdark();
            } else {
                new RockPaperScissorsMain();
            }
        }

    }
}
