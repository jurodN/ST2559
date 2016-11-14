package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"user-scalable=0, width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("\t<title>Seriously G3</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/mobile.css\">\n");
      out.write("\t<script type='text/javascript' src='js/mobile.js'></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <h1><a>Movie Service<span>By Seriously group3</span></a></h1>\n");
      out.write("\t\t\n");
      out.write("            <ul id=\"navigation\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"Home.jsp\">Home</a>\n");
      out.write("                </li>\n");
      out.write("\t\t<li>\n");
      out.write("                    <a href=\"Search.jsp\">Search</a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"Search.jsp\">Category</a></li>\n");
      out.write("                        <li><a href=\"SearchQ.jsp\">Query</a></li>\n");
      out.write("                    </ul>\t\t\n");
      out.write("                </li>\n");
      out.write("\t\t<li class=\"current\">\n");
      out.write("                    <a href=\"Add.jsp\">Add Movie</a>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li>\n");
      out.write("                    <a href=\"Delete.jsp\">Delete</a>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li>\n");
      out.write("                    <a href=\"Edit.jsp\">Edit</a>\n");
      out.write("\t\t</li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"Blog.jsp\">Blog</a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"../MovieWebService/movies.xml\">XML File</a></li>\n");
      out.write("                        <li><a href=\"../MovieWebService/mvWebService?WSDL\">WSDL File</a></li>\n");
      out.write("                        <li><a href=\"../MovieWebService/mvWebService?Tester\">Test Soap</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"body\">\n");
      out.write("            ");
      out.write("    \n");
      out.write("            ");

            try {
                serverpack.MvWebService_Service service = new serverpack.MvWebService_Service();
                serverpack.MvWebService port = service.getMvWebServicePort();
                 // TODO initialize WS operation arguments here
                java.lang.String title = request.getParameter("addTitle");
                java.lang.String year = request.getParameter("addYear");
                java.lang.String types = request.getParameter("addTypes");
                int time = Integer.parseInt(request.getParameter("addTime"));
                java.lang.String director = request.getParameter("AddDirec");
                java.lang.String actor = request.getParameter("Addactor");

                // TODO process result here
                //java.lang.String result = port.deleteMovie(time);	
                java.lang.String result = port.addMovie(title, year, types, time, director, actor);
                String[] show = result.split("--",8);
                
      out.write("\n");
      out.write("                <h2>Result</h2>\n");
      out.write("                <div class=\"page3-box1\">                \n");
      out.write("                <table align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <th><div align=\"left\">Title: </div><br/></th>\n");
      out.write("                    <td >");
      out.print(show[1]);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th><div align=\"left\">Year: </div><br/></th>\n");
      out.write("                    <td >");
      out.print(show[2]);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th ><div align=\"left\">Types: </div><br/></th>\n");
      out.write("                    <td >");
      out.print(show[3]);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th ><div align=\"left\">Time: </div><br/></th>\n");
      out.write("                    <td >");
      out.print(show[4]);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th ><div align=\"left\">Director: </div><br/></th>\n");
      out.write("                    <td >");
      out.print(show[5]);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th ><div align=\"left\">Actor: </div><br/></th>\n");
      out.write("                    <td >");
      out.print(show[6]);
      out.write("</td>\n");
      out.write("                </tr>                \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <form action=\"Delete.jsp\" method=\"POST\">\n");
      out.write("                            <input type=\"hidden\" name=\"number\" value=\"");
      out.print(show[7]);
      out.write("\" />\n");
      out.write("                            <input class=\"button1\" name=\"act\" type=\"submit\" value=\"Delete\" />\n");
      out.write("                        </form></td><td>\n");
      out.write("                        <form action=\"Edit.jsp\" method=\"POST\">\n");
      out.write("                            <input type=\"hidden\" name=\"number\" value=\"");
      out.print(show[7]);
      out.write("\" />\n");
      out.write("                            <input class=\"button1\" name=\"act\" type=\"submit\" value=\"Edit\" />\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                </table>     \n");
      out.write("                </div>\n");
      out.write("                <br><br><br>\n");
      out.write("                \n");
      out.write("        ");

        } catch (Exception ex) {
            // TODO handle custom exceptions here
}
      out.write("\n");
      out.write("            \n");
      out.write("        ");
      out.write("   \n");
      out.write("            <h2>Add Movie</h2>\n");
      out.write("            <form>\n");
      out.write("                <h3>Create List New Movie</h3>\n");
      out.write("\t\t<label for=\"name\">\n");
      out.write("                    <span>Title</span>\n");
      out.write("                    <input type=\"text\" name=\"addTitle\" />\n");
      out.write("\t\t</label>\n");
      out.write("\t\t<label for=\"year\">\n");
      out.write("                    <span>Year (ex. 2016)</span>\n");
      out.write("                    <input type=\"text\" name=\"addYear\"/>\n");
      out.write("\t\t</label>\n");
      out.write("\t\t<label for=\"subject\">\n");
      out.write("                    <span>Types (ex. Drama,Action,...)</span>\n");
      out.write("                    <input type=\"text\" name=\"addTypes\"/>\n");
      out.write("\t\t</label>\n");
      out.write("                <label>\n");
      out.write("                    <span>Time (min)</span>\n");
      out.write("                    <input type=\"text\" name=\"addTime\"/>\n");
      out.write("\t\t</label>\n");
      out.write("                <label>\n");
      out.write("                    <span>Director</span>\n");
      out.write("                    <input type=\"text\" name=\"AddDirec\"/>\n");
      out.write("\t\t</label>\n");
      out.write("                <label>\n");
      out.write("                    <span>Actor</span>\n");
      out.write("                    <input type=\"text\" name=\"Addactor\"/>\n");
      out.write("\t\t</label><br>\n");
      out.write("\t\t<input type=\"submit\" class=\"button1\" value=\"Create\"/>\n");
      out.write("            </form>\n");
      out.write("                         \n");
      out.write("\t</div>          <!-- Footer fragment -->\n");
      out.write("        <div class=\"fregment\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/Fragments/footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
