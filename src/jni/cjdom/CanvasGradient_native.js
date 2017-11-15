

/* addColorStop(offset,color) */
function _CHEERPJ_COMPRESS(ZN5cjdom14CanvasGradient12addColorStopEDN4java4lang6StringEV)(a0,a1,a2,a3,p)
{
    var cg = a0._jso0;
    var color = toJS_String(a3);
    cg.addColorStop(a1, color);
}

/* Java String to JS */
function toJS_String(aStr)
{
    var len = aStr.value0.length;
    var str = ""; for(i=1;i<len;i++) { str += String.fromCharCode(aStr.value0[i]); }
    return str;
}
