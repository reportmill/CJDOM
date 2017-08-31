

//
// current()
//
function _CHEERPJ_COMPRESS(ZN7cheerpj6Window10currentJSOEVEN4java4lang6Object)(p)
{
    return window;
}

//
// getDocument()
//
function _CHEERPJ_COMPRESS(ZN7cheerpj6Window14getDocumentJSOEVEN4java4lang6Object)(a0,p)
{
    var win = a0._jso0;
    return win.document;
}

//
// getInnerWidth()
//
function _CHEERPJ_COMPRESS(ZN7cheerpj6Window13getInnerWidthEVEI)(a0,p)
{
    var win = a0._jso0;
    return win.innerWidth;
}

//
// getInnerHeight()
//
function _CHEERPJ_COMPRESS(ZN7cheerpj6Window14getInnerHeightEVEI)(a0,p)
{
    var win = a0._jso0;
    return win.innerHeight;
}

//
// open(url,name,features)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj6Window7openJSOEN4java4lang6StringN4java4lang6StringN4java4lang6StringEN4java4lang6Object)(a0,a1,a2,a3,p)
{
    var win = a0._jso0;
    var url = toJS_String(a1);
    var name = toJS_String(a2);
    //var features = toJS_String(a3);
    var win2 = win.open(url, name);
    return win2;
}

//
// setInterval(Runnable,delay)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj6Window11setIntervalEN4java4lang8RunnableIEI)(a0,a1,p)
{
    return window.setInterval(() => cjCall(a0, "run"), a1);
}

//
// clearInterval(id)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj6Window13clearIntervalEIEV)(a0,p)
{
    window.clearInterval(a0);
}

//
// setTimeout(Runnable,delay)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj6Window10setTimeoutEN4java4lang8RunnableIEI)(a0,a1,p)
{
    return window.setTimeout(() => cjCall(a0, "run"), a1);
}

//
// clearTimeout(id)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj6Window12clearTimeoutEIEV)(a0,p)
{
    window.clearTimeout(a0);
}
