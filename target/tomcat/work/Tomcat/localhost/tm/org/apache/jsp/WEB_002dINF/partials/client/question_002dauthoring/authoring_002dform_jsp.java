/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-11 04:47:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.partials.client.question_002dauthoring;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class authoring_002dform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"authoring-question-modal\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" data-backdrop=\"static\">\r\n");
      out.write("    <div class=\"modal-dialog modal-lg\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header bg-primary\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span\r\n");
      out.write("                        aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                <h3 class=\"modal-title\">编写题目\r\n");
      out.write("                    <small>\r\n");
      out.write("                        <span class=\"label-lg label-primary\">No.<span id=\"author-q-id\"></span></span>\r\n");
      out.write("                    </small>\r\n");
      out.write("                </h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form id=\"question-author-form\" class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <nav class=\"toolbar navbar navbar-modal\">\r\n");
      out.write("                            <div class=\"collapse navbar-collapse\">\r\n");
      out.write("                                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a class=\"btn btn-info navbar-btn-tm\" data-toggle=\"collapse\"\r\n");
      out.write("                                           href=\"#question-info-section\" role=\"button\"><i id=\"question-well-collapse\"\r\n");
      out.write("                                                                                          class=\"glyphicon glyphicon-adjust\"></i>显示题目属性</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a class=\"btn btn-info navbar-btn-tm\" data-toggle=\"collapse\"\r\n");
      out.write("                                           data-target=\"#img-panel-body\" role=\"button\"><i\r\n");
      out.write("                                                class=\"glyphicon glyphicon-adjust\"></i>显示图片详情</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"question-info-section\" class=\"collapse\">\r\n");
      out.write("                        <table class=\"table table-bordered table-condensed table-responsive\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"control-label\"><label>知识点</label></td>\r\n");
      out.write("                                <td colspan=\"5\"><span id=\"author-q-kp\"></span></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"control-label\"><label>语言</label></td>\r\n");
      out.write("                                <td><span id=\"author-q-language\" class=\"col-md-8\"></span></td>\r\n");
      out.write("                                <td class=\"control-label\"><label>类型</label></td>\r\n");
      out.write("                                <td><span id=\"author-q-type\" class=\"col-md-6\"></span></td>\r\n");
      out.write("                                <td class=\"control-label\"><label>状态</label></td>\r\n");
      out.write("                                <td class=\"bg-warning\">\r\n");
      out.write("                                    <div class=\"col-md-8\">\r\n");
      out.write("                                        <label id=\"author-q-status\" class=\"form-control-static\"\r\n");
      out.write("                                               style=\"font-size: 120%\"></label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"control-label\"><label for=\"author-q-difficulty\">难度</label></td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <div class=\"col-md-9\">\r\n");
      out.write("                                        <select id=\"author-q-difficulty\" name=\"difficulty\"\r\n");
      out.write("                                                class=\"form-control selectpicker\" required>\r\n");
      out.write("                                            <option value=\"1\">简单</option>\r\n");
      out.write("                                            <option value=\"2\">一般</option>\r\n");
      out.write("                                            <option value=\"3\">困难</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td class=\"control-label\"><label>K 值</label></td>\r\n");
      out.write("                                <td><span id=\"q-k-value\" class=\"col-md-4\"></span></td>\r\n");
      out.write("                                <td class=\"control-label\"><label for=\"author-q-score\">分值</label></td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <div class=\"col-lg-8\">\r\n");
      out.write("                                        <label id=\"author-q-score\" class=\"form-control-static\"></label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"control-label\"><label for=\"author-q-multipleChoice\">多选</label></td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <div class=\"col-lg-8\">\r\n");
      out.write("                                        <input id=\"author-q-multipleChoice\" name=\"multipleChoice\" type=\"checkbox\"\r\n");
      out.write("                                               class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td class=\"control-label\"><label>出题时限</label></td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <div class=\"col-md-10 col-lg-8\">\r\n");
      out.write("                                        <span id=\"author-start\"></span> - <span id=\"author-finish\"></span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td class=\"control-label\"><label>评审时限</label></td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <div class=\"col-md-10 col-lg-8\">\r\n");
      out.write("                                        <span id=\"review-start\"></span> - <span id=\"review-finish\"></span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/partials/client/question-authoring/image-mgm.jsp", out, false);
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"form-panel panel panel-primary\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <div class=\"panel-title\"><span>题目详情</span></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"panel-body\">\r\n");
      out.write("                                <div role=\"tabpanel\" class=\"form-panel\">\r\n");
      out.write("                                    <!-- Nav tabs -->\r\n");
      out.write("                                    <ul class=\"nav nav-tabs\" role=\"tablist\">\r\n");
      out.write("                                        <li role=\"presentation\" class=\"active\"><a href=\"#scenario-tab\"\r\n");
      out.write("                                                                                  aria-controls=\"scenario-tab\"\r\n");
      out.write("                                                                                  role=\"tab\" data-toggle=\"tab\">场景描述</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li role=\"presentation\"><a id=\"stem-tab-caption\" href=\"#stem-tab\"\r\n");
      out.write("                                                                   aria-controls=\"stem-tab\" role=\"tab\"\r\n");
      out.write("                                                                   data-toggle=\"tab\">题干</a></li>\r\n");
      out.write("                                        <li role=\"presentation\"><a id=\"remark-tab-caption\" href=\"#remark-tab\"\r\n");
      out.write("                                                                   aria-controls=\"remark-tab\" role=\"tab\"\r\n");
      out.write("                                                                   data-toggle=\"tab\">备注</a></li>\r\n");
      out.write("                                        <li role=\"presentation\"><a id=\"choice-tab-header\" href=\"#author-q-choice-tab\"\r\n");
      out.write("                                                                   aria-controls=\"choice-tab\" role=\"tab\"\r\n");
      out.write("                                                                   data-toggle=\"tab\">题目选项</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("\r\n");
      out.write("                                    <!-- Tab panes -->\r\n");
      out.write("                                    <div class=\"tab-content\">\r\n");
      out.write("                                        <div role=\"tabpanel\" class=\"tab-pane fade in active\" id=\"scenario-tab\">\r\n");
      out.write("                                            <textarea id=\"author-form-q-scenario\" name=\"scenario\" class=\"rich-editable\"\r\n");
      out.write("                                                      cols=\"80\" rows=\"5\">\r\n");
      out.write("                                            </textarea>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div role=\"tabpanel\" class=\"tab-pane fade\" id=\"stem-tab\">\r\n");
      out.write("                                            <textarea id=\"author-form-q-stem\" name=\"stem\" class=\"rich-editable\"\r\n");
      out.write("                                                      cols=\"80\" rows=\"10\" required>\r\n");
      out.write("                                            </textarea>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div role=\"tabpanel\" class=\"tab-pane fade\" id=\"remark-tab\">\r\n");
      out.write("                                            <textarea id=\"author-form-q-remark\" name=\"remark\" class=\"rich-editable\"\r\n");
      out.write("                                                      cols=\"80\" rows=\"10\" required>\r\n");
      out.write("                                            </textarea>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                        <div role=\"tabpanel\" class=\"tab-pane fade\" id=\"author-q-choice-tab\">\r\n");
      out.write("                                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/partials/client/question-authoring/choice-tab.jsp", out, false);
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                    <button id=\"submit-edit-form-btn\" type=\"button\" class=\"btn btn-primary\">保存并关闭</button>\r\n");
      out.write("                    <span id=\"change-status-container\"></span>\r\n");
      out.write("                    <button id=\"cancel-edit-form-btn\" type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"choice-image-upload-modal\" class=\"modal fade\" data-backdrop=\"static\">\r\n");
      out.write("    <div class=\"modal-dialog modal-lg\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <p>请选择要上传的图片</p>\r\n");
      out.write("                ");
      if (_jspx_meth_s_005furl_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                <form id=\"choice-image-upload-form\" name=\"choice-img-form\" class=\"form-horizontal\"\r\n");
      out.write("                      action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${saveChoiceImageURL}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" enctype=\"multipart/form-data\" method=\"post\"\r\n");
      out.write("                        >\r\n");
      out.write("                    <input id=\"choice-id\" name=\"choiceId\" class=\"form-control hidden\" type=\"text\" readonly hidden>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"image-caption\" class=\"col-md-4 control-label\">图片描述</label>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-8\">\r\n");
      out.write("                            <input id=\"image-caption\" name=\"caption\" class=\"control-label\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"choice-image\" class=\"col-md-4 control-label\">图片</label>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-8\">\r\n");
      out.write("                            <input id=\"choice-image\" name=\"upload\" placeholder=\"请选择要上传的图片\" class=\"form-control\"\r\n");
      out.write("                                   type=\"file\" accept=\"image/*\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("                <div id=\"choice-image-preview\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button id=\"upload-choice-img-btn\" type=\"button\" class=\"btn btn-primary\">上传图片</button>\r\n");
      out.write("                <button id=\"cancel-upload-btn\" type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script id=\"delete-choice-template\" type=\"text/x-handlebars-template\">\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <div class=\"col-md-offset-2 col-md-8\">\r\n");
      out.write("            <p class=\" alert alert-danger\" role=\"alert\">确定要删除以下题目选项吗？</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <table class=\"table table-striped table-bordered\">\r\n");
      out.write("            <tbody>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><b>ID</b></td>\r\n");
      out.write("                <td>{{id}}</td>\r\n");
      out.write("                <td><b>选项</b></td>\r\n");
      out.write("                <td>{{choiceLabel}}</td>\r\n");
      out.write("                <td><b>正确答案</b></td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    {{#if isCorrectAnswer}}\r\n");
      out.write("                    <span class=\"label-lg label-success\">是</span>\r\n");
      out.write("                    {{else}}\r\n");
      out.write("                    <span class=\"label-lg label-default\">否</span>\r\n");
      out.write("                    {{/if}}\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><b>内容</b></td>\r\n");
      out.write("                <td colspan=\"5\">\r\n");
      out.write("                    <div>{{content}}</div>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</script>\r\n");
      out.write("<script id=\"question-image-list\" type=\"text/x-handlebars-template\">\r\n");
      out.write("    {{#each images}}\r\n");
      out.write("    <div class=\"col-md-3\">\r\n");
      out.write("        <div class=\"thumbnail\" data-index=\"{{@index}}\" data-id=\"{{id}}\">\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("{{path}}\" target=\"_blank\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("{{path}}\" class=\"img-responsive img-thumbnail\" title=\"{{caption}}\">\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"caption\">\r\n");
      out.write("                <h3 id=\"image-caption\" contenteditable=\"true\">{{caption}}</h3>\r\n");
      out.write("\r\n");
      out.write("                <p>\r\n");
      out.write("                    <button id=\"update-question-image\" class=\"btn-sm btn-primary\">保存</button>\r\n");
      out.write("                    <button id=\"delete-question-image\" class=\"btn-sm btn-danger\">删除</button>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p><em>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("{{path}}</em></p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    {{/each}}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div id=\"question-image-modal\" class=\"modal fade\" data-backdrop=\"static\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h4 class=\"modal-title\">上传题目图片</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <form id=\"question-image-form\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"question-image-caption\" class=\"col-md-4 control-label\">图片描述</label>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <input id=\"question-image-caption\" name=\"caption\" class=\"form-control\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"question-image\" class=\"col-md-4 control-label\">图片</label>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <input id=\"question-image\" name=\"upload\" placeholder=\"请选择要上传的图片\" class=\"form-control\"\r\n");
      out.write("                                       type=\"file\" accept=\"image/*\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"question-image-preview\" class=\"form-group\"></div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button id=\"submit-question-img\" type=\"button\" class=\"btn btn-primary\">上传图片</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f0 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f0.setParent(null);
    // /WEB-INF/partials/client/question-authoring/authoring-form.jsp(188,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setVar("saveChoiceImageURL");
    // /WEB-INF/partials/client/question-authoring/authoring-form.jsp(188,16) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setAction("save");
    // /WEB-INF/partials/client/question-authoring/authoring-form.jsp(188,16) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setNamespace("/web/question/choice/image");
    int _jspx_eval_s_005furl_005f0 = _jspx_th_s_005furl_005f0.doStartTag();
    if (_jspx_th_s_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
    return false;
  }
}
