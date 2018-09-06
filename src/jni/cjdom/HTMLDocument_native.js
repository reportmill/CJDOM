
/* execCommand(cname) */
function _CHEERPJ_COMPRESS(ZN5cjdom12HTMLDocument11execCommandEN4java4lang6StringEV)(a0,a1,p)
{
    var doc = a0._jso0;
    var cname = cjStringJavaToJs(a1);
    var worked = doc.execCommand(cname);
    if(!worked) console.log("HTMLDocument.execCommand: Failed for command: " + cname);
}
