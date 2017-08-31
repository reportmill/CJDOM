

//
// getStyle()
//
function _CHEERPJ_COMPRESS(ZN7cheerpj11HTMLElement11getStyleJSOEVEN7cheerpj19CSSStyleDeclaration)(a0,p)
{
    var emt = a0._jso0;
    return emt.style;
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
