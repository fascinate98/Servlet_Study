/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.56
 * Generated at: 2022-01-10 00:36:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jspsrc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.vo.*;
import java.util.ArrayList;

public final class forumView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("model.vo");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.ArrayList");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"UTF-8\">\r\n");
      out.write("	<title>Responsive Navigation Bar</title>\r\n");
      out.write("	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("	<script src=\"https://kit.fontawesome.com/b99e675b6e.js\"></script>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/css/header.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" href = \"");
      out.print( request.getContextPath() );
      out.write("/css/common.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" href = \"");
      out.print( request.getContextPath() );
      out.write("/css/forum2.css\">\r\n");
      out.write("		<link rel=\"stylesheet\" href = \"");
      out.print( request.getContextPath() );
      out.write("/css/text2.css\">\r\n");
      out.write("		<link rel=\"stylesheet\" href = \"");
      out.print( request.getContextPath() );
      out.write("/css/search.css\">\r\n");
      out.write("		<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("	<div class=\"navbar\">\r\n");
      out.write("		<div class=\"inner_navbar\">\r\n");
      out.write("				<div class=\"logo\">\r\n");
      out.write("				<a href=\"#\">BL<span>IND</span></a>\r\n");
      out.write("				<p>Guest님 안녕하세요!</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"menu\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/jspsrc/homeView.jsp\" >Home</a></li>\r\n");
      out.write("              		<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/jspsrc/aboutUsView.jsp\">About Us</a></li>\r\n");
      out.write("           	  		<li><a href=\"#\" class = \"active\">Forum</a></li>\r\n");
      out.write("				<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/content?action=getmylist\">My Page</a></li>\r\n");
      out.write("					<li>              \r\n");
      out.write("			  <a href=\"");
      out.print( request.getContextPath() );
      out.write("/jspsrc/loginView.jsp\">Login</a>\r\n");
      out.write("            	</li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"hamburger\">\r\n");
      out.write("			<i class=\"fas fa-bars\"></i>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"s003\">\r\n");
      out.write("				<form method = \"get\" action =\"/bbs/content\" id = \"searc\">\r\n");
      out.write("				        <div class=\"inner-form\">\r\n");
      out.write("				          <div class=\"input-field first-wrap\">\r\n");
      out.write("				            <div class=\"input-select\">\r\n");
      out.write("				              <select data-trigger=\"\" name=\"sername\">\r\n");
      out.write("				                <option placeholder=\"\">검색 필터</option>\r\n");
      out.write("				                <option value=\"회사명\">회사명검색</option>\r\n");
      out.write("				                <option value=\"한줄평\">한줄평검색</option>\r\n");
      out.write("				                <option value=\"장단점\">내용검색</option>\r\n");
      out.write("				              </select>\r\n");
      out.write("				            </div>\r\n");
      out.write("				          </div>\r\n");
      out.write("				          <div class=\"input-field second-wrap\">\r\n");
      out.write("				            <input id=\"search\" type=\"search\" name = \"keyword\" placeholder=\"검색어를 입력하세요!\" />\r\n");
      out.write("				          </div>\r\n");
      out.write("				          <div class=\"input-field third-wrap\" >\r\n");
      out.write("				           <button class=\"btn-search\" type=\"button|submit\">\r\n");
      out.write("				              <svg class=\"svg-inline--fa fa-search fa-w-16\" aria-hidden=\"true\" data-prefix=\"fas\" data-icon=\"search\" role=\"img\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 512 512\" >\r\n");
      out.write("				                <path fill=\"currentColor\" d=\"M505 442.7L405.3 343c-4.5-4.5-10.6-7-17-7H372c27.6-35.3 44-79.7 44-128C416 93.1 322.9 0 208 0S0 93.1 0 208s93.1 208 208 208c48.3 0 92.7-16.4 128-44v16.3c0 6.4 2.5 12.5 7 17l99.7 99.7c9.4 9.4 24.6 9.4 33.9 0l28.3-28.3c9.4-9.4 9.4-24.6.1-34zM208 336c-70.7 0-128-57.2-128-128 0-70.7 57.2-128 128-128 70.7 0 128 57.2 128 128 0 70.7-57.2 128-128 128z\"></path>\r\n");
      out.write("				              </svg>\r\n");
      out.write("				            </button>\r\n");
      out.write("				          </div>\r\n");
      out.write("				        </div>\r\n");
      out.write("				      </form>\r\n");
      out.write("				  </div>\r\n");
      out.write("\r\n");
      out.write("	</div>	<div class=\"limiter\" >\r\n");
      out.write("		<div class=\"container-table100\">\r\n");
      out.write("				<div class=\"wrap-table100\">\r\n");
      out.write("					<div class=\"table100\">\r\n");
      out.write("						\r\n");
      out.write("					");
 
					ArrayList<ContentVO> list =(ArrayList<ContentVO>)session.getAttribute("forumlist");
				   if(list !=null){
				
      out.write(" \r\n");
      out.write("				<table>\r\n");
      out.write("					<thead>\r\n");
      out.write("						<tr class=\"table100-head\">\r\n");
      out.write("							<th class=\"column1\">회사명</th>\r\n");
      out.write("							<th class=\"column2\">한줄평</th>\r\n");
      out.write("							<th class=\"column3\">작성시간</th>\r\n");
      out.write("							<th class=\"column4\">조회수</th>\r\n");
      out.write("							<th class=\"column5\">추천수</th>\r\n");
      out.write("						</tr>\r\n");
      out.write("					</thead>\r\n");
      out.write("					\r\n");
      out.write("\r\n");
      out.write("				<tbody>\r\n");
      out.write("					");
for(ContentVO cvo:list){
      out.write("\r\n");
      out.write("				   <tr class = tble>\r\n");
      out.write("				      <td class=\"column1\">");
      out.print( cvo.getCon_company() );
      out.write("</td>\r\n");
      out.write("              		  <td class=\"column2\">");
      out.print( cvo.getCon_title() );
      out.write("</td>\r\n");
      out.write("				      <td class=\"column3\">");
      out.print( cvo.getCon_date() );
      out.write("</td>\r\n");
      out.write("				      <td class=\"column4\">");
      out.print( cvo.getCon_cnt() );
      out.write("</td>\r\n");
      out.write("				      <td class=\"column5\">");
      out.print( cvo.getCon_rec() );
      out.write("</td>\r\n");
      out.write("				   </tr>\r\n");
      out.write("				   ");
} 
      out.write("\r\n");
      out.write("				 \r\n");
      out.write("				  </tbody>\r\n");
      out.write("			   </table>\r\n");
      out.write("			   <div class = \"paging\">\r\n");
      out.write("			   	<nav>\r\n");
      out.write("					<ul class=\"pagination pagination-seperated \"></ul>\r\n");
      out.write("				</nav>\r\n");
      out.write("			   </div>\r\n");
      out.write("				   ");
}else{ 
      out.write("\r\n");
      out.write("				      <h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h2>\r\n");
      out.write("				   ");

				   }
				   
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			\r\n");
      out.write("			</div>\r\n");
      out.write("				\r\n");
      out.write("		</div>\r\n");
      out.write("	\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("<script src=\"js/extention/choices.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/main.js\"></script>\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("const choices = new Choices('[data-trigger]',\r\n");
      out.write("	      {\r\n");
      out.write("	        searchEnabled: false,\r\n");
      out.write("	        itemSelectText: '',\r\n");
      out.write("	      });\r\n");
      out.write("	      \r\n");
      out.write("	     \r\n");
      out.write("function pagination() {\r\n");
      out.write("	var req_num_row = 10; \r\n");
      out.write("	var $tr = jQuery('.tble'); \r\n");
      out.write("	var total_num_row = $tr.length;\r\n");
      out.write("	var num_pages = 0;\r\n");
      out.write("	if (total_num_row % req_num_row == 0) {\r\n");
      out.write("		num_pages = total_num_row / req_num_row;\r\n");
      out.write("	}\r\n");
      out.write("	if (total_num_row % req_num_row >= 1) {\r\n");
      out.write("		num_pages = total_num_row / req_num_row;\r\n");
      out.write("		num_pages++;\r\n");
      out.write("		num_pages = Math.floor(num_pages++);\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	for (var i = 1; i <= num_pages; i++) {\r\n");
      out.write("		jQuery('.pagination').append('<li class=\"page-item \"><a class=\"page-link\" href=\"#\">' + i + '</a></li>');\r\n");
      out.write("		jQuery('.pagination li:nth-child(2)').addClass(\"active\");\r\n");
      out.write("		jQuery('.pagination a').addClass(\"pagination-link\");\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	$tr.each(function(i) {\r\n");
      out.write("		jQuery(this).hide();\r\n");
      out.write("		if (i + 1 <= req_num_row) {\r\n");
      out.write("			$tr.eq(i).show();\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("	jQuery('.pagination a').click('.pagination-link', function(e) {\r\n");
      out.write("		e.preventDefault();\r\n");
      out.write("		$tr.hide();\r\n");
      out.write("		var page = jQuery(this).text();\r\n");
      out.write("		var temp = page - 1;\r\n");
      out.write("		var start = temp * req_num_row;\r\n");
      out.write("		var current_link = temp;\r\n");
      out.write("\r\n");
      out.write("		jQuery('.pagination li').removeClass(\"active\");\r\n");
      out.write("		jQuery(this).parent().addClass(\"active\");\r\n");
      out.write("\r\n");
      out.write("		for (var i = 0; i < req_num_row; i++) {\r\n");
      out.write("			$tr.eq(start + i).show();\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		if (temp >= 1) {\r\n");
      out.write("			jQuery('.pagination li:first-child').removeClass(\"disabled\");\r\n");
      out.write("		} else {\r\n");
      out.write("			jQuery('.pagination li:first-child').addClass(\"disabled\");\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("	jQuery('.prev').click(function(e) {\r\n");
      out.write("		e.preventDefault();\r\n");
      out.write("		jQuery('.pagination li:first-child').removeClass(\"active\");\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("	jQuery('.next').click(function(e) {\r\n");
      out.write("		e.preventDefault();\r\n");
      out.write("		jQuery('.pagination li:last-child').removeClass(\"active\");\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("jQuery('document').ready(function() {\r\n");
      out.write("	pagination();\r\n");
      out.write("\r\n");
      out.write("	jQuery('.pagination li:first-child').addClass(\"disabled\");\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
