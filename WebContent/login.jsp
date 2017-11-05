<html>
<body>


<jsp:include page="/headandfoot/header.html"></jsp:include>
<br>
<br>
<%@taglib uri="/struts-tags" prefix="s" %>
<s:form action="login"  style="align:center;">
<h1 id="heading">LOGIN PORTAL</h1>
<s:textfield name="username" label="USERNAME" style="color:red;"></s:textfield>
<s:textfield name="password" label="PASSWORD" style="color:red;"></s:textfield>
<s:submit value="LOGIN" style="background-color:red;color:snow;"></s:submit>
</s:form>








<jsp:include page="/headandfoot/footer.html"></jsp:include>
</body>


</html>