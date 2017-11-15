
/* createFileReaderJSO */
function _CHEERPJ_COMPRESS(ZN5cjdom10FileReader19createFileReaderJSOEVEN4java4lang6Object)(a0,p)
{
    return new FileReader();
}

/* readAsArrayBuffer(Blob) */
function _CHEERPJ_COMPRESS(ZN5cjdom10FileReader17readAsArrayBufferEN5cjdom4BlobEV)(a0,a1,p)
{
    var frdr = a0._jso0;
    var blob = a1._jso0;
    frdr.readAsArrayBuffer(blob);
}

/* getResultJSO() */
function _CHEERPJ_COMPRESS(ZN5cjdom10FileReader12getResultJSOEVEN4java4lang6Object)(a0,p)
{
    var frdr = a0._jso0;
    var abuf = frdr.result;
    var intArray = new Int8Array(abuf);
    return intArray;
}
