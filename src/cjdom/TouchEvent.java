package cjdom;

/**
 * TouchEvent interface represents an event sent when the state of contacts with a touch-sensitive surface changes.
 * This surface can be a touch screen or trackpad, for example. The event can describe one or more points of contact
 * with the screen and includes support for detecting movement, addition and removal of contact points, and so forth.
 */
public class TouchEvent extends Event {
    
    // The array of touches
    Touch       _touches[];
    
    // The array of changed touches
    Touch       _changedTouches[];

/**
 * Returns all Touch objects representing all current points of contact with the surface, regardless of target or
 * changed status
 */
public Touch[] getTouches()
{
    if(_touches!=null) return _touches;
    int tc = getTouchCount();
    _touches = new Touch[tc];
    for(int i=0;i<tc;i++) {
        _touches[i] = new Touch();
        _touches[i]._jso = getTouch(i);
    }
    return _touches;
}

/**
 * Returns the number of touches.
 */
native int getTouchCount();

/**
 * Returns individual touch at given index.
 */
native Touch getTouch(int anIndex);

/**
 * Returns the Touch objects representing individual points of contact whose states changed between the previous touch
 * event and this one
 */
public Touch[] getChangedTouches()
{
    if(_changedTouches!=null) return _changedTouches;
    int tc = getChangedTouchCount();
    _changedTouches = new Touch[tc];
    for(int i=0;i<tc;i++) {
        _changedTouches[i] = new Touch();
        _changedTouches[i]._jso = getChangedTouch(i);
    }
    return _changedTouches;
}

/**
 * Returns the number of changed touches.
 */
native int getChangedTouchCount();

/**
 * Returns individual changed touch at given index.
 */
native Touch getChangedTouch(int anIndex);

}