package JavaCool303;

import java.util.ArrayList;
import javax.swing.*;

import java.awt.*;

/**
 * Is a JPanel that applies given theme to all its children
 * @author Hamza
 * Can have multiple Roots in same application
 */
public class Cool303Root extends JPanel implements Cool303Component {

	ArrayList<Cool303Component> childList;
	
	/**
	 * Constructor
	 */
	public Cool303Root() {
		childList = new ArrayList<Cool303Component>();
	}
	
	/**
	 * Adds single child to list of children
	 * @param newChild
	 */
	public void addChild(Cool303Component newChild) {
		childList.add(newChild);
	}
	
	
	/**
	 * @param newChildren
	 * Adds child components to the list of children
	 */
	public void addChildren(ArrayList<Cool303Component> newChildren) {
		for(Cool303Component newChild : newChildren) {
			childList.add(newChild);
		}
	}
	
	
	/** 
	 * @param theme to be applied to the root
	 * Applies the same theme to all children
	 */
	@Override
	public void setTheme(Cool303Theme theme) {
		this.setBackground(theme.getRootColor());
		this.setFont(theme.getRootFont());
		this.setSize(theme.getRootSize());
		this.setBorder(theme.getRootBorder());
		
		for(Cool303Component child : childList) {
			child.setTheme(theme);
		}
	}

}
