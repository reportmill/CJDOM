package cjdom;

/**
 * File provides information about files and allows JavaScript in a web page to access their content.
 */
public class File extends Blob {

    // The name
    String       _name;
    
/**
 * Creates a new File.
 */
protected File()  { }

/**
 * Creates a new File from given object and type.
 */
public File(Object anObj, String aType)  { super(anObj, aType); }
    
/**
 * Returns the name of the file referenced by the File object.
 */
public String getName()  { return _name!=null? _name : (_name=getString(getNameJSO())); }

/**
 * Returns the name of the file referenced by the File object.
 */
native Object getNameJSO();

/**
 * Returns the last modified time of the file, in millisecond since the UNIX epoch (January 1st, 1970 at Midnight).
 */
public native long getLastModified();

}