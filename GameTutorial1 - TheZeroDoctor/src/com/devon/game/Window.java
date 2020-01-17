package com.devon.game;

import javax.swing.JFrame;

public class Window extends JFrame {

	public Window() {
		setTitle("Test Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new GamePanel(1280, 800));
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
