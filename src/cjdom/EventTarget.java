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
 * Dispatches an Event at the specified EventTarget, invoking the affected EventListeners in the appropriate order.
 */
public native void dispatchEvent(Event anEvent);

/**
 * Called from JavaScript to post an event.
 */
public void postEvent(String aType, EventListener aLsnr, Object aJSO)
{
    Event event = createEvent(aType);
    event._jso = aJSO;
    event._type = aType;
    aLsnr.handleEvent(event);
}

/**
 * Called from JavaScript to post an event.
 */
public static void postEvent2(String aType, EventListener aLsnr, Object aJSO)
{
    Event event = createEvent(aType);
    event._jso = aJSO;
    event._type = aType;
    aLsnr.handleEvent(event);
}

/**
 * Creates an event for given type.
 */
static Event createEvent(String aType)
{
    switch(aType) {
        case "mousedown": case "mousemove": case "mouseup": return new MouseEvent();
        case "keydown": case "keypress": case "keyup": return new KeyboardEvent();
        case "touchstart": case "touchmove": case "touchend": return new TouchEvent();
        case "cut": case "copy": case "paste": return new ClipboardEvent();
        case "dragstart": case "dragover": case "drag": case "drop": return new DragEvent();
        case "dragenter": case "dragexit": case "dragleave": case "dragend": return new DragEvent();
        case "wheel": return new WheelEvent();
        default: return new Event();
    }
}

}