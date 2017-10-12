package cjdom;

/**
 * ClipboardEvent represents events providing information related to modification of the clipboard, that is cut, copy,
 * and paste events.
 */
public class ClipboardEvent extends Event {

    // The DataTransfer object
    DataTransfer          _dataTrans;

/**
 * Returns the DataTransfer object containing the data affected by the user-initiated cut, copy, or paste.
 */
public DataTransfer getClipboardData()
{
    if(_dataTrans!=null) return _dataTrans;
    DataTransfer dt = new DataTransfer();
    dt._jso = getClipboardDataJSO();
    return dt;
}

/**
 * Returns the data transfer JSO.
 */
native Object getClipboardDataJSO();

/**
 * Standard toString implementation.
 */
public String toString()
{
    StringBuilder sb = new StringBuilder("ClipboardEvent { ").append(getClipboardData()).append(" }");
    return sb.toString();
}

}