package JavaCool303;

import java.awt.*;

import javax.swing.border.*;

/**
 * Pastel theme
 * Has different colors and fonts for Cool303Components
 * @author Hamza Elahi
 *
 */
public class PastelTheme extends Cool303Theme {
	
	public PastelTheme() {
		setButtonColor(Color.BLACK);
		setButtonFont(new Font("Calibri", Font.ITALIC, 11));
		setButtonSize(new Dimension(100,100));
		setButtonBorder(new LineBorder(Color.BLACK));

		setContainerColor(Color.YELLOW);
		setContainerFont(new Font("", Font.ITALIC, 10));
		setContainerDimension(new Dimension(250,250));
		
		setRootColor(Color.RED);
		setRootFont(new Font("", Font.ITALIC,10));
		setRootSize(new Dimension(500,500));
		setRootBorder(new LineBorder(Color.black));

	}
	
}
