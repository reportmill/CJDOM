

/* createElementJSO(name) */
function _CHEERPJ_COMPRESS(ZN5cjdom8Document16createElementJSOEN4java4lang6StringEN4java4lang6Object)(a0,a1,p)
{
    var doc = a0._jso0;
    var name = toJS_String(a1);
    var emt = doc.createElement(name);
    return emt;
}

/* getBodyJSO() */
function _CHEERPJ_COMPRESS(ZN5cjdom8Document10getBodyJSOEVEN4java4lang6Object)(a0,p)
{
    var doc = a0._jso0;
    return doc.body;
}

/* setColorJSO(str) */
function _CHEERPJ_COMPRESS(ZN5cjdom8Document11setColorJSOEN4java4lang6StringEV)(a0,a1,p)
{
    a0._jso0.bgColor = toJS_String(a1);
}

/* toJS_String(str) */
function toJS_String(aStr)
{
    var len = aStr.value0.length;
    var str = ""; for(i=1;i<len;i++) { str += String.fromCharCode(aStr.value0[i]); }
    return str;
}
