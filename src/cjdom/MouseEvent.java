package cjdom;

/**
 * MouseEvent interface represents events that occur due to the user interacting with a pointing device (such as a
 * mouse). Common events using this interface include click, dblclick, mouseup, mousedown.
 */
public class MouseEvent extends Event {

/**
 * Returns int to indicates which button was pressed on the mouse to trigger the event:
 *   0: Main button pressed, usually the left button or the un-initialized state
 *   1: Auxiliary button pressed, usually the wheel button or the middle button (if present)
 *   2: Secondary button pressed, usually the right button
 *   3: Fourth button, typically the Browser Back button
 *   4: Fifth button, typically the Browser Forward button
 */
public native int getButton();

/**
 * Returns the buttons being depressed (if any) when the mouse event was fired:
 *   0: No button or un-initialized
 *   1: Primary button (usually left)
 *   2: Secondary button (usually right)
 *   3: 4th button (typically the "Browser Back" button)
 *   4: 5th button (typically the "Browser Forward" button)
 */
public native int getButtons();

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