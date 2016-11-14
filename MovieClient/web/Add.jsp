<%-- 
    Add.jsp : สำหรับเพิ่มข้อมูลรายการภาพยนตร์
       ตัวอย่างถ้าต้องการเพิ่ม element ในรายภาพยนตร์
    * สิ่งแรกที่ต้องทำ คือ เพิ่ม label เช่น
		<label>
                    <span>Actor</span>
                    <input type="text" name="Addactor"/>
		</label>
    * จากนั้นเมื่อแก้เงื่อนไขที่ไฟล์ MvWebService กด clean build deploy ไฟล์ทั้งสองใหม่ (service ก่อน)
    * actor รับค่าเป็นสตริงสร้างตัวแปรมารับค่าเพิ่มจาก input Addactor
                java.lang.String actor = request.getParameter("Addactor");
    * เรียกใช้ mothod ใส่ค่าพารามิเตอร์ให้ตรงกับฟังก์ชันนั้น
                java.lang.String result = port.addMovie(title, year, types, time, director, actor);
    * ส่วนการแสดงผลเมื่อกด crerate แล้ว
                String[] show = result.split("--",8); // เก็บที่ตำแหน่ง 0-7
    * เพิ่มค่าการอะเรย์ที่ตัดแบ่ง จาก 7 เป็น 8 เพราะเราได้เพิ่มรายการของ actor 
    * ** มาในสตริงที่ส่งค่ากลับของ method addmovie 
    * เพิ่มตารางที่ใช้แสดงค่าหลังกด create ในที่นี้คือ
                <tr>
                    <th ><div align="left">Actor: </div><br/></th>
                    <td ><%=show[6]%></td>
                </tr>    
    * เปลี่ยนตำแหน่งอะเรย์ในค่าที่จะส่ง   input ไปยัง หน้า delete และ edit 
    * <%=show[6]%> เป็น <%=show[7]%>
    * เพราะในสตริงที่ส่งค่ากลับมาจาก service ตำแหน่งของรายการภาพยนตร์จะส่งมาเป็นลำดับสุดท้าย
                        <form action="Delete.jsp" method="POST">
                            <input type="hidden" name="number" value="<%=show[7]%>" />
                            <input class="button1" name="act" type="submit" value="Delete" />
                        </form></td><td>
                        <form action="Edit.jsp" method="POST">
                            <input type="hidden" name="number" value="<%=show[7]%>" />
                            <input class="button1" name="act" type="submit" value="Edit" />
                        </form>

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="user-scalable=0, width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<title>Seriously G3</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link rel="stylesheet" type="text/css" href="css/mobile.css">
	<script type='text/javascript' src='js/mobile.js'></script>
    </head>
    <body>
        <div id="header">
            <h1><a>Movie Service<span>By Seriously group3</span></a></h1>
		
            <ul id="navigation">
                <li>
                    <a href="Home.jsp">Home</a>
                </li>
		<li>
                    <a href="Search.jsp">Search</a>
                    <ul>
                        <li><a href="Search.jsp">Category</a></li>
                        <li><a href="SearchQ.jsp">Query</a></li>
                    </ul>		
                </li>
		<li class="current">
                    <a href="Add.jsp">Add Movie</a>
		</li>
		<li>
                    <a href="Delete.jsp">Delete</a>
		</li>
		<li>
                    <a href="Edit.jsp">Edit</a>
		</li>
                <li>
                    <a href="Blog.jsp">Blog</a>
                    <ul>
                        <li><a href="../MovieWebService/movies.xml">XML File</a></li>
                        <li><a href="../MovieWebService/mvWebService?WSDL">WSDL File</a></li>
                        <li><a href="../MovieWebService/mvWebService?Tester">Test Soap</a></li>
                    </ul>
                </li>
            </ul>
	</div>
	<div id="body">
            <%-- start web service invocation --%>    
            <%
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
                %>
                <h2>Result</h2>
                <div class="page3-box1">                
                <table align="center">
                <tr>
                    <th><div align="left">Title: </div><br/></th>
                    <td ><%=show[1]%></td>
                </tr>
                <tr>
                    <th><div align="left">Year: </div><br/></th>
                    <td ><%=show[2]%></td>
                </tr>
                <tr>
                    <th ><div align="left">Types: </div><br/></th>
                    <td ><%=show[3]%></td>
                </tr>
                <tr>
                    <th ><div align="left">Time: </div><br/></th>
                    <td ><%=show[4]%></td>
                </tr>
                <tr>
                    <th ><div align="left">Director: </div><br/></th>
                    <td ><%=show[5]%></td>
                </tr>
                <tr>
                    <th ><div align="left">Actor: </div><br/></th>
                    <td ><%=show[6]%></td>
                </tr>                
                <tr>
                    <td>
                        <form action="Delete.jsp" method="POST">
                            <input type="hidden" name="number" value="<%=show[7]%>" />
                            <input class="button1" name="act" type="submit" value="Delete" />
                        </form></td><td>
                        <form action="Edit.jsp" method="POST">
                            <input type="hidden" name="number" value="<%=show[7]%>" />
                            <input class="button1" name="act" type="submit" value="Edit" />
                        </form>
                    </td>
                </tr>
                </table>     
                </div>
                <br><br><br>
                
        <%
        } catch (Exception ex) {
            // TODO handle custom exceptions here
}%>
            
        <%-- end web service invocation --%>   
            <h2>Add Movie</h2>
            <form>
                <h3>Create List New Movie</h3>
		<label for="name">
                    <span>Title</span>
                    <input type="text" name="addTitle" />
		</label>
		<label for="year">
                    <span>Year (ex. 2016)</span>
                    <input type="text" name="addYear"/>
		</label>
		<label for="subject">
                    <span>Types (ex. Drama,Action,...)</span>
                    <input type="text" name="addTypes"/>
		</label>
                <label>
                    <span>Time (min)</span>
                    <input type="text" name="addTime"/>
		</label>
                <label>
                    <span>Director</span>
                    <input type="text" name="AddDirec"/>
		</label>
                <label>
                    <span>Actor</span>
                    <input type="text" name="Addactor"/>
		</label><br>
		<input type="submit" class="button1" value="Create"/>
            </form>
                         
	</div>          <!-- Footer fragment -->
        <div class="fregment">
            <jsp:include page="/Fragments/footer.jsp"></jsp:include>
        </div>
    </body>
</html>
