package cjdom;

/**
 * Element is the most general base class from which all objects in a Document inherit. It only has methods and
 * properties common to all kinds of element. More specific classes inherit from Element. For example, the HTMLElement
 * interface is the base interface for HTML elements, while the SVGElement interface is the basis for all SVG elements.
 * Most functionality is specified further down the class hierarchy.
 */
public class Element extends Node {

/**
 * Sets the attribute with given name to given value.
 */
public native void setAttribute(String aName, String aValue);

/**
 * Sets the element content.
 */
public native void setInnerHTML(String aValue);

/**
 * Sets the given named attribute to given value and returns this HTMLElement.
 */
public Element withAttr(String aName, String aValue)
{
    setAttribute(aName, aValue);
    return this;
}

}