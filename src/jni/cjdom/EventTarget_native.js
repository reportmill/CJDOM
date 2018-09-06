
/* addEventListenerJSO(type,lsnr) */
function _CHEERPJ_COMPRESS(ZN5cjdom11EventTarget19addEventListenerJSOEN4java4lang6StringN5cjdom13EventListenerEV)(a0,a1,a2,p)
{
    var targ = a0._jso0;
    var type = cjStringJavaToJs(a1);
    targ.addEventListener(type, function(e) { cjCall("cjdom.EventTarget", "postEvent", type, a2, e); });
}

/* removeEventListenerJSO(type,lsnr) */
function _CHEERPJ_COMPRESS(ZN5cjdom11EventTarget22removeEventListenerJSOEN4java4lang6StringN5cjdom13EventListenerEV)(a0,a1,a2,p)
{
    var targ = a0._jso0;
    var type = cjStringJavaToJs(a1);
    var lsnr = a2;
    /* targ.removeEventListener(type, lsnr); */
}

/* dispatchEvent(event) */
function _CHEERPJ_COMPRESS(ZN5cjdom11EventTarget13dispatchEventEN5cjdom5EventEV)(a0,a1,p)
{
    var targ = a0._jso0;
    var event = a1._jso0;
    targ.dispatchEvent(event);
}
