<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleAreaOfTriangleProxyid" scope="session" class="com.metacube.AreaOfTriangleProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleAreaOfTriangleProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleAreaOfTriangleProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleAreaOfTriangleProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.metacube.AreaOfTriangle getAreaOfTriangle10mtemp = sampleAreaOfTriangleProxyid.getAreaOfTriangle();
if(getAreaOfTriangle10mtemp == null){
%>
<%=getAreaOfTriangle10mtemp %>
<%
}else{
        if(getAreaOfTriangle10mtemp!= null){
        String tempreturnp11 = getAreaOfTriangle10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String side1_1id=  request.getParameter("side116");
        double side1_1idTemp  = Double.parseDouble(side1_1id);
        String side2_2id=  request.getParameter("side218");
        double side2_2idTemp  = Double.parseDouble(side2_2id);
        String side3_3id=  request.getParameter("side320");
        double side3_3idTemp  = Double.parseDouble(side3_3id);
        java.lang.String calculateArea13mtemp = sampleAreaOfTriangleProxyid.calculateArea(side1_1idTemp,side2_2idTemp,side3_3idTemp);
if(calculateArea13mtemp == null){
%>
<%=calculateArea13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(calculateArea13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>