package cjdom;

/**
 * A DragEvent represents a drag and drop interaction. The user initiates a drag by placing a pointer device (such as
 * a mouse) on the touch surface and then dragging the pointer to a new location (such as another DOM element).
 * Applications are free to interpret a drag and drop interaction in an application-specific way.
 */
public class DragEvent extends MouseEvent {

    // The DataTransfer object
    DataTransfer          _dataTrans;

/**
 * Returns the data that is transferred during a drag and drop interaction.
 */
public DataTransfer getDataTransfer()
{
    if(_dataTrans!=null) return _dataTrans;
    DataTransfer dt = new DataTransfer();
    dt._jso = getDataTransferJSO();
    return dt;
}

/**
 * Returns the data transfer JSO.
 */
native Object getDataTransferJSO();

/**
 * Standard toString implementation.
 */
public String toString()
{
    StringBuilder sb = new StringBuilder("DragEvent { ");
    DataTransfer dt = getDataTransfer();
    DataTransferItem dtis[] = dt.getItems(), dti = dtis.length>0? dtis[0] : null;
    sb.append("kind=").append(dti!=null? dti.getKind() : null);
    sb.append(", type=").append(dti!=null? dti.getType() : null);
    sb.append(" }");
    return sb.toString();
}

}