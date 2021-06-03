<%-- 
    Document   : Login
    Created on : Mar 29, 2021, 3:35:04 PM
    Author     : admin
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book's Land Login</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous" >
        <link href="${pageContext.request.contextPath}/resources/css/Login.css" rel="stylesheet" type="text/css" />
    </head>
    <body>  
      <form action="ValidateUser" method="POST">
        <div class="tbody">
          <table class="table">
            <tbody>
                <tr>
                    <td colspan="2" class="pb-3"><h1>Login User</h1></td>
                </tr>
                <tr>
                    <td class="align-middle">username</td>
                    <td class="align-middle"><input type="text" class="form-control" name="username" placeholder="input username"></td>
                </tr>
                <tr>
                    <td class="align-middle">password</td>
                    <td class="align-middle"><input type="password" class="form-control" name="password" placeholder="input password"></td>
                </tr>
                <tr>
                    <td colspan="2" class="align-middle" center><input class="btn btn-outline-info btn-lg btn-block" type="submit" value="submit"></td>
                </tr>
                 <tr>
                     <!-- <td colspan="2" class="align-middle" center><a href="http://localhost:9000/BookLandRegistration/Registration.jsp">Don't have an account? Register Here</a></td> -->
                     <!-- <td colspan="2" class="align-middle" center><a href="http://appsregis:9001/BookLandRegistration/Registration.jsp">Don't have an account? Register Here</a></td> -->
                     <td colspan="2" class="align-middle" center><a href="http://jenkins.fitraalim.com:9001/BookLandRegistration/Registration.jsp">Don't have an account? Register Here</a></td>
                </tr>
                <tr>
                    <td colspan="2" class="align-middle" center><span class="error">${error}</span></td>
                </tr>
            </tbody>
          </table>
        </div>
      </form>
    </body>
</html>

