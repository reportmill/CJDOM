package cjdom;
import java.util.Arrays;

/**
 * DataTransfer is used to hold the data that is being dragged during a drag and drop operation. It may hold one or more
 * data items, each of one or more data types. For more information about drag and drop, see HTML Drag and Drop API.
 */
public class DataTransfer extends JSProxy {
    
    // The types
    String            _types[];
    
    // The items
    DataTransferItem  _items[];
    
    // The Files
    File              _files[];

/**
 * Returns whether DataTransfer has given type.
 */
public boolean hasType(String aType)
{
    for(String type : getTypes())
        if(type.equals(aType))
            return true;
    return false;
}

/**
 * Returns an array of strings giving the formats that were set in the dragstart event.
 */
public String[] getTypes()
{
    if(_types!=null) return _types;
    int count = getTypeCount();
    _types = new String[count];
    for(int i=0;i<count;i++) _types[i] = getString(getType(i));
    return _types;
}

/**
 * Returns the number of types.
 */
native int getTypeCount();

/**
 * Returns the number of types.
 */
native Object getType(int anIndex);

/**
 * Returns the data for a given type, or an empty string if data for that type does not exist or the data transfer
 * contains no data.
 */
public String getData(String aType)
{
    Object dstr = getDataJSO(aType);
    return getString(dstr);
}

/**
 * Returns the data for a given type.
 */
native String getDataJSO(String aType);

/**
 * Set the data for a given type. If data for the type does not exist, it is added at the end, such that the last item
 * in the types list will be the new format. If data for the type already exists, the existing data is replaced in the
 * same position.
 */
public native void setData(String aType, String theData);

/**
 * Returns an array of all the local files available on the data transfer. If the drag operation doesn't involve
 * dragging files, this property is an empty list.
 */
public File[] getFiles()
{
    if(_files!=null) return _files;
    int count = getFileCount();
    _files = new File[count];
    for(int i=0;i<count;i++) _files[i] = getFile(i);
    return _files;
}

/**
 * Returns an the number of all the local files available on the data transfer.
 */
native int getFileCount();

/**
 * Returns an the local files available on the data transfer at given index.
 */
native File getFile(int anIndex);

/**
 * Sets the files.
 */
public void setFiles(File ... theFiles)
{
    _files = Arrays.copyOf(theFiles, theFiles.length);
    
}

/**
 * Sets the image Element element to use for the drag feedback image.
 */
public native void setDragImage(Element aImg, double xOffset, double yOffset);

/**
 * Returns an array of DataTransferItem objects representing drag data.
 */
public DataTransferItem[] getItems()
{
    if(_items!=null) return _items;
    int count = getItemCount();
    _items = new DataTransferItem[count];
    for(int i=0;i<count;i++) {
        _items[i] = new DataTransferItem();
        _items[i]._jso = getItemJSO(i);
    }
    return _items;
}

/**
 * Returns the number of data transfer items.
 */
native int getItemCount();

/**
 * Returns the DataTransferItem JSO at index.
 */
native Object getItemJSO(int anIndex);

}