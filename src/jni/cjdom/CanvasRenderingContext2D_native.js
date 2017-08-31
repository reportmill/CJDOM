

//
// setFillStyle(str)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D12setFillStyleEN4java4lang6StringEV)(a0,a1,p)
{
    var rc = a0._jso0;
    var fs = toJS_String(a1);
    rc.fillStyle = fs;
}

//
// setFillStyle(CanvasGradient)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D12setFillStyleEN7cheerpj14CanvasGradientEV)(a0,a1,p)
{
    var rc = a0._jso0;
    var cg = a1._jso0;
    rc.fillStyle = cg;
}

//
// setStrokeStyle(str)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D14setStrokeStyleEN4java4lang6StringEV)(a0,a1,p)
{
    var rc = a0._jso0;
    var fs = toJS_String(a1);
    rc.strokeStyle = fs;
}

//
// setStrokeStyle(CanvasGradient)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D14setStrokeStyleEN7cheerpj14CanvasGradientEV)(a0,a1,p)
{
    var rc = a0._jso0;
    var cg = a1._jso0;
    rc.strokeStyle = cg;
}

//
// setLineWidth(value)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D12setLineWidthEDEV)(a0,a1,a2,p)
{
    var rc = a0._jso0;
    rc.lineWidth = a1;
}

//
// setGlobalAlpha(value)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D14setGlobalAlphaEDEV)(a0,a1,a2,p)
{
    var rc = a0._jso0;
    rc.setGlobalAlpha(a1);
}

//
// setFont(str)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D7setFontEN4java4lang6StringEV)(a0,a1,p)
{
    var rc = a0._jso0;
    var str = toJS_String(a1);
    rc.font = str;
}

//
// clearRect(x,y,w,h)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D9clearRectEDDDDEV)(a0,a1,a2,a3,a4,a5,a6,a7,a8,p)
{
    var rc = a0._jso0;
    rc.clearRect(a1,a3,a5,a7);
}

//
// fillRect(x,y,w,h)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D8fillRectEDDDDEV)(a0,a1,a2,a3,a4,a5,a6,a7,a8,p)
{
    var rc = a0._jso0;
    rc.fillRect(a1,a3,a5,a7);
}

//
// strokeRect(x,y,w,h)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D10strokeRectEDDDDEV)(a0,a1,a2,a3,a4,a5,a6,a7,a8,p)
{
    var rc = a0._jso0;
    rc.strokeRect(a1,a3,a5,a7);
}

//
// beginPath()
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D9beginPathEVEV)(a0,p)
{
    var rc = a0._jso0;
    rc.beginPath();
}

//
// moveTo(x,y)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D6moveToEDDEV)(a0,a1,a2,a3,a4,p)
{
    var rc = a0._jso0;
    rc.moveTo(a1, a3);
}

//
// lineTo(x,y)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D6lineToEDDEV)(a0,a1,a2,a3,a4,p)
{
    var rc = a0._jso0;
    rc.lineTo(a1, a3);
}

//
// bezierCurveTo(cp1x,cp1y,cp2x,cp2y,x,y)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D13bezierCurveToEDDDDDDEV)(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,p)
{
    var rc = a0._jso0;
    rc.bezierCurveTo(a1, a3, a5, a7, a9, a11);
}

//
// closePath()
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D9closePathEVEV)(a0,p)
{
    var rc = a0._jso0;
    rc.closePath();
}

//
// fill()
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D4fillEVEV)(a0,p)
{
    var rc = a0._jso0;
    rc.fill();
}

//
// stroke()
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D6strokeEVEV)(a0,p)
{
    var rc = a0._jso0;
    rc.stroke();
}

//
// clip()
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D4clipEVEV)(a0,p)
{
    var rc = a0._jso0;
    rc.clip();
}

//
// fillText(str,x,y)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D8fillTextEN4java4lang6StringDDEV)(a0,a1,a2,a3,a4,a5,p)
{
    var rc = a0._jso0;
    var str = toJS_String(a1);
    rc.fillText(str,a2,a4);
}

//
// drawImage(img-src,x,y)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D9drawImageEN7cheerpj17CanvasImageSourceDDEV)(a0,a1,a2,a3,a4,a5,p)
{
    var rc = a0._jso0;
    var img = a1._jso0;
    rc.drawImage(img,a2,a4);
}

//
// drawImage(img-src,x,y,dw,dh)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D9drawImageEN7cheerpj17CanvasImageSourceDDDDEV)(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,p)
{
    var rc = a0._jso0;
    var img = a1._jso0;
    rc.drawImage(img,a2,a4,a6,a8);
}

//
// drawImage(img-src,sx,sy,sw,sh,dx,dy,dw,dh)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D9drawImageEN7cheerpj17CanvasImageSourceDDDDDDDDEV)(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,p)
{
    var rc = a0._jso0;
    var img = a1._jso0;
    rc.drawImage(img,a2,a4,a6,a8,a10,a12,a14,a16);
}

//
// save()
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D4saveEVEV)(a0,p)
{
    var rc = a0._jso0;
    rc.save();
}

//
// restore()
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D7restoreEVEV)(a0,p)
{
    var rc = a0._jso0;
    rc.restore();
}

//
// transform(a,b,c,d,e,f)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D9transformEDDDDDDEV)(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,p)
{
    var rc = a0._jso0;
    rc.transform(a1, a3, a5, a7, a9, a11);
}

//
// setTransform(a,b,c,d,e,f)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D12setTransformEDDDDDDEV)(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,p)
{
    var rc = a0._jso0;
    rc.setTransform(a1, a3, a5, a7, a9, a11);
}

//
// createLinearGradientJSO(x0,y0,x1,y1)
//
function _CHEERPJ_COMPRESS(ZN7cheerpj24CanvasRenderingContext2D23createLinearGradientJSOEDDDDEN4java4lang6Object)(a0,a1,a2,a3,a4,a5,a6,a7,a8,p)
{
    var rc = a0._jso0;
    var cg = rc.createLinearGradient(a1,a3,a5,a7);
    return cg;
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
