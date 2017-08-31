package cjdom;

/**
 * Touch represents a single contact point on a touch-sensitive device. The contact point is commonly a finger or
 * stylus and the device may be a touchscreen or trackpad.
 */
public class Touch extends Event {

/**
 * Returns the X coordinate of touch point relative to left edge of browser viewport, not including any scroll offset.
 */
public native int getClientX();

/**
 * Returns the Y coordinate of touch point relative to top edge of browser viewport, not including any scroll offset.
 */
public native int getClientY();

}