package JavaCool303;

import java.awt.*;

import javax.swing.border.*;

/**
 * Abstract Theme class, that can be extended by complete Themes
 * @author Hamza
 * Can set a color, font, size and border for Cool303 components (buttons, roots and containers)
 */
public abstract class Cool303Theme {
	
	/**
	 * Button Properties
	 */
	private Color buttonColor;
	private Font buttonFont;
	private Dimension buttonSize;
	private Border buttonBorder;

	/**
	 * Root Properties
	 */	
	private Color rootColor;
	private Font rootFont;
	private Dimension rootSize;
	private Border rootBorder;


	/**
	 * Container Properties
	 */	
	private Color containerColor;
	private Font containerFont;
	private Dimension containerDimension;
	private Border containerBorder;

	
	/**
	 * @return button color
	 */
	public Color getButtonColor() {
		return buttonColor;
	}
	
	/**
	 * @return button font
	 */
	public Font getButtonFont() {
		return buttonFont;
	}

	/**
	 * @return container font
	 */
	public Color getContainerColor() {
		return containerColor;
	}

	/**
	 * @return container font
	 */
	public Font getContainerFont() {
		return containerFont;
	}

	/**
	 * @return root color
	 */
	public Color getRootColor() {
		return rootColor;
	}

	/**
	 * @return root font
	 */
	public Font getRootFont() {
		return rootFont;
	}

	/**
	 * @param buttonColor the buttonColor to set
	 */
	public void setButtonColor(Color buttonColor) {
		this.buttonColor = buttonColor;
	}

	/**
	 * @param buttonFont the buttonFont to set
	 */
	public void setButtonFont(Font buttonFont) {
		this.buttonFont = buttonFont;
	}

	/**
	 * @param containerColor the containerColor to set
	 */
	public void setContainerColor(Color containerColor) {
		this.containerColor = containerColor;
	}

	/**
	 * @param containerFont the containerFont to set
	 */
	public void setContainerFont(Font containerFont) {
		this.containerFont = containerFont;
	}

	/**
	 * @param rootColor the rootColor to set
	 */
	public void setRootColor(Color rootColor) {
		this.rootColor = rootColor;
	}

	/**
	 * @param rootFont the rootFont to set
	 */
	public void setRootFont(Font rootFont) {
		this.rootFont = rootFont;
	}

	/**
	 * @return the containerDimension
	 */
	public Dimension getContainerDimension() {
		return containerDimension;
	}

	/**
	 * @param containerDimension the containerDimension to set
	 */
	public void setContainerDimension(Dimension containerDimension) {
		this.containerDimension = containerDimension;
	}

	/**
	 * @return the buttonSize
	 */
	public Dimension getButtonSize() {
		return buttonSize;
	}

	/**
	 * @param buttonSize the buttonSize to set
	 */
	public void setButtonSize(Dimension buttonSize) {
		this.buttonSize = buttonSize;
	}

	/**
	 * @return the rootSize
	 */
	public Dimension getRootSize() {
		return rootSize;
	}

	/**
	 * @param rootSize the rootSize to set
	 */
	public void setRootSize(Dimension rootSize) {
		this.rootSize = rootSize;
	}

	/**
	 * @return the buttonBorder
	 */
	public Border getButtonBorder() {
		return buttonBorder;
	}

	/**
	 * @param buttonBorder the buttonBorder to set
	 */
	public void setButtonBorder(Border buttonBorder) {
		this.buttonBorder = buttonBorder;
	}

	/**
	 * @return the rootBorder
	 */
	public Border getRootBorder() {
		return rootBorder;
	}

	/**
	 * @param rootBorder the rootBorder to set
	 */
	public void setRootBorder(Border rootBorder) {
		this.rootBorder = rootBorder;
	}

	/**
	 * @return the containerBorder
	 */
	public Border getContainerBorder() {
		return containerBorder;
	}

	/**
	 * @param containerBorder the containerBorder to set
	 */
	public void setContainerBorder(Border containerBorder) {
		this.containerBorder = containerBorder;
	}


}
