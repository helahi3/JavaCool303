package JavaCool303;

import java.awt.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

/**
 * Sample application that uses JavaCool303
 * @author Hamza Elahi
 */
public class AppTest {

	private JFrame frame;
	private Cool303Root btnPanel;
	
	// Main Method
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppTest window = new AppTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize and create application
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Add a Root with GridLayout(5,5)
		btnPanel = new Cool303Root();
		btnPanel.setLayout(new GridLayout(5,5));
		
		frame.getContentPane().add(btnPanel);
		
		ArrayList<Cool303Button> buttons = new ArrayList<Cool303Button>();
		
		for(int i=1; i<21; i++) {
			String temp = "" + i;
			Cool303Button tempButton = new Cool303Button(temp);
			buttons.add(tempButton);
			btnPanel.addChild(tempButton);
		}
		btnPanel.setTheme(new PastelTheme());

		
		for(Cool303Button button : buttons) {

			btnPanel.add(button);
			button.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(button.getText());
				}
			}	);
			
		}
		
	}

	public AppTest() {
		initialize();
	}
	
}
