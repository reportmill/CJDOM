

//
// Creates an element.
//
function _CHEERPJ_COMPRESS(ZN5cjdom8Document16createElementJSOEN4java4lang6StringEN4java4lang6Object)(a0,a1,p)
{
    var doc = a0._jso0;
    var name = toJS_String(a1);
    var emt = doc.createElement(name);
    //console.log("Created element " + name); console.log(emt);
    return emt;
}

//
// Returns the body element.
//
function _CHEERPJ_COMPRESS(ZN5cjdom8Document10getBodyJSOEVEN4java4lang6Object)(a0,p)
{
    var doc = a0._jso0;
    return doc.body;
}

//
// setColor
//
function _CHEERPJ_COMPRESS(ZN5cjdom8Document11setColorJSOEN4java4lang6StringEV)(a0,a1,p)
{
    a0._jso0.bgColor = toJS_String(a1);
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
