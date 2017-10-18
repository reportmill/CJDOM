package cjdom;

/**
 * TextMetrics represents the dimension of text in canvas, as created by the CanvasRenderingContext2D.measureText()
 * method.
 */
public class TextMetrics extends JSProxy {

/**
 * Returns the calculated width of a segment of inline text in CSS pixels.
 */
public native double getWidth();

}