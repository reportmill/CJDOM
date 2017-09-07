
//
// getData(index)
//
function _CHEERPJ_COMPRESS(ZN5cjdom9ImageData7getDataEIEB)(a0,a1,p)
{
    var idata = a0._jso0;
    var data = idata.data;
    return data[a1];
}

//
// getDataInt(index)
//
function _CHEERPJ_COMPRESS(ZN5cjdom9ImageData10getDataIntEIEI)(a0,a1,p)
{
    var idata = a0._jso0;
    var data = idata.data;
    var d1 = data[a1];
    var d2 = data[a1+1];
    var d3 = data[a1+2];
    var d4 = data[a1+3];
    return d4<<24 | d1<<16 | d2<<8 | d3;
}
