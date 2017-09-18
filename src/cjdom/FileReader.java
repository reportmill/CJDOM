package cjdom;

/**
 * FileReader lets web applications asynchronously read the contents of files (or raw data buffers) stored on
 * the user's computer, using File or Blob objects to specify the file or data to read.
 */
public class FileReader extends EventTarget {

/**
 * Creates a new FileReader.
 */
public FileReader()
{
    _jso = createFileReaderJSO();
}

/**
 * Creates a FileReader JSO.
 */
native Object createFileReaderJSO();

/**
 * Starts reading the contents of the specified Blob, once finished, the result attribute contains an ArrayBuffer
 * representing the file's data.
 */
public native void readAsArrayBuffer(Blob aBlob);

/**
 * Returns the bytes.
 */
public byte[] getResult()
{
    Object result = getResultJSO();
    ArrayBuffer ab = new ArrayBuffer();
    ab._jso = result;
    return ab.getBytes();
}

/**
 * Returns the result.
 */
native Object getResultJSO();

/**
 * readBytesAndWait
 */
synchronized void readBytesAndWait(Blob aBlob)
{
    addEventListener("loadend", e -> readBytesNotify());
    readAsArrayBuffer(aBlob);
    
    // Wait until done
    try { wait(); }
    catch(Exception e) { throw new RuntimeException(e); }
}

/**
 * readBytesNotify
 */
synchronized void readBytesNotify()
{
    notify();
}

/**
 * Returns the bytes for the Blob.
 */
public static byte[] getBytes(Blob aBlob)
{
    // Create FileReader and readBytes
    FileReader frdr = new FileReader();
    frdr.readBytesAndWait(aBlob);
    
    // Get result
    byte bytes[] = frdr.getResult();
    return bytes;
}

}