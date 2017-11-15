
/* createObjectURLJSO(obj) */
function _CHEERPJ_COMPRESS(ZN5cjdom3URL18createObjectURLJSOEN4java4lang6ObjectEN4java4lang6String)(a0,p)
{
    var urlCreator = window.URL || window.webkitURL;
    var url = urlCreator.createObjectURL(a0);
    return url;
}
