package meuFRAME;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;

public class layout extends JFrame{
    public layout(){
       super("meu layout");
       Container c = getContentPane();
       c.add(BorderLayout.NORTH, new JButton("botão norte "));
       c.add(BorderLayout.SOUTH, new JButton("botão sul "));
       c.add(BorderLayout.CENTER, new JButton("botão centro "));
       c.add(BorderLayout.EAST, new JButton("botão leste "));
       c.add(BorderLayout.WEST, new JButton("botão oeste"));
       getContentPane().add(new JButton("botão centralizado!!"));

       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(300,300);
       setVisible(true);
    }
    public static void main(String[] args){
        new layout();
    }
}
//interface grafica com buttons
