
//
// createBlobJSO(obj)
//
function _CHEERPJ_COMPRESS(ZN5cjdom4Blob13createBlobJSOEN4java4lang6ObjectN4java4lang6StringEN4java4lang6Object)(a0,a1,p)
{
    var arr = a0.slice(1); // First element is array type char
    var arrBuf = arr.buffer;
    var type = a1? toJS_String(a1) : null;
    var typeDict = type? { type: '"' + a1 + '"' } : null;
    var blob = new Blob([arrBuf], typeDict);
    return blob;
}

//
// getSize()
//
function _CHEERPJ_COMPRESS(ZN5cjdom4Blob7getSizeEVEI)(a0,p)
{
    var blob = a0._jso0;
    return blob.size;
}

//
// getType()
//
function _CHEERPJ_COMPRESS(ZN5cjdom4Blob7getTypeEVEN4java4lang6String)(a0,p)
{
    var blob = a0._jso0;
    return blob.type;
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
