<%@taglib uri="/struts-tags" prefix="s" %>
<table border="2px">
<th>ID</th><th>USERNAME</th><th>PASSWORD</th><th colspan="2">ACTION</th>
<s:iterator value="list">
<tr><td><s:property value="id"/></td>
<td><s:property value="username"/></td>
<td><s:property value="password"/></td>
<td><a href="delete.jsp" >DELETE</a></td>
<td><a href="edit.jsp" >EDIT</a></td>
</tr>

</s:iterator>
</table>
