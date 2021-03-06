/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-10 09:13:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.partials.admin.syllabus;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class syllabus_002dtab_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<nav class=\"toolbar navbar navbar-default\">\r\n");
      out.write("    <div class=\"collapse navbar-collapse\">\r\n");
      out.write("        <ul class=\"nav navbar-nav\">\r\n");
      out.write("            <li>\r\n");
      out.write("                <a id=\"edit-syllabus-form-btn\" href=\"#edit-syllabus-form\" class=\"btn btn-primary navbar-btn-tm\" data-toggle=\"collapse\" role=\"button\"><i class=\"glyphicon glyphicon-plus-sign\"></i>编辑大纲</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <form class=\"navbar-form\" role=\"search\" onsubmit=\"return false\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"syllabus-keyword\" placeholder=\"大纲级别\">\r\n");
      out.write("                        <a id=\"search-syllabus-btn\" class=\"btn btn-danger navbar-btn-tm\"><i class=\"glyphicon glyphicon-search\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("    <form id=\"edit-syllabus-form\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/syllabus/update.action\" class=\"collapse form-inline\">\r\n");
      out.write("        <div class=\"form-group hidden\">\r\n");
      out.write("            <label class=\"control-label\">ID</label>\r\n");
      out.write("            <input id=\"syllabus-id\" name=\"id\" type=\"number\" class=\"form-control\" readonly>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <label for=\"syllabus-level\" class=\"control-label\">级别</label>\r\n");
      out.write("            <input id=\"syllabus-level\" name=\"level\" list=\"levels\" minlength=\"2\" maxlength=\"20\" type=\"text\" class=\"form-control\" required>\r\n");
      out.write("            <datalist id=\"levels\">\r\n");
      out.write("                <option value=\"Foundation Level\">\r\n");
      out.write("                <option value=\"Advanced Level-TA\">\r\n");
      out.write("                <option value=\"Advanced Level-TM\">\r\n");
      out.write("                <option value=\"Advanced Level-TTA\">\r\n");
      out.write("                <option value=\"软件测试-理论应用课程\">\r\n");
      out.write("                <option value=\"软件测试-实训模拟课程\">\r\n");
      out.write("            </datalist>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <label for=\"syllabus-version\" class=\"control-label\">版本</label>\r\n");
      out.write("            <input id=\"syllabus-version\" name=\"version\" minlength=\"2\" maxlength=\"20\" type=\"text\" class=\"form-control\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"syllabus-state-field\" class=\"form-group hidden\">\r\n");
      out.write("            <label for=\"syllabus-state\" class=\"control-label\">废弃状态</label>\r\n");
      out.write("            <input id=\"syllabus-state\" name=\"disabled\" type=\"checkbox\" class=\"form-control\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <button type=\"submit\" id=\"update-syllabus-btn\" class=\"btn btn-primary\">提交</button>\r\n");
      out.write("        <button type=\"reset\" id=\"cancel-update-syllabus-btn\" class=\"btn btn-default\">取消</button>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("<table id=\"syllabus-list-table\" class=\"table table-bordered table-striped table-condensed table-hover\">\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script id=\"syllabus-data-template\" type=\"text/x-handlebars-template\">\r\n");
      out.write("    <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <th>ID</th>\r\n");
      out.write("        <th>级别</th>\r\n");
      out.write("        <th>版本</th>\r\n");
      out.write("        <th>废弃状态</th>\r\n");
      out.write("        <th>创建日期</th>\r\n");
      out.write("        <th>修改日期</th>\r\n");
      out.write("        <th class=\"action-col-2\"></th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    <tbody>\r\n");
      out.write("    {{#each aaData}}\r\n");
      out.write("    <tr class=\"item-row\" data-index=\"{{@index}}\">\r\n");
      out.write("        <td data-attr=\"id\">{{id}}</td>\r\n");
      out.write("        <td data-attr=\"level\">{{level}}</td>\r\n");
      out.write("        <td data-attr=\"version\">{{version}}</td>\r\n");
      out.write("        <td data-attr=\"disabled\">\r\n");
      out.write("            {{#if disabled}}\r\n");
      out.write("            <label class=\"label-lg label-danger\"><i class=\"glyphicon glyphicon-off\"></i>已废弃</label>\r\n");
      out.write("            {{/if}}\r\n");
      out.write("        </td>\r\n");
      out.write("        <td data-attr=\"createdOn\">{{date createdOn}}</td>\r\n");
      out.write("        <td data-attr=\"updatedOn\">{{date updatedOn}}</td>\r\n");
      out.write("        <td>\r\n");
      out.write("            <a href=\"#\" class=\"edit-item\"><i class=\"glyphicon glyphicon-edit\"></i></a>\r\n");
      out.write("            <a href=\"#\" class=\"delete-item\"><i class=\"glyphicon glyphicon-remove\"></i></a>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    {{/each}}\r\n");
      out.write("    </tbody>\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script id=\"delete-syllabus-template\" type=\"text/x-handlebars-template\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-offset-2 col-md-8\">\r\n");
      out.write("            <p class=\" alert alert-danger\" role=\"alert\">确定要删除以下大纲吗？</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-offset-2 col-md-8\">\r\n");
      out.write("            <table class=\"table table-striped table-bordered\">\r\n");
      out.write("                <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><b>ID</b></td>\r\n");
      out.write("                    <td>{{id}}</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><b>名称</b></td>\r\n");
      out.write("                    <td>{{level}}</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><b>版本</b></td>\r\n");
      out.write("                    <td>{{version}}</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><b>废弃状态</b></td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        {{#if disabled}}\r\n");
      out.write("                            <span class=\"label-lg label-danger\">是</span>\r\n");
      out.write("                        {{else}}\r\n");
      out.write("                            <span class=\"label-lg label-info\">否</span>\r\n");
      out.write("                        {{/if}}\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
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
