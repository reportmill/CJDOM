package cjdom;

/**
 * A custom class.
 */
public interface EventListener <E extends Object> {

void handleEvent(E anEvent);

}