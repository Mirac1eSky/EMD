/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2019-05-01 08:10:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      response.setContentType("text/html;charset=utf-8");
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

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tvar uls = $('.sidebar-nav > ul > *').clone();\r\n");
      out.write("\t\tuls.addClass('visible-xs');\r\n");
      out.write("\t\t$('#main-menu').append(uls.clone());\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"lib/bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(\"[rel=tooltip]\").tooltip();\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('.demo-cancel-click').click(function() {\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /admin/menu.jsp(24,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.role eq '管理员' }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t<div class=\"sidebar-nav\">\r\n");
          out.write("\t\t<ul>\r\n");
          out.write("\r\n");
          out.write("\t\t\t<li><a data-target=\".legal-menu1\" class=\"nav-header collapsed\" data-toggle=\"collapse\">管理员信息管理<i\r\n");
          out.write("\t\t\t\t\tclass=\"fa fa-collapse\"></i></a></li>\r\n");
          out.write("\t\t\t<li><ul class=\"legal-menu1 nav nav-list collapse\">\r\n");
          out.write("\t\t\t\t\t<li><a href=\"admin/createAdmin.action\"><span class=\"fa fa-caret-right\"></span>新增管理员信息</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"admin/getAllAdmin.action\"><span class=\"fa fa-caret-right\"></span>管理员信息列表</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"admin/queryAdminByCond.action\"><span class=\"fa fa-caret-right\"></span>管理员信息查询</a></li>\r\n");
          out.write("\t\t\t\t</ul></li>\r\n");
          out.write("\t\t\t<li><a data-target=\".legal-menu4\" class=\"nav-header collapsed\" data-toggle=\"collapse\">医生信息管理<i\r\n");
          out.write("\t\t\t\t\tclass=\"fa fa-collapse\"></i></a></li>\r\n");
          out.write("\t\t\t<li><ul class=\"legal-menu4 nav nav-list collapse\">\r\n");
          out.write("\t\t\t\t\t<li><a href=\"doctor/createDoctor.action\"><span class=\"fa fa-caret-right\"></span>新增医生信息</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"doctor/getAllDoctor.action\"><span class=\"fa fa-caret-right\"></span>医生信息列表</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"doctor/queryDoctorByCond.action\"><span class=\"fa fa-caret-right\"></span>医生信息查询</a></li>\r\n");
          out.write("\t\t\t\t</ul></li>\r\n");
          out.write("\t\t\t<li><a data-target=\".legal-menu2\" class=\"nav-header collapsed\" data-toggle=\"collapse\">医院信息管理<i\r\n");
          out.write("\t\t\t\t\tclass=\"fa fa-collapse\"></i></a></li>\r\n");
          out.write("\t\t\t<li><ul class=\"legal-menu2 nav nav-list collapse\">\r\n");
          out.write("\t\t\t\t\t<li><a href=\"hospital/createHospital.action\"><span class=\"fa fa-caret-right\"></span>新增医院信息</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"hospital/getAllHospital.action\"><span class=\"fa fa-caret-right\"></span>医院信息列表</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"hospital/queryHospitalByCond.action\"><span class=\"fa fa-caret-right\"></span>医院信息查询</a></li>\r\n");
          out.write("\t\t\t\t</ul></li>\r\n");
          out.write("\r\n");
          out.write("\t\t\t<li><a data-target=\".legal-menu3\" class=\"nav-header collapsed\" data-toggle=\"collapse\">科室信息管理<i\r\n");
          out.write("\t\t\t\t\tclass=\"fa fa-collapse\"></i></a></li>\r\n");
          out.write("\t\t\t<li><ul class=\"legal-menu3 nav nav-list collapse\">\r\n");
          out.write("\t\t\t\t\t<li><a href=\"dept/createDept.action\"><span class=\"fa fa-caret-right\"></span>新增科室信息</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"dept/getAllDept.action\"><span class=\"fa fa-caret-right\"></span>科室信息列表</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"dept/queryDeptByCond.action\"><span class=\"fa fa-caret-right\"></span>科室信息查询</a></li>\r\n");
          out.write("\t\t\t\t</ul></li>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t<li><a data-target=\".legal-menu5\" class=\"nav-header collapsed\" data-toggle=\"collapse\">患者用户信息管理<i\r\n");
          out.write("\t\t\t\t\tclass=\"fa fa-collapse\"></i></a></li>\r\n");
          out.write("\t\t\t<li><ul class=\"legal-menu5 nav nav-list collapse\">\r\n");
          out.write("\t\t\t\t\t<li><a href=\"users/getAllUsers.action\"><span class=\"fa fa-caret-right\"></span>患者用户信息列表</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"users/queryUsersByCond.action\"><span class=\"fa fa-caret-right\"></span>患者用户信息查询</a></li>\r\n");
          out.write("\t\t\t\t</ul></li>\r\n");
          out.write("\r\n");
          out.write("\t\t\t<li><a data-target=\".legal-menu6\" class=\"nav-header collapsed\" data-toggle=\"collapse\">内容主题信息管理<i\r\n");
          out.write("\t\t\t\t\tclass=\"fa fa-collapse\"></i></a></li>\r\n");
          out.write("\t\t\t<li><ul class=\"legal-menu6 nav nav-list collapse\">\r\n");
          out.write("\t\t\t\t\t<li><a href=\"banner/createBanner.action\"><span class=\"fa fa-caret-right\"></span>新增内容主题信息</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"banner/getAllBanner.action\"><span class=\"fa fa-caret-right\"></span>内容主题信息列表</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"banner/queryBannerByCond.action\"><span class=\"fa fa-caret-right\"></span>内容主题信息查询</a></li>\r\n");
          out.write("\t\t\t\t</ul></li>\r\n");
          out.write("\r\n");
          out.write("\t\t\t<li><a data-target=\".legal-menu7\" class=\"nav-header collapsed\" data-toggle=\"collapse\">网站内容信息管理<i\r\n");
          out.write("\t\t\t\t\tclass=\"fa fa-collapse\"></i></a></li>\r\n");
          out.write("\t\t\t<li><ul class=\"legal-menu7 nav nav-list collapse\">\r\n");
          out.write("\t\t\t\t\t<li><a href=\"article/createArticle.action\"><span class=\"fa fa-caret-right\"></span>新增网站内容信息</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"article/getAllArticle.action\"><span class=\"fa fa-caret-right\"></span>网站内容信息列表</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"article/queryArticleByCond.action\"><span class=\"fa fa-caret-right\"></span>网站内容信息查询</a></li>\r\n");
          out.write("\t\t\t\t</ul></li>\r\n");
          out.write("\r\n");
          out.write("\t\t\t<li><a data-target=\".legal-menu8\" class=\"nav-header collapsed\" data-toggle=\"collapse\">用户挂号信息管理<i\r\n");
          out.write("\t\t\t\t\tclass=\"fa fa-collapse\"></i></a></li>\r\n");
          out.write("\t\t\t<li><ul class=\"legal-menu8 nav nav-list collapse\">\r\n");
          out.write("\t\t\t\t\t<li><a href=\"asign/getAllAsign.action\"><span class=\"fa fa-caret-right\"></span>用户挂号信息列表</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"asign/queryAsignByCond.action\"><span class=\"fa fa-caret-right\"></span>用户挂号信息查询</a></li>\r\n");
          out.write("\t\t\t\t</ul></li>\r\n");
          out.write("\r\n");
          out.write("\t\t\t<li><a data-target=\".legal-menu9\" class=\"nav-header collapsed\" data-toggle=\"collapse\">评价信息管理<i\r\n");
          out.write("\t\t\t\t\tclass=\"fa fa-collapse\"></i></a></li>\r\n");
          out.write("\t\t\t<li><ul class=\"legal-menu9 nav nav-list collapse\">\r\n");
          out.write("\t\t\t\t\t<li><a href=\"topic/getAllTopic.action\"><span class=\"fa fa-caret-right\"></span>评价信息列表</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"topic/queryTopicByCond.action\"><span class=\"fa fa-caret-right\"></span>评价信息查询</a></li>\r\n");
          out.write("\t\t\t\t</ul></li>\r\n");
          out.write("\r\n");
          out.write("\t\t\t<li><a data-target=\".legal-menu10\" class=\"nav-header collapsed\" data-toggle=\"collapse\">药品信息管理<i\r\n");
          out.write("\t\t\t\t\tclass=\"fa fa-collapse\"></i></a></li>\r\n");
          out.write("\t\t\t<li><ul class=\"legal-menu10 nav nav-list collapse\">\r\n");
          out.write("\t\t\t\t\t<li><a href=\"drugs/createDrugs.action\"><span class=\"fa fa-caret-right\"></span>新增药品信息</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"drugs/getAllDrugs.action\"><span class=\"fa fa-caret-right\"></span>药品信息列表</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"drugs/queryDrugsByCond.action\"><span class=\"fa fa-caret-right\"></span>药品信息查询</a></li>\r\n");
          out.write("\t\t\t\t</ul></li>\r\n");
          out.write("\r\n");
          out.write("\t\t\t<li><a data-target=\".legal-menu11\" class=\"nav-header collapsed\" data-toggle=\"collapse\">病例信息管理<i\r\n");
          out.write("\t\t\t\t\tclass=\"fa fa-collapse\"></i></a></li>\r\n");
          out.write("\t\t\t<li><ul class=\"legal-menu11 nav nav-list collapse\">\r\n");
          out.write("\t\t\t\t\t<li><a href=\"advice/getAllAdvice.action\"><span class=\"fa fa-caret-right\"></span>病例信息列表</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"advice/queryAdviceByCond.action\"><span class=\"fa fa-caret-right\"></span>病例信息查询</a></li>\r\n");
          out.write("\t\t\t\t</ul></li>\r\n");
          out.write("\r\n");
          out.write("\t\t\t<li><a data-target=\".legal-menu12\" class=\"nav-header collapsed\" data-toggle=\"collapse\">处方信息管理<i\r\n");
          out.write("\t\t\t\t\tclass=\"fa fa-collapse\"></i></a></li>\r\n");
          out.write("\t\t\t<li><ul class=\"legal-menu12 nav nav-list collapse\">\r\n");
          out.write("\t\t\t\t\t<li><a href=\"sell/getAllSell.action\"><span class=\"fa fa-caret-right\"></span>处方信息列表</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"sell/querySellByCond.action\"><span class=\"fa fa-caret-right\"></span>处方信息查询</a></li>\r\n");
          out.write("\t\t\t\t</ul></li>\r\n");
          out.write("\r\n");
          out.write("\t\t\t<li><a data-target=\".legal-menu13\" class=\"nav-header collapsed\" data-toggle=\"collapse\">留言交流信息管理<i\r\n");
          out.write("\t\t\t\t\tclass=\"fa fa-collapse\"></i></a></li>\r\n");
          out.write("\t\t\t<li><ul class=\"legal-menu13 nav nav-list collapse\">\r\n");
          out.write("\t\t\t\t\t<li><a href=\"bbs/getAllBbs.action\"><span class=\"fa fa-caret-right\"></span>留言交流信息列表</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"bbs/queryBbsByCond.action\"><span class=\"fa fa-caret-right\"></span>留言交流信息查询</a></li>\r\n");
          out.write("\t\t\t\t</ul></li>\r\n");
          out.write("\r\n");
          out.write("\t\t\t<li><a data-target=\".legal-menu14\" class=\"nav-header collapsed\" data-toggle=\"collapse\">留言回复信息管理<i\r\n");
          out.write("\t\t\t\t\tclass=\"fa fa-collapse\"></i></a></li>\r\n");
          out.write("\t\t\t<li><ul class=\"legal-menu14 nav nav-list collapse\">\r\n");
          out.write("\t\t\t\t\t<li><a href=\"rebbs/getAllRebbs.action\"><span class=\"fa fa-caret-right\"></span>留言回复信息列表</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"rebbs/queryRebbsByCond.action\"><span class=\"fa fa-caret-right\"></span>留言回复信息查询</a></li>\r\n");
          out.write("\t\t\t\t</ul></li>\r\n");
          out.write("\r\n");
          out.write("\t\t</ul>\r\n");
          out.write("\t</div>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /admin/menu.jsp(136,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.role eq '医生' }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t<div class=\"sidebar-nav\">\r\n");
          out.write("\t\t<ul>\r\n");
          out.write("\t\t\t<li><a data-target=\".legal-menu7\" class=\"nav-header collapsed\" data-toggle=\"collapse\">用户挂号信息管理<i\r\n");
          out.write("\t\t\t\t\tclass=\"fa fa-collapse\"></i></a></li>\r\n");
          out.write("\t\t\t<li><ul class=\"legal-menu7 nav nav-list collapse\">\r\n");
          out.write("\t\t\t\t\t<li><a href=\"asign/getTodayAsign.action\"> <span class=\"title\">今日用户挂号信息列表</span></a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"asign/getDoctorAsign.action\"> <span class=\"title\">我的用户挂号信息列表</span></a></li>\r\n");
          out.write("\t\t\t\t</ul></li>\r\n");
          out.write("\t\t\t<li><a data-target=\".legal-menu8\" class=\"nav-header collapsed\" data-toggle=\"collapse\">药品信息管理<i\r\n");
          out.write("\t\t\t\t\tclass=\"fa fa-collapse\"></i></a></li>\r\n");
          out.write("\t\t\t<li><ul class=\"legal-menu8 nav nav-list collapse\">\r\n");
          out.write("\t\t\t\t\t<li><a href=\"drugs/queryDrugsByCond.action\"><span class=\"fa fa-caret-right\"></span>药品信息查询</a></li>\r\n");
          out.write("\t\t\t\t</ul></li>\r\n");
          out.write("\t\t\t<li><a data-target=\".legal-menu9\" class=\"nav-header collapsed\" data-toggle=\"collapse\">医嘱信息管理<i\r\n");
          out.write("\t\t\t\t\tclass=\"fa fa-collapse\"></i></a></li>\r\n");
          out.write("\t\t\t<li><ul class=\"legal-menu9 nav nav-list collapse\">\r\n");
          out.write("\t\t\t\t\t<li><a href=\"advice/getDoctorAdvice.action\"> <span class=\"title\">我的医嘱信息列表</span></a></li>\r\n");
          out.write("\t\t\t\t</ul></li>\r\n");
          out.write("\t\t\t<li><a data-target=\".legal-menu9\" class=\"nav-header collapsed\" data-toggle=\"collapse\">电子病历管理<i\r\n");
          out.write("\t\t\t\t\tclass=\"fa fa-collapse\"></i></a></li>\r\n");
          out.write("\t\t\t<li><ul class=\"legal-menu9 nav nav-list collapse\">\r\n");
          out.write("\t\t\t\t\t<li><a href=\"electronicmd/createElectronicMD.action\"> <span class=\"title\">添加电子病历</span></a></li>\r\n");
          out.write("\t\t\t\t</ul></li>\r\n");
          out.write("\t\t\t<li><ul class=\"legal-menu9 nav nav-list collapse\">\r\n");
          out.write("\t\t\t\t\t<li><a href=\"electronicmd/getElectronicMD.action\"> <span class=\"title\">电子病历信息列表</span></a></li>\r\n");
          out.write("\t\t\t\t</ul></li>\r\n");
          out.write("\t\t</ul>\r\n");
          out.write("\t</div>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}
