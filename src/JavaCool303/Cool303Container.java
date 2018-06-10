package JavaCool303;

import javax.swing.JPanel;

/**
 * Container is an invisible box
 * It also has an optional string
 * @author Hamza
 *
 */
public class Cool303Container extends JPanel implements Cool303Component {

	private String title;
	

	/**
	 * Overload constructor if use wishes to add title text
	 * @param title
	 */
	public Cool303Container(String title) {
		this.setTitle(title);
	}
	
	/**
	 * Implements setTheme, setting the features of the theme to component
	 */
	@Override
	public void setTheme(Cool303Theme theme) {
		this.setBackground(theme.getContainerColor());
		this.setFont(theme.getContainerFont());
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	
	
	
}
