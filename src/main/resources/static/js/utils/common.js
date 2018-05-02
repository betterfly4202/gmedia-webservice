"use strict";

function mailAddressSpliter(address){
    var arr = address.split(";");

    arr.forEach(function(item,index){
        if(item == '')
            arr.pop(index);
    });

    return arr;
}