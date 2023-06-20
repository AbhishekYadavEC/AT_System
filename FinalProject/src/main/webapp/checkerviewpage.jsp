<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.css"/>
    <title>ViewScreen</title>
</head>
<body>
<div class="px-4 py-4">
    <h3 class="mb-5">Customer Authorization Page</h3>
    <table class="display mt-5" id="myTable">
        <thead>
            <tr>
                <th>Customer Code</th>
                <th>Customer Name</th>
                <th>PinCode</th>
                <th>emailAddress</th>
                <th>contactNumber</th>
                <th>recordStatus</th>
                <th>Options</th>
            </tr>
        </thead>
        <tbody>

        <c:forEach items="${details1}" var="customer" varStatus="loop">
            <tr>
                <td><a href="/maker/customer/details1?code=${customer.customerCode}">${customer.customerCode}</a></td>
                <td>${customer.customerName}</td>
                <td>${customer.customerPinCode}</td>
                <td>${customer.customerEmail}</td>
                <td>${customer.customerContactNumber}</td>
                <td>${customer.recordStatus}</td>
                <td class="d-flex gap-2">
                    <button type="button" class="btn btn-success"
                            onclick="location.href='/checker/customer/authorize?code=${customer.customerCode}'">Authorize
                    </button>
                    <button type="button" class="btn btn-danger" onclick="if(confirm('Are you sure you want to reject this record?')){location.href='/checker/customer/reject?code=${customer.customerCode}'}">
                        Reject
                    </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
<script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.js"></script>
<script>
$(document).ready( function () {
$('#myTable').DataTable();
} );

</script>
</body>
</html>
