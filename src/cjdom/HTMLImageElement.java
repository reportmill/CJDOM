package cjdom;

/**
 * HTMLImageElement provides special properties and methods for manipulating the layout and presentation of <img>
 * elements.
 */
public class HTMLImageElement extends HTMLElement implements CanvasImageSource {

/**
 * Returns the integer reflecting the width HTML attribute, indicating the rendered width of the image in CSS pixels.
 */
public native int getWidth();

/**
 * Sets the integer reflecting the width HTML attribute, indicating the rendered width of the image in CSS pixels.
 */
public native void setWidth(int aValue);

/**
 * Returns the integer reflecting the height HTML attribute, indicating the rendered width of the image in CSS pixels.
 */
public native int getHeight();

/**
 * Sets the integer reflecting the height HTML attribute, indicating the rendered width of the image in CSS pixels.
 */
public native void setHeight(int aValue);

/**
 * Sets the size of the image in CSS pixels.
 */
public void setSize(int aW, int aH)  { setWidth(aW); setHeight(aH); }

/**
 *  Sets the HTML 'src' attribute, containing the full URL of the image including base URI.
 */
public void setSrc(String aSrc)  { setAttribute("src", aSrc); }

}