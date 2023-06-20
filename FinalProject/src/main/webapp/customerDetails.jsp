<%@page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer Details</title>
    <style>
        body {
            background-color: #f2f2f2;
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            grid-gap: 20px;
        }
        h1 {
            font-size: 28px;
        }

        table {
            border: 1px solid #ccc;
            width: 100%;
        }

        table td {
            padding: 10px;
            font-size: 18px;
        }

        button {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            margin-top: 20px;
        }

        button:hover {
            background-color: #3e8e41;
        }
    </style>
</head>
<body>
    <h1>Customer Details</h1>
    <table>

        <tr>
             <td>Customer Code:</td>
             <td>${customer.customerCode}</td>
        </tr>
        <tr>
            <td>Customer Name:</td>
            <td>${customer.customerName}</td>
        </tr>
        <tr>
            <td>Address 1:</td>
            <td>${customer.customerAddr1}</td>
        </tr>
        <tr>
            <td>Address 2:</td>
            <td>${customer.customerAddr2}</td>
        </tr>
        <tr>
            <td>Pin Code:</td>
            <td>${customer.customerPinCode}</td>
        </tr>
        <tr>
            <td>Email Address:</td>
            <td>${customer.customerEmail}</td>
        </tr>
        <tr>
            <td>Contact Number:</td>
            <td>${customer.customerContactNumber}</td>
        </tr>
        <tr>
             <td>Primary Contact Person:</td>
             <td>${customer.primaryContactPerson}</td>
        </tr>
        <tr>
            <td>Record Status:</td>
            <td>${customer.recordStatus}</td>
        </tr>
        <tr>
            <td>Active Flag:</td>
            <td>${customer.activeFlag}</td>
        </tr>
    </table>
</body>
</html>
