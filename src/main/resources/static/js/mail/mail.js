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

    $.ajax({
        type : 'post',
        url : 'http://localhost:8080/sender',
        data : {
            internetAddress : mailAddressSpliter($("#mailReceiver").val()),
            subject : $("#mailSubject").val(),
            contents : CKEDITOR.instances.editor.getData()
        },
        success : function (data) {
            console.log(data);
        }
    });
}
