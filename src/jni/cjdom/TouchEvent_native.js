
//
// getTouchCount()
//
function _CHEERPJ_COMPRESS(ZN5cjdom10TouchEvent13getTouchCountEVEI)(a0,p)
{
    var te = a0._jso0;
    return te.touches.length;
}

//
// getTouchesJSO()
//
function _CHEERPJ_COMPRESS(ZN5cjdom10TouchEvent13getTouchesJSOEVEV)(a0,p)
{
    var te = a0._jso0;
    var touches = a0._touches1;
    var touchList = te.touches;
    var touchCount = touchList.length;

    for(i=0;i<touchCount;i++) {
        var touch = touches[i+1];
        touch._jso0 = touchList.item(i);
    }
}

//
// getChangedTouchCount()
//
function _CHEERPJ_COMPRESS(ZN5cjdom10TouchEvent20getChangedTouchCountEVEI)(a0,p)
{
    var te = a0._jso0;
    return te.changedTouches.length;
}

//
// getChangedTouchesJSO()
//
function _CHEERPJ_COMPRESS(ZN5cjdom10TouchEvent20getChangedTouchesJSOEVEV)(a0,p)
{
    var te = a0._jso0;
    var touches = a0._changedTouches2;
    var touchList = te.changedTouches;
    var touchCount = touchList.length;

    for(i=0;i<touchCount;i++) {
        var touch = touches[i+1];
        touch._jso0 = touchList.item(i);
    }
}
