"use strict";

function onRefReceiver(){
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


/*
    TODO
    1. 주소값 받은 다음 trim, "" 정규표현식으로 주소에 알맞는 값만 가져다가 ("" << 이거 Numberformat Excception 발생함)
    서버쪽 리스트에 담아주기 >> 그 다음에는 주소 배열로 생성해서 발송 됨

    2. 파일 전송 추가하기

 */


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