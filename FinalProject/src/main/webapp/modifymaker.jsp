<%@page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<title>Modify Customer</title>
</head>
<body>
	<h1>Modify Customer</h1>
    <form:form action="" method="post" modelAttribute="customer">
        <div>
            <label for="customerCode">Customer Code:</label>
            <form:input id="customerCode" path="customerCode" readonly="true"/>
        </div>
        <div>
            <label for="customerName">Customer Name:</label>
            <form:input id="customerName" path="customerName"/>
            <form:errors path="customerName" />
        </div>
        <div>
            <label for="customerAddr1">Customer Address1:</label>
            <form:input id="customerAddr1" path="customerAddr1"/>
            <form:errors path="customerAddr1" />
        </div>
        <div>
            <label for="customerPinCode">PinCode:</label>
            <form:input id="customerPinCode" path="customerPinCode"/>
            <form:errors path="customerPinCode" />
        </div>
        <div>
            <label for="customerEmail">Email Address:</label>
            <form:input id="customerEmail" path="customerEmail"/>
            <form:errors path="customerEmail" />
        </div>
        <div>
            <label for="customerContactNumber">Contact Number:</label>
            <form:input id="customerContactNumber" path="customerContactNumber"/>
            <form:errors path="customerContactNumber" />
        </div>
        <div>
            <label for="primaryContactPerson">Primary Contact Person:</label>
            <form:input id="primaryContactPerson" path="primaryContactPerson"/>
            <form:errors path="primaryContactPerson" />
        </div>
        <input type="submit" value="Save Changes">
    </form:form>
</body>
</html>

