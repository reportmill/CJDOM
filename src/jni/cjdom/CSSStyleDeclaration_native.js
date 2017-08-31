

//
// setProperty(name,value)
//
function _CHEERPJ_COMPRESS(ZN5cjdom19CSSStyleDeclaration11setPropertyEN4java4lang6StringN4java4lang6StringN4java4lang6StringEV)(a0,a1,a2,a3,p)
{
    var style = a0._jso0;
    var name = toJS_String(a1);
    var value = toJS_String(a2);
    style.setProperty(name, value);
}

//
// setCSSText(str)
//
function _CHEERPJ_COMPRESS(ZN5cjdom19CSSStyleDeclaration10setCSSTextEN4java4lang6StringEV)(a0,a1,p)
{
    var style = a0._jso0;
    var str = toJS_String(a1);
    style.cssText = str;
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
