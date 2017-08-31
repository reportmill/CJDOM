package cjdom;

/**
 * The HTMLElement interface represents any HTML element.
 */
public class HTMLElement extends Element {
    
    // The object representing the declarations of an element's style attributes
    CSSStyleDeclaration   _style;

/**
 * Returns the object representing the declarations of an element's style attributes.
 */
public CSSStyleDeclaration getStyle()
{
    if(_style!=null) return _style;
    _style = new CSSStyleDeclaration();
    _style._jso = getStyleJSO();
    return _style;
}

/**
 * Returns the object representing the declarations of an element's style attributes.
 */
native CSSStyleDeclaration getStyleJSO();

}