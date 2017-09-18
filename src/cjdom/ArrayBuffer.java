package cjdom;

/**
 * A custom class.
 */
public class ArrayBuffer extends JSProxy {
    
    // The length
    int       _len = -1;
    
    // The bytes
    byte      _bytes[];

/**
 * Returns the length.
 */
public int length()  { return _len>=0? _len : (_len=lengthJSO()); }

/**
 * Returns the length.
 */
native int lengthJSO();

/**
 * Returns the bytes;
 */
public byte[] getBytes()
{
    if(_bytes!=null) return _bytes;
    int len = length();
    _bytes = new byte[len];
    for(int i=0;i<len;i++)
        _bytes[i] = (byte)getByteJSO(i);
    return _bytes;
}

/**
 * Returns the byte at index.
 */
native int getByteJSO(int anIndex);

}