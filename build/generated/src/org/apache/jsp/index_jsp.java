package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Example</title>\n");
      out.write("        <style>\n");
      out.write("    header, footer {\n");
      out.write("padding: 1em;\n");
      out.write("    color: white;\n");
      out.write("    background-color: #312f2f;\n");
      out.write("    clear: left;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("            <header>\n");
      out.write("    <img src=\"./img/logo.png\" alt=\"logo\" />\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("        <form method=\"post\" action=\"login.jsp\">\n");
      out.write("            <center>\n");
      out.write("            <table border=\"0\" width=\"30%\" cellpadding=\"3\">\n");
      out.write("                \n");
      out.write("              \n");
      out.write("                    <tr>\n");
      out.write("                        <td>User Name</td>\n");
      out.write("                        <td><input type=\"text\" name=\"uname\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Password</td>\n");
      out.write("                        <td><input type=\"password\" name=\"pass\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" value=\"Login\" /></td>\n");
      out.write("                        <td><input type=\"reset\" value=\"Reset\" /></td>\n");
      out.write("                    </tr><br>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\"><h4>Yet Not Registered!! &nbsp &nbsp &nbsp <a href=\"reg.jsp\">Register Here</a></td>\n");
      out.write("                    </tr>\n");
      out.write("              \n");
      out.write("            </table>\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("        <img style=\"position: absolute;top:300px;left:400px;width:700px;height: 200px\" src=\"./img/morp.png\"/>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <footer>&copy; Miracle Software Systems, Inc. All Rights Reserved</footer> \n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
