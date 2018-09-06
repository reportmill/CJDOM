
/* createBlobJSO(obj) */
function _CHEERPJ_COMPRESS(ZN5cjdom4Blob13createBlobJSOEN4java4lang6ObjectN4java4lang6StringEN4java4lang6Object)(a0,a1,p)
{
    var arr = a0.slice(1); /* First element is array type char */
    var arrBuf = arr.buffer;
    var type = a1? cjStringJavaToJs(a1) : null;
    var typeDict = type? { type: '"' + a1 + '"' } : null;
    var blob = new Blob([arrBuf], typeDict);
    return blob;
}

/* getSize() */
function _CHEERPJ_COMPRESS(ZN5cjdom4Blob7getSizeEVEI)(a0,p)
{
    var blob = a0._jso0;
    return blob.size;
}

/* getTypeJSO() */
function _CHEERPJ_COMPRESS(ZN5cjdom4Blob10getTypeJSOEVEN4java4lang6Object)(a0,p)
{
    var blob = a0._jso0;
    return blob.type;
}
