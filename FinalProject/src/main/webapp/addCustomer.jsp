<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Customer</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h1>Add Customer</h1>
        <a href="/logout" class="btn btn-secondary" style="margin: 10px 200px;">Logout</a>
        <form:form action="" class="was-validated" method="POST" modelAttribute="customer" style="margin: 0px 200px;">
            <div class="form-group">
                <label for="customerCode">Customer Code<span class="text-danger">*</span></label>
                <form:input type="number" path="customerCode" id="customerCode" class="form-control" required="true"/>
                <form:errors path="customerCode" />
            </div>
            <div class="form-group">
                <label for="customerName">Customer Name<span class="text-danger">*</span></label>
                <form:input path="customerName" id="customerName" class="form-control" maxlength="30" required="true" pattern="[A-Za-z0-9]+"/>
            </div>
            <div class="form-group">
                <label for="customerAddr1">Address 1<span class="text-danger">*</span></label>
                <form:input path="customerAddr1" id="customerAddr1" class="form-control" maxlength="100" required="true"></form:input>
            </div>
            <div class="form-group">
                <label for="customerAddr2">Address 2</label>
                <form:input path="customerAddr2" id="customerAddr2" class="form-control" maxlength="100"></form:input>
            </div>
            <div class="form-group">
                <label for="customerPinCode">Pin Code<span class="text-danger">*</span></label>
                <form:input path="customerPinCode" id="customerPinCode" class="form-control" maxlength="6" required="true" pattern="[0-9]{6}"/>
            </div>
            <div class="form-group">
                <label for="customerEmail">Email<span class="text-danger">*</span></label>
                <form:input path="customerEmail" id="customerEmail" class="form-control" maxlength="100" required="true" type="email"/>
            </div>
            <div class="form-group">
                <label for="customerContactNumber">Contact Number</label>
                <form:input path="customerContactNumber" id="customerContactNumber" class="form-control" maxlength="20"/>
            </div>
            <div class="form-group">
                <label for="primaryContactPerson">Primary Contact Person<span class="text-danger">*</span></label>
                <form:input path="primaryContactPerson" id="primaryContactPerson" class="form-control" maxlength="100" required="true"/>

            <div class="form-group">
              <label for="recordStatus">Record Status<span class="required">*</span></label>
              <form:select class="form-control" path="recordStatus" id="recordStatus">
                <form:option value="N" label="New" />
                <form:option value="M" label="Modified" />
                <form:option value="D" label="Deleted" />
                <form:option value="A" label="Authorized" />
                <form:option value="R" label="Rejected" />
              </form:select>
            </div>

            <div class="form-group">
              <label for="activeFlag">Active/Inactive Flag<span class="required">*</span></label>
              <form:select class="form-control" path="activeFlag" id="activeFlag">
              <form:option value="" label="Choose..." />
                <form:option value="A" label="Active" />
                <form:option value="I" label="Inactive" />
              </form:select>
            </div>
            <button type="add" class="btn btn-primary">Add</button>
            <button type="reset" class="btn btn-primary">Clear</button>
        </form:form>
    </div>

      <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  </body>
</html>