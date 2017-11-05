<html>
<body>


<jsp:include page="headandfoot/header.html"></jsp:include>
<br>
<br>
<%@taglib uri="/struts-tags" prefix="s" %>

<s:form action="signup">
<h1 id="heading">REGISTRATION PORTAL</h1>
<s:textfield label="FULL NAME"></s:textfield>
<s:textfield label="EMAIL" name="username"></s:textfield>
<s:textfield label="PASSWORD" name="password"></s:textfield>

<%--  <s:radio label="GENDER" list="gender" value="getdefaultGenderValue" />


 <s:radio label="STATE" list="state"></s:radio>

<s:radio label="DEGREE" list="degree"></s:radio> --%>
<s:textfield label="DATE OF BIRTH"></s:textfield>
<s:textfield label="ACCOUNT NUMBER" name="accountno"></s:textfield>

<s:submit value="signup" style="background-color:red;color:snow;"></s:submit>
</s:form>





<jsp:include page="headandfoot/footer.html"></jsp:include>
</body>


</html>