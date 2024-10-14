/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.25
 * Generated at: 2024-10-14 07:54:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.handlefh;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class person_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Person Management</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <h1>Person Management</h1>\r\n");
      out.write("\r\n");
      out.write("    <!-- 모든 사람 목록 보기 -->\r\n");
      out.write("    <h2>All People</h2>\r\n");
      out.write("    <button onclick=\"fetchPeople()\">Load People</button>\r\n");
      out.write("    <div id=\"peopleList\"></div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 특정 사람 조회 -->\r\n");
      out.write("    <h2>Get Person by ID</h2>\r\n");
      out.write("    <input type=\"text\" id=\"personId\" placeholder=\"Enter Person ID\" />\r\n");
      out.write("    <button onclick=\"fetchPersonById()\">Get Person</button>\r\n");
      out.write("    <div id=\"personInfo\"></div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 새로운 사람 추가 -->\r\n");
      out.write("    <h2>Add New Person</h2>\r\n");
      out.write("    <input type=\"text\" id=\"newPersonName\" placeholder=\"Enter New Person's Name\" />\r\n");
      out.write("    <button onclick=\"addPerson()\">Add Person</button>\r\n");
      out.write("    <div id=\"addPersonResult\"></div>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        // Fetch all people from /people\r\n");
      out.write("        function fetchPeople() {\r\n");
      out.write("            fetch('/people')\r\n");
      out.write("                .then(response => response.json())\r\n");
      out.write("                .then(data => {\r\n");
      out.write("                    let result = '<ul>';\r\n");
      out.write("                    data.forEach(person => {\r\n");
      out.write("                        result += `<li>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${person.name}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" (ID: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${person.id}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(")</li>`;\r\n");
      out.write("                    });\r\n");
      out.write("                    result += '</ul>';\r\n");
      out.write("                    document.getElementById('peopleList').innerHTML = result;\r\n");
      out.write("                })\r\n");
      out.write("                .catch(error => {\r\n");
      out.write("                    document.getElementById('peopleList').innerHTML = 'Error fetching people: ' + error;\r\n");
      out.write("                });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // Fetch a specific person by ID from /person/{id}\r\n");
      out.write("        function fetchPersonById() {\r\n");
      out.write("        	const id = document.getElementById('personId').value;\r\n");
      out.write("            const url = '/person/' + id;  // 문자열로 URL 생성\r\n");
      out.write("            fetch(url)\r\n");
      out.write("                .then(response => {\r\n");
      out.write("                    if (!response.ok) {\r\n");
      out.write("                        throw new Error('Person not found');\r\n");
      out.write("                    }\r\n");
      out.write("                    return response.json();\r\n");
      out.write("                })\r\n");
      out.write("                .then(person => {\r\n");
      out.write("                    document.getElementById('personInfo').innerHTML = `Name: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${person.name}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(", ID: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${person.id}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("`;\r\n");
      out.write("                })\r\n");
      out.write("                .catch(error => {\r\n");
      out.write("                    document.getElementById('personInfo').innerHTML = 'Error fetching person: ' + error;\r\n");
      out.write("                });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // Add a new person via POST to /person\r\n");
      out.write("        function addPerson() {\r\n");
      out.write("            const name = document.getElementById('newPersonName').value;\r\n");
      out.write("            const personData = {\r\n");
      out.write("                name: name,\r\n");
      out.write("                id: Math.floor(Math.random() * 1000).toString() // 임의의 ID 생성\r\n");
      out.write("            };\r\n");
      out.write("\r\n");
      out.write("            fetch('/person', {\r\n");
      out.write("                method: 'POST',\r\n");
      out.write("                headers: {\r\n");
      out.write("                    'Content-Type': 'application/json'\r\n");
      out.write("                },\r\n");
      out.write("                body: JSON.stringify(personData)\r\n");
      out.write("            })\r\n");
      out.write("            .then(response => {\r\n");
      out.write("                if (response.ok) {\r\n");
      out.write("                    document.getElementById('addPersonResult').innerHTML = 'Person added successfully!';\r\n");
      out.write("                    fetchPeople(); // 목록을 갱신\r\n");
      out.write("                } else {\r\n");
      out.write("                    throw new Error('Failed to add person');\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("            .catch(error => {\r\n");
      out.write("                document.getElementById('addPersonResult').innerHTML = 'Error: ' + error;\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
