package JavaCool303;

import javax.swing.JButton;

/**
 * Cool303Button is a JButton that a Cool303Theme can be applied to
 * @author Hamza
 *
 */
public class Cool303Button extends JButton implements Cool303Component {
	
	/**
	 * Constructor that accepts label and sets text
	 * @param label
	 */
	public Cool303Button(String label) {
		this.setText(label);
		//Deafult size
	}
	
	/**
	 * Constructor that sets text and size of button
	 * @param label
	 * @param width
	 * @param height
	 */
	public Cool303Button(String label, int width, int height) {
		this.setText(label);
		this.setSize(width, height);
	}
	
	@Override
	public void setTheme(Cool303Theme theme) {

		this.setFont(theme.getButtonFont());
		this.setForeground(theme.getButtonColor());
		this.setSize(theme.getButtonSize());
		this.setBorder(theme.getButtonBorder());
	}
	
	
}
