package graphics;

import java.awt.*;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.JPanel;


public class MainClass {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("AZAZ");
		frame.setBounds(10,10,1700,1000);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Work work=new Work();
		frame.add(work);
		frame.setVisible(true);
		
		
	}

}
