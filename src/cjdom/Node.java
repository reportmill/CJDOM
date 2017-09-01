package cjdom;

/**
 * Node is an interface from which a number of DOM API object types inherit; it allows these various types to be
 * treated similarly, for example inheriting the same set of methods, or being tested in the same way.
 */
public class Node extends EventTarget {

/**
 * Adds a child node argument as the last child to the current node.
 * If the argument referenced an existing node on the DOM tree, the node will be detached from its current position
 * and attached at the new position.
 */
public void appendChild(Node aChild)
{
    appendChildJSO(aChild);
}

/**
 * Removes a child node from the current element, which must be a child of the current node.
 */
public void removeChild(Node aChild)
{
    removeChildJSO(aChild);
}

/**
 * Adds a child node as the last child to the current node.
 */
native void appendChildJSO(Node aChild);

/**
 * Removes a child node from the current element, which must be a child of the current node.
 */
native void removeChildJSO(Node aChild);

}