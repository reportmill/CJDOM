package cjdom;

/**
 * DataTransferItem object represents one drag data item. During a drag operation, each drag event has a dataTransfer
 * property which contains a list of drag data items. Each item in the list is a DataTransferItem object.
 */
public class DataTransferItem extends JSProxy {

    // The kind
    String          _kind;
    
    // The mime type
    String          _type;
    
    // The file object (if kind file)
    File            _file;
    
    // The string (if kind string)
    String          _string;
    
/**
 * Returns the kind of drag data item, string or file.
 */
public String getKind()  { return _kind!=null? _kind : (_kind=getString(getKindJSO())); }

/**
 * Returns the kind of drag data item, string or file.
 */
native Object getKindJSO();

/**
 * Returns the drag data item's type, typically a MIME type.
 */
public String getType()  { return _type!=null? _type : (_type=getString(getTypeJSO())); }

/**
 * Returns the drag data item's type, typically a MIME type.
 */
native Object getTypeJSO();

/**
 * Returns whether item is file.
 */
public boolean isFile()  { return getKind().equals("file"); }

/**
 * Returns the File object associated with the drag data item (or null if the drag item is not a file).
 */
public File getAsFile()
{
    if(_file!=null) return _file;
    _file = new File();
    _file._jso = getAsFileJSO();
    return _file;
}

/**
 * Returns the File object associated with the drag data item (or null if the drag item is not a file).
 */
native Object getAsFileJSO();

/**
 * Returns whether item is string.
 */
public boolean isString()  { return getKind().equals("string"); }

/**
 * Invokes the specified callback with the drag data item string as its argument.
 */
public String getAsString()  { return _string!=null? _string : (_string=getString(getAsStringJSO())); }

/**
 * Invokes the specified callback with the drag data item string as its argument.
 */
native Object getAsStringJSO();

}