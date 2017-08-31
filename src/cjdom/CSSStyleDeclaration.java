package cjdom;

/**
 * CSSStyleDeclaration represents a collection of CSS property-value pairs.
 */
public class CSSStyleDeclaration extends EventTarget {

/**
 * Sets the textual representation of the declaration block
 */
public void setProperty(String aName, String aValue)  { setProperty(aName, aValue, null); }

/**
 * Sets the textual representation of the declaration block
 */
public native void setProperty(String aName, String aValue, String aPriority);

/**
 * Sets the textual representation of the declaration block
 */
public native void setCSSText(String aStr);

}