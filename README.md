#JavaCool303

Created mini implementation of JavaFX by extending Java Swing. 

Design Techniques used were Abstract class, interfaces, inheritance, contracts

The design patterns used were the composite pattern and the strategy pattern.

Composite - Cool303Root was a Cool303Component and contained a list of all its children (who were also Cool303Components) that it would apply the theme to

Strategy - This pattern was used in the abstract class Cool303Theme, and the two classes that extend it (PastelTheme and WinterTheme)

UML diagram and JavaDoc has relevant information to create a new theme, or to create an application using JavaCool303

JavaDoc is in the doc folder. Select index to view all javadocs

