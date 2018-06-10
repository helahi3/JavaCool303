package JavaCool303;

import java.awt.*;
import javax.swing.border.*;

/**
 * WinterTheme has different properties for the Cool303Components
 * @author Hamza
 *
 */
public class WinterTheme extends Cool303Theme {

	
	public WinterTheme() {
		setButtonColor(Color.BLACK);
		setButtonFont(new Font("Calibri", Font.ITALIC, 11));
		setButtonSize(new Dimension(100,100));
		setButtonBorder(new LineBorder(Color.black));

		setContainerColor(Color.cyan);
		setContainerFont(new Font("", Font.ITALIC, 10));
		setContainerDimension(new Dimension(250,250));
		
		setRootColor(Color.BLUE);
		setRootFont(new Font("", Font.ITALIC,10));
		setRootSize(new Dimension(500,500));
		setRootBorder(new LineBorder(Color.black));

	}
	
}
