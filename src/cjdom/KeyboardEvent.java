package cjdom;

/**
 * KeyboardEvent describes a user interaction with the keyboard. Each event describes a key; the event type (keydown,
 * keypress, or keyup) identifies what kind of activity was performed.
 */
public class KeyboardEvent extends Event {

/**
 * Returns a Number representing a system and implementation dependent numerical code identifying the unmodified value
 * of the pressed key.
 */
public native int getKeyCode();

/**
 * Returns a Boolean that is true if the Shift key was active when the key event was generated.
 */
public native boolean isShiftKey();

/**
 * Returns a Boolean that is true if the Alt ( Option or ? on OS X) key was active when the key event was generated.
 */
public native boolean isAltKey();

/**
 * Returns a Boolean that is true if the Ctrl key was active when the key event was generated.
 */
public native boolean isCtrlKey();

/**
 * Returns a Boolean that is true if the Meta key (on Mac keyboards, the Command key; on Windows keyboards, the
 * Windows key) was active when the key event was generated.
 */
public native boolean isMetaKey();

}