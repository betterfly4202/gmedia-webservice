<template>
  <div id="page-wrapper">
    <div class="row">
      <div class="col-lg-12">
        <h1 class="page-header">일일 업무 보고_vue</h1>

        <div class="form-group">
          <a class="btn btn-success" type="button" @click="sendMail()">
            보내기
          </a>
        </div>

        <div class="panel-body">
          <div class="row">
            <div class="col-lg-6">

              <div class="form-group input-group">
                <input type="text" class="form-control" placeholder="수신자" v-model="receiver">
                <span class="input-group-btn">
                                      <a class="btn btn-default" type="button" onclick="onRefReceiver()">참조
                                      </a>
                                  </span>
              </div>

              <div class="form-group" id="ref-receiver" hidden>
                <input class="form-control" placeholder="참조">
              </div>

              <div class="form-group">
                <input class="form-control" placeholder="제목" v-model="subject">
              </div>

              <div class="form-group" style="margin-top: 10px;">
                <input type="file">
              </div>

              <VueEditor v-model="contents"></VueEditor>

            </div>
          </div>
        </div>
      </div>
      <!-- /.col-lg-12 -->
    </div>
  </div>

</template>

<script>
  import axios from "axios";
  import VueEditor from 'vue2-editor'

  export default {
    name: 'MailService',
    components: VueEditor,

    data () {
      return {
        subject:'zvsvasdfsf',
        receiver:'dlcnddlf88@naver.com',
        contents:'send mail'
      }
    },

    methods: {
      sendMail(){
        const url = 'http://localhost:8080/sender';
//        var url = Utils.makePathVariableURL('monimanager', 'web', 'api', 'atm-status', 'remove');
        axios.post(url,{
          subject : this.subject,
          internetAddress : this.receiver.split(";"),
          contents : this.contents
        }).then(response => {
          console.log('send success');
        }).catch(error => {
          console.log(error);
        });
      },
    }

  }
</script>

<style scoped>

</style>
