

//
// setAttribute(name,value)
//
function _CHEERPJ_COMPRESS(ZN5cjdom7Element12setAttributeEN4java4lang6StringN4java4lang6StringEV)(a0,a1,a2,p)
{
     var emt = a0._jso0;
     var name = toJS_String(a1);
     var value = toJS_String(a2);
     emt.setAttribute(name, value);
}

//
// setInnerHTML(str)
//
function _CHEERPJ_COMPRESS(ZN5cjdom7Element12setInnerHTMLEN4java4lang6StringEV)(a0,a1,p)
{
    var emt = a0._jso0;
    var str = toJS_String(a1);
    emt.innerHTML = str;
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
