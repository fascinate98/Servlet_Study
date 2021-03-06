/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.56
 * Generated at: 2022-01-10 02:01:46 UTC
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

public final class homeView_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("	<meta charset=\"UTF-8\">\n");
      out.write("	<title>Responsive Navigation Bar</title>\n");
      out.write("	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("	<script src=\"https://kit.fontawesome.com/b99e675b6e.js\"></script>\n");
      out.write("	<link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/css/header.css\">\n");
      out.write("	<link rel=\"stylesheet\" href = \"");
      out.print( request.getContextPath() );
      out.write("/css/common.css\">\n");
      out.write("	<link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/css/home.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("	<div class=\"navbar\">\n");
      out.write("		<div class=\"inner_navbar\">\n");
      out.write("				<div class=\"logo\">\n");
      out.write("				<a href=\"#\">BL<span>IND</span></a>\n");
      out.write("				");

				String name = "Guest";
				boolean islogin = false;
				MemberVO vo = (MemberVO)session.getAttribute("logininfo") ;
				if(vo == null){
					name = "Guest";
				}else{
					name = vo.getMem_name();
					islogin = true;
				}
				
      out.write("\n");
      out.write("				<p>");
      out.print(name );
      out.write("님 안녕하세요!</p>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"menu\">\n");
      out.write("				<ul>\n");
      out.write("				    <li><a href=\"#\" class=\"active\">Home</a></li>\n");
      out.write("				    <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/jspsrc/aboutUsView.jsp\">About Us</a></li>\n");
      out.write("			   	    <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/content?action=getalllist\">Forum</a></li>\n");
      out.write("					<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/content?action=getmylist\">My Page</a></li>\n");
      out.write("					<li>              \n");
      out.write("			  ");

              		if(islogin){
      out.write("\n");
      out.write("              			<a href=\"/bbs/memberset?action=logout\">Logout</a>\n");
      out.write("              ");
 	}else{ 
      out.write("\n");
      out.write("              			<a href=\"");
      out.print( request.getContextPath() );
      out.write("/jspsrc/loginView.jsp\">Login</a>\n");
      out.write("            	  	\n");
      out.write("              ");
  }
              
      out.write("\n");
      out.write("            	</li>\n");
      out.write("				</ul>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"hamburger\">\n");
      out.write("			<i class=\"fas fa-bars\"></i>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<div class=\"main_container\">\n");
      out.write("		<div class=\"content\">\n");
      out.write("			<div class=\"item_wrap\">\n");
      out.write("				<div class=\"item\">\n");
      out.write("					残酷な天使のように<br>\n");
      out.write("					자은코쿠나 텐시노 요-니<br>\n");
      out.write("					잔혹한 천사인 것 처럼<br><br>\n");
      out.write("					少年よ　神話になれ<br>\n");
      out.write("					쇼-네은요 신와니 나레<br>\n");
      out.write("					소년이여 신화가 되어라\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"item_wrap\">\n");
      out.write("				<div class=\"item\">\n");
      out.write("					취업 때문에 '잔소리·욕설' 아버지 살해한 아들, 2심서 감형<br>\n");
      out.write("					[아시아경제 김형민 기자] 취업 문제로 잔소리하고 욕설을 일삼은 아버지를 흉기로 살해한 아들이 항소심에서 감형됐다. 평소 사회생활과 대인관계에서 스트레스를 받은 사정이 참작됐다.<br><br>\n");
      out.write("					부산고법 울산재판부 형사1부(부장판사 박해빈)는 존속살해 혐의로 재판에 넘겨진 30대 A씨에게 징역 15년이던 원심을 파기하고 징역 13년을 선고했다고 9일 밝혔다<br><br>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"item_wrap\">\n");
      out.write("					<div class=\"item\">\n");
      out.write("					'일자리 정부'라더니… 대졸 취업률은 바닥 [심층기획-‘일자리 정부’ 헛구호]<br>\n");
      out.write("					2020년 대졸자 취업률이 65%대로 떨어졌다. 정부가 취업률 통계를 낸 이후 최저치다.\n");
      out.write("\n");
      out.write("					9일 교육부와 통계청 등에 따르면 2020년 고등교육기관 취업 대상자 48만149명 가운데 취업자는 31만2430명으로 집계됐다.<br> \n");
      out.write("					여기에는 해외취업자와 농림어업 종사자, 개인창작활동 종사자, 1인 창업자, 프리랜서까지 모두 포함됐다. 취업률은 65.1%에 불과했다.<br>\n");
      out.write(" 					취업률이 65%대를 기록한 건 2011년 교육과학기술부(현 교육부)가 통계 기준을 ‘직장 건강보험 가입자’에서 ‘행정 데이터베이스(DB)에서 검증된 이’로 전환한 이후 가장 낮은 수준이다.<br>\n");
      out.write("\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"item_wrap\">\n");
      out.write("						<div class=\"item\">\n");
      out.write("					'졸업 후 대기업 취업 보장' 대학가 계약학과 신설 잇따라<br>\n");
      out.write("					[이데일리 김의진 기자] 연세대·고려대·한국과학기술원(KAIST)·포항공대 등 국내 주요 대학들이 계약학과 개설에 나서고 있다. 첨단기술 분야에서 전문인력을 확보하려는 기업과 취업률 제고로 우수 인재를 선점하려는 대학이 손잡은 사례다.<br>\n");
      out.write("					9일 대학가에 따르면 연세대는 지난해 12월 LG디스플레이와 협약을 맺고 채용조건형 계약학과인 ‘디스플레이융합공학과’를 설립하기로 했다.<br> \n");
      out.write("					연세대는 오는 2023학년도부터 매년 30명씩 신입생을 선발한다. 모든 입학생은 등록금 전액을 지원받고, 졸업 후 LG디스플레이에 취업하는 것도 보장받게 된다.<br>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"item_wrap\">\n");
      out.write("				<div class=\"item\">\n");
      out.write("					'일자리 정부'라더니… 대졸 취업률은 바닥 [심층기획-‘일자리 정부’ 헛구호]<br>\n");
      out.write("					2020년 대졸자 취업률이 65%대로 떨어졌다. 정부가 취업률 통계를 낸 이후 최저치다.\n");
      out.write("\n");
      out.write("					9일 교육부와 통계청 등에 따르면 2020년 고등교육기관 취업 대상자 48만149명 가운데 취업자는 31만2430명으로 집계됐다.<br> \n");
      out.write("					여기에는 해외취업자와 농림어업 종사자, 개인창작활동 종사자, 1인 창업자, 프리랜서까지 모두 포함됐다. 취업률은 65.1%에 불과했다.<br>\n");
      out.write(" 					취업률이 65%대를 기록한 건 2011년 교육과학기술부(현 교육부)가 통계 기준을 ‘직장 건강보험 가입자’에서 ‘행정 데이터베이스(DB)에서 검증된 이’로 전환한 이후 가장 낮은 수준이다.<br>\n");
      out.write("\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"item_wrap\">\n");
      out.write("				<div class=\"item\">\n");
      out.write("					残酷な天使のテーゼ<br>\n");
      out.write("					자은코쿠나 텐시노 테-제<br>\n");
      out.write("					잔혹한 천사의 테제<br><br>\n");
      out.write("\n");
      out.write("					窓辺からやがて飛び立つ<br>\n");
      out.write("					마도베 카라 야가테 토비 타츠<br>\n");
      out.write("					창가에서 이윽고 날아 올라<br>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"item_wrap\">\n");
      out.write("						<div class=\"item\">\n");
      out.write("					'졸업 후 대기업 취업 보장' 대학가 계약학과 신설 잇따라<br>\n");
      out.write("					[이데일리 김의진 기자] 연세대·고려대·한국과학기술원(KAIST)·포항공대 등 국내 주요 대학들이 계약학과 개설에 나서고 있다. 첨단기술 분야에서 전문인력을 확보하려는 기업과 취업률 제고로 우수 인재를 선점하려는 대학이 손잡은 사례다.<br>\n");
      out.write("					9일 대학가에 따르면 연세대는 지난해 12월 LG디스플레이와 협약을 맺고 채용조건형 계약학과인 ‘디스플레이융합공학과’를 설립하기로 했다.<br> \n");
      out.write("					연세대는 오는 2023학년도부터 매년 30명씩 신입생을 선발한다. 모든 입학생은 등록금 전액을 지원받고, 졸업 후 LG디스플레이에 취업하는 것도 보장받게 된다.\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"item_wrap\">\n");
      out.write("				<div class=\"item\">\n");
      out.write("					'일자리 정부'라더니… 대졸 취업률은 바닥 [심층기획-‘일자리 정부’ 헛구호]<br>\n");
      out.write("					2020년 대졸자 취업률이 65%대로 떨어졌다. 정부가 취업률 통계를 낸 이후 최저치다.\n");
      out.write("					9일 교육부와 통계청 등에 따르면 2020년 고등교육기관 취업 대상자 48만149명 가운데 취업자는 31만2430명으로 집계됐다.<br> \n");
      out.write("					여기에는 해외취업자와 농림어업 종사자, 개인창작활동 종사자, 1인 창업자, 프리랜서까지 모두 포함됐다. 취업률은 65.1%에 불과했다.<br>\n");
      out.write(" 					취업률이 65%대를 기록한 건 2011년 교육과학기술부(현 교육부)가 통계 기준을 ‘직장 건강보험 가입자’에서 ‘행정 데이터베이스(DB)에서 검증된 이’로 전환한 이후 가장 낮은 수준이다.\n");
      out.write("\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"item_wrap\">\n");
      out.write("						<div class=\"item\">\n");
      out.write("					残酷な天使のように<br>\n");
      out.write("					자은코쿠나 텐시노 요-니<br>\n");
      out.write("					잔혹한 천사인 것 처럼<br><br>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"item_wrap\">\n");
      out.write("						<div class=\"item\">\n");
      out.write("					残酷な天使のように<br>\n");
      out.write("					자은코쿠나 텐시노 요-니<br>\n");
      out.write("					잔혹한 천사인 것 처럼<br><br>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"item_wrap\">\n");
      out.write("						<div class=\"item\">\n");
      out.write("					残酷な天使のように<br>\n");
      out.write("					자은코쿠나 텐시노 요-니<br>\n");
      out.write("					잔혹한 천사인 것 처럼<br><br>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"item_wrap\">\n");
      out.write("						<div class=\"item\">\n");
      out.write("					残酷な天使のように<br>\n");
      out.write("					자은코쿠나 텐시노 요-니<br>\n");
      out.write("					잔혹한 천사인 것 처럼<br><br>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</div>\n");
      out.write("<script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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
