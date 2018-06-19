<template>

  <div class="row">
    <div class="col-lg-12">
      <h1 class="page-header">일일 업무 보고</h1>

      <div class="form-group">
        <a class="btn btn-success" type="button" onclick="mailSend()">
          보내기
        </a>
      </div>

      <div class="panel-body">
        <div class="row">
          <div class="col-lg-6">

            <div class="form-group input-group">
              <input type="text" class="form-control" placeholder="수신자" id="mailReceiver">
              <span class="input-group-btn">
                                    <a class="btn btn-default" type="button" onclick="onRefReceiver()">참조
                                    </a>
                                </span>
            </div>

            <div class="form-group" id="ref-receiver" hidden>
              <input class="form-control" placeholder="참조">
            </div>

            <div class="form-group">
              <input class="form-control" placeholder="제목" id="mailSubject">
            </div>

            <div class="form-group" style="margin-top: 10px;">
              <input type="file">
            </div>

            <textarea name="editor" id="editor">
            </textarea>
          </div>
        </div>
      </div>
    </div>
    <!-- /.col-lg-12 -->
  </div>

</template>

<script>
export default {
  name: 'MailService',
  data () {
    return {

    }
  }
}
</script>

<style scoped>

</style>
