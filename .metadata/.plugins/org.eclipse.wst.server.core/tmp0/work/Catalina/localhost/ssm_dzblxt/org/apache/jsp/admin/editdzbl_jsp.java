/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2019-05-01 01:36:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editdzbl_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1553226187728L));
    _jspx_dependants.put("jar:file:/E:/workspace/java/design/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/test/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1054243570000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "check_logstate.jsp", out, false);
      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"zh_CN\">\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>欢迎使用后台管理系统</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"lib/bootstrap/css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"lib/font-awesome/css/font-awesome.css\">\r\n");
      out.write("<script src=\"lib/jquery-1.11.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/theme.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/premium.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/doctor.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/selimage.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("My97DatePicker/WdatePicker.js\" charset=\"utf-8\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\" theme-blue\">\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div class=\"content\">\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<h1 class=\"page-title\">编辑电子病历信息</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"main-content\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 col-md-offset-3\">\r\n");
      out.write("\t\t\t\t\t<div id=\"myTabContent\" class=\"tab-content\">\r\n");
      out.write("\t\t\t\t\t\t<form action=\"dzbl/updateDzbl.action\" name=\"myform\" method=\"post\" onsubmit=\"return check()\" class=\"form\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane active in\" id=\"home\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>病历号</label> <input type=\"text\" name=\"dzblid\" class=\"form-control\" id=\"dzblid\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dzbl.dzblid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane active in\" id=\"home\">\r\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t      <label>患者姓名</label> <input type=\"text\" name=\"usersid\" class=\"form-control\" id=\"usersid\"\r\n");
      out.write("\t\t\t\t\t\t\t          value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dzbl.usersid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane active in\" id=\"home\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>住院日期</label> <input type=\"text\" name=\" hospitalization_date\" class=\"form-control\" id=\" hospitalization_date\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dzbl.hospitalization_date}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane active in\" id=\"home\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>出院日期</label> <input type=\"text\" name=\"discharge_date\" class=\"from-control\" id=\" discharge_date\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dzbl.discharge_date }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane active in\" id=\"home\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>主治医生</label> <input type=\"text\" name=\"doctersid\" class=\"form-control\" id=\"doctersid\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dzbl.doctersid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane active in\" id=\"home\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <label>CT</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<script type=\"text/javascript\" src=\"js/selimage.js\"></script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" name=\"image\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dzbl.ct}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"image\" onclick=\"selimage();\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\treadonly=\"readonly\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane active in\" id=\"home\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>手术记录</label> <input type=\"text\" name=\"operationrecords\" class=\"form-control\" id=\"operationrecords\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dzbl.operationrecords }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane active in\" id=\"home\">\r\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t       <label>护理记录</label> <input type=\"text\" name=\"nursingrecords\" class=\"form-control\" id=\"nursing records\"\r\n");
      out.write("\t\t\t\t\t\t\t            value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dzbl.nursingrecords }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane active in\" id=\"home\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>血液检查</label> <input type=\"text\" name=\"bloodtest\" class=\"form-control\" id=\"bloodtest\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dzbl.bloodtest}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane active in\" id=\"home\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>过敏药物</label> <input type=\"text\" name=\"allergydrugs\" class=\"form-control\" id=\"allergydrugs\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dzbl.allergydrugs}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane active in\" id=\"home\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>医嘱</label> <input type=\"text\" name=\"advice\" class=\"form-control\" id=\"advice\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dzbl.advice }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\t \r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-pane active in\" id=\"home\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>病房</label> <input type=\"text\" name=\"ward\" class=\"form-control\" id=\"ward\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dzbl.ward }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tCKEDITOR.replace('contents', {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tlanguage : 'zh-cn'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"dzblid\" id=\"dzblid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dzbl.dzblid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /><input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"password\" id=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dzbl.password}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" id=\"sub\" class=\"btn btn-primary\">提交保存</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"reset\" id=\"res\" class=\"btn btn-primary\">取消重置</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
