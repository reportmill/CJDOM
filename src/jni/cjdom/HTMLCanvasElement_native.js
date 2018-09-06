

/* getWidth() */
function _CHEERPJ_COMPRESS(ZN5cjdom17HTMLCanvasElement8getWidthEVEI)(a0,p)
{
    var canvas = a0._jso0;
    return canvas.width;
}

/* setWidth(val) */
function _CHEERPJ_COMPRESS(ZN5cjdom17HTMLCanvasElement8setWidthEIEV)(a0,a1,p)
{
    var canvas = a0._jso0;
    canvas.width = a1;
}

/* getHeight() */
function _CHEERPJ_COMPRESS(ZN5cjdom17HTMLCanvasElement9getHeightEVEI)(a0,p)
{
    var canvas = a0._jso0;
    return canvas.height;
}

/* setHeight() */
function _CHEERPJ_COMPRESS(ZN5cjdom17HTMLCanvasElement9setHeightEIEV)(a0,a1,p)
{
    var canvas = a0._jso0;
    canvas.height = a1;
}

/* getContext(str) */
function _CHEERPJ_COMPRESS(ZN5cjdom17HTMLCanvasElement13getContextJSOEN4java4lang6StringEN4java4lang6Object)(a0,a1,p)
{
    var canvas = a0._jso0;
    var name = cjStringJavaToJs(a1);
    var rc = canvas.getContext(name);
    return rc;
}
