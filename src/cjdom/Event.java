package cjdom;

/**
 * DOM Events are sent to notify code of interesting things that have taken place. Each event is represented by an
 * object which is based on the Event interface, and may have additional custom fields and/or functions used to get
 * additional information about what happened. Events can represent everything from basic user interactions to
 * automated notifications of things happening in the rendering model.
 */
public class Event extends JSProxy {

/**
 * Cancels the event (if it is cancelable).
 */
public native void preventDefault();

/**
 * Stops the propagation of events further along in the DOM.
 */
public native void stopPropagation();

}