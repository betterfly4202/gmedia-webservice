"use strict";

function onRefReceiver(){
    // if($("#ref-receiver").)
    $("#ref-receiver").show();
}

function mailSend(){
    if(CKEDITOR.instances.editor.getData().length < 1){
        alert("내용을 입력해 주세요.");
        return;
    }

    console.log($("#mailReceiver").val());
    console.log($("#mailSubject").val());
    console.log(CKEDITOR.instances.editor.getData());

    // console.log($("#mailReceiver").val);
    // console.log($("#mailSubject").val());
    // console.log($("#editor").val());

    // $.ajax({
    //     type : 'post',
    //     url : 'http://localhost:8080/sender',
    //     data : {MailVO :
    //         {receiver : $("#mailReceiver").val()},
    //         {subject : $("#mailSubject").val()},
    //         {contents : $("#editor").val()}
    //     },
    //     success : function (data) {
    //         if (data) {
    //             alert("사용할 수 없는 아이디 입니다.");
    //         } else {
    //             alert("사용 가능한 아이디 입니다.");
    //         }
    //     }
    // });
}