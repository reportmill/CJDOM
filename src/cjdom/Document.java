package cjdom;

/**
 * The Document interface represents any web page loaded in the browser and serves as an entry point into the
 * web page's content, which is the DOM tree.
 * https://developer.mozilla.org/en-US/docs/Web/API/Document
 */
public class Document extends Node {
    
    // The body element
    Element      _body;

/**
 * Creates an element.
 */
public Element createElement(String aName)
{
    // Create JSO
    Object jso = createElementJSO(aName);
    
    // Create element
    Element emt = null;
    if(aName.equalsIgnoreCase("img"))
        emt = new HTMLImageElement();
    else if(aName.equalsIgnoreCase("canvas"))
        emt = new HTMLCanvasElement();
    
    // Set JSO and return element
    emt._jso = jso;
    return emt;
}

/**
 * Returns the body element.
 */
public Element getBody()
{
    if(_body!=null) return _body;
    HTMLBodyElement body = new HTMLBodyElement();
    body._jso = getBodyJSO();
    return _body = body;
}

/**
 * Sets the color.
 */
public void setColor(String aColor)
{
    setColorJSO(aColor);
}

/**
 * Returns the current document.
 */
public static Document current()
{
    return Window.current().getDocument();
}

/**
 * Creates an element.
 */
native Object createElementJSO(String aName);
    
/**
 * Returns the body element.
 */
native Object getBodyJSO();

/**
 * Sets the color.
 */
native void setColorJSO(String aColor);

}