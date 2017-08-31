package cjdom;

/**
 * HTMLDocument provides access to special properties and methods not present by default on a regular (XML) document.
 */
public class HTMLDocument extends Document {

/**
 * Returns the current HTMLDocument.
 */
public static HTMLDocument current()
{
    Document doc = Document.current();
    return doc instanceof HTMLDocument? (HTMLDocument)doc : null;
}

/**
 * Override to return body as HTMLBodyElement.
 */
public HTMLBodyElement getBody()
{
    Element body = super.getBody();
    return body instanceof HTMLBodyElement? (HTMLBodyElement)body : null;
}


}