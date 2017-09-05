package cjdom;

/**
 * A base class for any class that references a JavaScript object.
 */
public class JSProxy {

    // The JavaScript object
    Object     _jso;

/**
 * Returns a Java String for JS String.
 */
public static String getString(Object anObj)
{
    StringBuilder sb = new StringBuilder();
    int len = getStringLength(anObj);
    for(int i=0;i<len;i++) {
        char c = getStringCharAt(anObj,i);
        sb.append(c);
    }
    return sb.toString();
}

/**
 * Returns the length.
 */
public static native int getStringLength(Object anObj);

/**
 * Returns the character at given index.
 */
public static native char getStringCharAt(Object anObj, int anIndex);

}