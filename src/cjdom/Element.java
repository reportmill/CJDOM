package cjdom;

/**
 * A custom class.
 */
public class Element extends Node {

/**
 * Sets the attribute with given name to given value.
 */
public void setAttribute(String aName, String aValue)
{
    setAttributeJSO(aName, aValue);
}

/**
 * Sets the attribute with given name to given value.
 */
native void setAttributeJSO(String aName, String aValue);

/**
 * Sets the given named attribute to given value and returns this HTMLElement.
 */
public Element withAttr(String aName, String aValue)
{
    setAttribute(aName, aValue);
    return this;
}

}