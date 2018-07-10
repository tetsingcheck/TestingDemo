<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Cart</title>
   </head>
   <body>

      <h2>Pay Your Invoice</h2>
      <form:form method = "POST" action = "/confirmPay" >
         <table>
            <tr>
               <td><form:label path = "invoiceid">InvoiceId</form:label></td>
               <td><form:input path = "invoiceid" /></td>
            </tr>
             <tr>
               <td><form:label path = "amount">Amount</form:label></td>
               <td><form:input path = "amount" /></td>
            </tr>
            
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Pay"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
</html>