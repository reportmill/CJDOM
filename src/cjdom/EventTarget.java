package cjdom;

/**
 * EventTarget is an interface implemented by objects that can receive events and may have listeners for them.
 */
public class EventTarget extends JSProxy {

/**
 * Register an event handler of a specific event type on the EventTarget.
 */
public void addEventListener(String aType, EventListener aLsnr)
{
    addEventListenerJSO(aType, aLsnr);
}

/**
 * Register an event handler of a specific event type on the EventTarget.
 */
native void addEventListenerJSO(String aType, EventListener aLsnr);

/**
 * Removes an event listener from the EventTarget.
 */
public void removeEventListener(String aType, EventListener aLsnr)
{
    removeEventListenerJSO(aType, aLsnr);
}

/**
 * Removes an event listener from the EventTarget.
 */
native void removeEventListenerJSO(String aType, EventListener aLsnr);

/**
 * Called from JavaScript to post an event.
 */
public void postEvent(String aType, EventListener aLsnr, Object aJSO)
{
    Event event = createEvent(aType);
    event._jso = aJSO;
    aLsnr.handleEvent(event);
}

/**
 * Creates an event for given type.
 */
Event createEvent(String aType)
{
    switch(aType) {
        case "mousedown": case "mousemove": case "mouseup": return new MouseEvent();
        case "keydown": case "keypress": case "keyup": return new KeyboardEvent();
        case "touchstart": case "touchmove": case "touchend": return new TouchEvent();
        case "wheel": return new WheelEvent();
        default: return new Event();
    }
}

}