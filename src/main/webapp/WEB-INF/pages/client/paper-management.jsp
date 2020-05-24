<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="page-header">
    <h1> 考卷生成
        <small></small>
    </h1>
</div>

<div class="container-fluid">
    <div class="row">
        <nav class="toolbar navbar navbar-default">
            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li>
                        <a id="reload-question-btn" href="#" class="btn btn-primary navbar-btn-tm" role="button"><i
                                class="glyphicon glyphicon-refresh"></i>刷新</a>
                    </li>
                    <li>
                        <a id="question-type-update-btn" href="#" class="btn btn-primary navbar-btn-tm"
                           role="button"><i class="glyphicon glyphicon-pencil"></i>修改题目类型</a>
                    </li>
                    <li>
                        <a id="make-paper-btn" class="btn btn-primary navbar-btn-tm" data-toggle="modal"
                           role="button"><i class="glyphicon glyphicon-plus-sign"></i>生成考卷</a>
                    </li>
                    <li>
                        <a id="show-paper-btn" class="btn btn-primary navbar-btn-tm" data-toggle="modal"
                           role="button"><i class="glyphicon glyphicon-plus-sign"></i>考卷预览</a>
                    </li>
                </ul>
            </div>
        </nav>
    </div>
    <div class="row">
        <table id="question-list-table" class="table table-striped table-bordered table-responsive table-condensed">
        </table>
    </div>
</div>

<div id="question-type-update-modal" class="modal fade" data-backdrop="static">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header modal-header-warning">
                <div>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                            aria-hidden="true">&times;</span></button>
                    <span class="modal-title">填写相应题型数量</span>
                </div>
            </div>
            <div class="modal-body">
                <h4>如不做修改，请直接关闭对话框。</h4>

                <div class="form-group">
                    <label class="col-md-2 control-label">选择题</label>
                    <div class="col-md-2">
                        <input id='question-type1-number' name="quetion1Number" type='number' min="0" class="datepicker form-control" required>
                    </div>
                    <label class="col-md-2 control-label">情景题</label>
                    <div class="col-md-2">
                        <input id='question-type2-number' name="quetion2Number" type='number' min="0" class="datepicker form-control" required>
                    </div>
                    <label class="col-md-2 control-label">视频题</label>
                    <div class="col-md-2">
                        <input id='question-type3-number' name="quetion3Number" type='number' min="0" class="datepicker form-control" required>
                    </div>
                </div>
                <div id="init-transition-actions-container"></div>
            </div>
            <div class="modal-footer">
                <button id="question-type-ok" type="button" class="btn btn-default" data-dismiss="modal">确认</button>
            </div>

        </div>
    </div>
</div>

<div id="paper-show-modal" class="modal fade" data-backdrop="static">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header modal-header-warning">
                <div>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                            aria-hidden="true">&times;</span></button>
                    <span class="modal-title">试卷预览</span>
                </div>
            </div>
            <div id="paper-show-div" class="modal-body">

            </div>
            <div class="modal-footer">
                <button id="paper-show-close" type="button" class="btn btn-default" data-dismiss="modal">确认</button>
            </div>

        </div>
    </div>
</div>

<script src="${ctx}/assets/js/client/paper-management/paper-management.js"></script>
