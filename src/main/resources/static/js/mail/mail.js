"use strict";

function onRefReceiver(){
    // if($("#ref-receiver").)
    $("#ref-receiver").show();
}

function checkMailContents(){
    if(CKEDITOR.instances.editor.getData().length < 1){
        alert("내용을 입력해 주세요.");
        return;
    }
}

function mailSend(){
    checkMailContents();

    // console.log($("#mailReceiver").val());
    // console.log(mailAddressSpliter($("#mailReceiver").val()));
    mailAddressSpliter($("#mailReceiver").val());
    // $.ajax({
    //     type : 'post',
    //     url : 'http://localhost:8080/sender',
    //     data : {
    //         internetAddress : mailAddressSpliter($("#mailReceiver").val()),
    //         subject : $("#mailSubject").val(),
    //         contents : CKEDITOR.instances.editor.getData()
    //     },
    //     success : function (data) {
    //         console.log(data);
    //     }
    // });
}


function mailAddressSpliter(address){
    var arr = address.split(";");

    arr.forEach(function(item,index){
        // if(item == ''){
        //     arr.pop(index);
        // }
        alert(item + "/// "+index);

        // item.trim();
        // item.replace("\"",'');
        // console.log('item',item);
    });

    console.log('arr', arr);
    return arr;
}