package cjdom;

/**
 * URL represents an object providing static methods used for creating object URLs.
 */
public class URL extends JSProxy {

/**
 * Creates and return a URL object composed from the given parameters.
 */
//public URL(Object anObj)  { }

/**
 * Returns a DOMString containing a unique blob URL, that is a URL with blob: as its scheme, followed by an opaque
 * string uniquely identifying the object in the browser.
 * Takes a File, Blob or MediaStream.
 */
public static String createObjectURL(Object anObj)
{
    // Handle Blob
    if(anObj instanceof Blob) { Blob blob = (Blob)anObj;
        Object str = createObjectURLJSO(blob._jso);
        String str2 = JSProxy.getString(str);
        return str2;
    }
    
    // Handle anything not supported
    throw new RuntimeException("URL: Can't create URL for " + anObj);
}

/**
 * Returns a DOMString containing a unique blob URL, that is a URL with blob: as its scheme, followed by an opaque
 * string uniquely identifying the object in the browser.
 * Takes a File, Blob or MediaStream.
 */
static native String createObjectURLJSO(Object anObj);

}