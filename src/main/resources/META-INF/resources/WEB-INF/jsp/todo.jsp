<%@ include file="common/header.jspf" %>		
<%@ include file="common/navigation.jspf" %>		
<div class="container">
		<h1>Enter Todo Details</h1>
		<form:form method="post" modelAttribute="todo"> 
		
			<fieldset class="mb-3">
				<form:label path="description">Description</form:label>
				<form:input type="text" path="description" required="required"/>
				<form:errors path="description" cssClass="text-warning"/>
			</fieldset>			

			<fieldset class="mb-3">
				<form:label path="target">Target Date</form:label>
				<form:input type="text" path="target" required="required"/>
				<form:errors path="target" cssClass="text-warning"/>
			</fieldset>
		
			<form:input type="hidden" path="id"/>
		
			<form:input type="hidden" path="done"/>
		
			<input type="submit" class="btn btn-success">
		</form:form>
</body>
</div>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>

<%@ include file="common/footer.jspf" %>		
<script type="text/javascript">
$('#target').datepicker({
   format: 'yyyy-mm-dd',
});
</script>


