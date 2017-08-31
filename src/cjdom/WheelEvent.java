package cjdom;

/**
 * The WheelEvent interface represents events that occur due to the user moving a mouse wheel or similar input device.
 */
public class WheelEvent extends MouseEvent {

/**
 * Returns a double representing the horizontal scroll amount.
 */
public native double getDeltaX();

/**
 * Returns a double representing the vertical scroll amount.
 */
public native double getDeltaY();

/**
 * Returns a double representing the scroll amount for the z-axis.
 */
public native double getDeltaZ();

/**
 * Returns an unsigned long representing the unit of the delta values scroll amount.
 */
public native int getDeltaMode();

}