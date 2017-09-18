
//
// addEventListenerJSO(type,lsnr)
//
function _CHEERPJ_COMPRESS(ZN5cjdom11EventTarget19addEventListenerJSOEN4java4lang6StringN5cjdom13EventListenerEV)(a0,a1,a2,p)
{
    var targ = a0._jso0;
    var type = toJS_String(a1);
    targ.addEventListener(type, (e) => callPostEvent(a0, a1, a2, e));
}

function callPostEvent(a0, a1, a2, e)
{
    //var type = toJS_String(a1);
    //cjCall(a0, "postEvent", type, a2, e);

    // Get thread
    var callThread = threads[0];
    if(callThread.state == "BLOCKED_ON_WAIT") {
        callThread = new CheerpJThread();
        threads.push(callThread);
        callThread.state = "READY";
    }

    // Call static method
    var meth = "10postEvent2EN4java4lang6StringN5cjdom13EventListenerN4java4lang6ObjectEV";
    cheerpjRunStaticMethod(callThread, "cjdom/EventTarget", meth, a1, a2, e);
}

//
// removeEventListenerJSO(type,lsnr)
//
function _CHEERPJ_COMPRESS(ZN5cjdom11EventTarget22removeEventListenerJSOEN4java4lang6StringN5cjdom13EventListenerEV)(a0,a1,a2,p)
{
    var targ = a0._jso0;
    var type = toJS_String(a1);
    var lsnr = a2;
    //targ.removeEventListener(type, lsnr);
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
