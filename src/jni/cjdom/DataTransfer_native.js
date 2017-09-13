
//
// getTypeCount()
//
function _CHEERPJ_COMPRESS(ZN5cjdom12DataTransfer12getTypeCountEVEI)(a0,p)
{
    var dt = a0._jso0;
    return dt.types.length;
}

//
// getType(index)
//
function _CHEERPJ_COMPRESS(ZN5cjdom12DataTransfer7getTypeEIEN4java4lang6Object)(a0,a1,p)
{
    var dt = a0._jso0;
    return dt.types[a1];
}

//
// getDataJSO(type)
//
function _CHEERPJ_COMPRESS(ZN5cjdom12DataTransfer10getDataJSOEN4java4lang6StringEN4java4lang6String)(a0,a1,p)
{
    var dt = a0._jso0;
    var type = toJS_String(a1);
    return dt.getData(type);
}

//
// setData(name,data)
//
function _CHEERPJ_COMPRESS(ZN5cjdom12DataTransfer7setDataEN4java4lang6StringN4java4lang6StringEV)(a0,a1,a2,p)
{
    var dt = a0._jso0;
    var type = toJS_String(a1);
    var data = toJS_String(a2);
    dt.setData(type, data);
}

//
// getFileCount()
//
function _CHEERPJ_COMPRESS(ZN5cjdom12DataTransfer12getFileCountEVEI)(a0,p)
{
    var dt = a0._jso0;
    return dt.files.length;
}

//
// getFile(index)
//
function _CHEERPJ_COMPRESS(ZN5cjdom12DataTransfer7getFileEIEN5cjdom4File)(a0,a1,p)
{
    var dt = a0._jso0;
    return dt.files[a1];
}

//
// setDragImage(img,offx,offy)
//
function _CHEERPJ_COMPRESS(ZN5cjdom12DataTransfer12setDragImageEN5cjdom7ElementDDEV)(a0,a1,a2,a3,a4,a5,p)
{
    var dt = a0._jso0;
    var img = a1._jso0;
    console.log("SetDragImage: " + a2 + ", " + a4);
    console.log(img);
    dt.setDragImage(img, a2, a4);
}

//
// getItemCount()
//
function _CHEERPJ_COMPRESS(ZN5cjdom12DataTransfer12getItemCountEVEI)(a0,p)
{
    var dt = a0._jso0;
    return dt.items.length;
}

//
// getItemJSO(index)
//
function _CHEERPJ_COMPRESS(ZN5cjdom12DataTransfer10getItemJSOEIEN4java4lang6Object)(a0,a1,p)
{
    var dt = a0._jso0;
    return dt.items[a1];
}

//
// Java String to JS
//
function toJS_String(aStr)
{
    var len = aStr.value0.length;
    var str = "";
    for(i=1;i<len;i++) {
        str += String.fromCharCode(aStr.value0[i]);
    }
    return str;
}
