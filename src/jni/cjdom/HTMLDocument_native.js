
//
// execCommand(cname)
//
function _CHEERPJ_COMPRESS(ZN5cjdom12HTMLDocument11execCommandEN4java4lang6StringEV)(a0,a1,p)
{
    var doc = a0._jso0;
    var cname = toJS_String(a1);
    var worked = doc.execCommand(cname);
    if(!worked) console.log("HTMLDocument.execCommand: Failed for command: " + cname);
}

//
// Java String to JS
//
function toJS_String(aStr)
{
    var len = aStr.value0.length;
    var str = ""; for(i=1;i<len;i++) { str += String.fromCharCode(aStr.value0[i]); }
    return str;
}
