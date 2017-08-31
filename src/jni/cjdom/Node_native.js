

//
// Adds a child node as the last child to the current node.
//
function _CHEERPJ_COMPRESS(ZN7cheerpj4Node14appendChildJSOEN7cheerpj4NodeEV)(a0,a1,p)
{
    var node = a0._jso0;
    var child = a1._jso0;
    node.appendChild(child);
}

//
// Removes a child node from the current element, which must be a child of the current node.
//
function _CHEERPJ_COMPRESS(ZN7cheerpj4Node14removeChildJSOEN7cheerpj4NodeEV)(a0,a1,p)
{
    var node = a0._jso0;
    var child = a1._jso0;
    node.removeChild(child);
}
