/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-15 04:59:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.partials.client.question_002dmanagement;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_002dquestion_002dform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!-- Modal -->\r\n");
      out.write("<div id=\"new-question-modal\" class=\"modal fade\" data-backdrop=\"static\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-lg\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header bg-primary\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                <h3 class=\"modal-title\" id=\"myModalLabel\">编写新考题(考题框架)</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <form id=\"edit-question-form\" class=\"form-horizontal title-border-form\">\r\n");
      out.write("                        <div id=\"q-id-section\" class=\"form-group hidden\">\r\n");
      out.write("                            <label class=\"col-md-2 control-label\">ID</label>\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <input id=\"question-id\" class=\"form-control\" type=\"text\" readonly>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <label class=\"cold-md-2\">当前状态</label>\r\n");
      out.write("                            <span id=\"question-status\" class=\"form-control-static\"></span>\r\n");
      out.write("                            <span id=\"change-status-container\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <fieldset>\r\n");
      out.write("                            <legend>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PROJECT.syllabus.level}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(' ');
      out.write('(');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PROJECT.syllabus.version}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(")</legend>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label class=\"col-md-2 control-label\">章节</label>\r\n");
      out.write("                                <div class=\"col-md-4 col-lg-4\">\r\n");
      out.write("                                    <select id=\"chapter-select\" class=\"form-control select-list\" data-placeholder=\"选择章节\">\r\n");
      out.write("                                        <option></option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label class=\"col-md-2 control-label\">知识点</label>\r\n");
      out.write("                                <div class=\"col-md-10\">\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                    <select id=\"knowledge-point-select\" class=\"form-control select-list\" data-placeholder=\"选择知识点\">\r\n");
      out.write("                                        <option></option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </fieldset>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            <label class=\"col-md-2 control-label\">作者</label>\r\n");
      out.write("                            <div class=\"col-md-2 col-lg-2\">\r\n");
      out.write("                                <select id=\"author-list\" class=\"select-list user-select-list form-control\" data-placeholder=\"选择作者\" required>\r\n");
      out.write("                                    <option></option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <label class=\"col-md-2 control-label\">评审</label>\r\n");
      out.write("                            <div class=\"col-md-2\">\r\n");
      out.write("                                <select id=\"reviewer-list\" class=\"select-list user-select-list form-control\" data-placeholder=\"选择评审\" required>\r\n");
      out.write("                                    <option></option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            <label class=\"col-md-2 control-label\">质管</label>\r\n");
      out.write("                            <div class=\"col-md-2\">\r\n");
      out.write("                                <select id=\"question-qa-list\" name=\"qa\" multiple=\"multiple\" class=\"select-list user-select-list form-control\" data-placeholder=\"选择质管\">\r\n");
      out.write("                                    <option></option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            <label class=\"col-md-2 control-label\">类型</label>\r\n");
      out.write("                            <div class=\"col-md-2\">\r\n");
      out.write("                                <select id=\"question-type-list\" name=\"type\" class=\"select-list-simple form-control\" data-placeholder=\"选择类型\">\r\n");
      out.write("                                    <option></option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <label class=\"col-md-2 control-label\">出题开始日期</label>\r\n");
      out.write("                            <div class=\"col-md-2\">\r\n");
      out.write("                                <input id='authorStartDate' name=\"authorStartDate\" type='text' class=\"datepicker form-control\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <label class=\"col-md-2 control-label\">出题结束日期</label>\r\n");
      out.write("                            <div class=\"col-md-2\">\r\n");
      out.write("                                <input id=\"authorFinishDate\" name=\"authorFinishDate\" type='text' class=\"form-control datepicker\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            <label class=\"col-md-2 control-label\">语言</label>\r\n");
      out.write("                            <div class=\"col-md-2\">\r\n");
      out.write("                                <select id=\"question-language-list\" name=\"language\" class=\"select-list-simple form-control\" data-placeholder=\"选择语言\">\r\n");
      out.write("                                    <option></option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <label class=\"col-md-2 control-label\">评审开始日期</label>\r\n");
      out.write("                            <div class=\"col-md-2\">\r\n");
      out.write("                                <input id='reviewStartDate' name=\"reviewStartDate\" type='text' class=\"datepicker form-control\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <label class=\"col-md-2 control-label\">评审结束日期</label>\r\n");
      out.write("                            <div class=\"col-md-2\">\r\n");
      out.write("                                <input id='reviewFinishDate' name=\"reviewFinishDate\" type='text' class=\"datepicker form-control\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("                <button id=\"save-question-btn\" type=\"button\" class=\"btn btn-primary\">提交题目</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script id=\"knowledge-point-list-template\" type=\"text/x-handlebars-template\">\r\n");
      out.write("    {{#each aaData}}\r\n");
      out.write("    <option value=\"{{id}}\" data-index=\"{{@index}}\">{{number}} {{title}}</option>\r\n");
      out.write("    {{/each}}\r\n");
      out.write("</script>\r\n");
      out.write("<script id=\"language-list-template\" type=\"text/x-handlebars-template\">\r\n");
      out.write("    {{#each aaData}}\r\n");
      out.write("    <option value=\"{{id}}\" data-index=\"{{@index}}\">{{name}}</option>\r\n");
      out.write("    {{/each}}\r\n");
      out.write("</script>\r\n");
      out.write("<script id=\"question-type-list-template\" type=\"text/x-handlebars-template\">\r\n");
      out.write("    {{#each aaData}}\r\n");
      out.write("    <option value=\"{{id}}\" data-index=\"{{@index}}\">{{name}}</option>\r\n");
      out.write("    {{/each}}\r\n");
      out.write("</script>\r\n");
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
}
