package cjdom;

/**
 * MouseEvent interface represents events that occur due to the user interacting with a pointing device (such as a
 * mouse). Common events using this interface include click, dblclick, mouseup, mousedown.
 */
public class MouseEvent extends Event {

/**
 * Returns the X coordinate of the mouse pointer in local (DOM content) coordinates.
 */
public native int getClientX();

/**
 * Returns the Y coordinate of the mouse pointer in local (DOM content) coordinates.
 */
public native int getClientY();

/**
 * Returns true if the shift key was down when the mouse event was fired.
 */
public native boolean isShiftKey();

/**
 * Returns true if the alt key was down when the mouse event was fired.
 */
public native boolean isAltKey();

/**
 * Returns true if the control key was down when the mouse event was fired.
 */
public native boolean isCtrlKey();

/**
 * Returns true if the meta key was down when the mouse event was fired.
 */
public native boolean isMetaKey();

}