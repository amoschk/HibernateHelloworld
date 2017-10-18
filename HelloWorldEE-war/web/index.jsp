
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script type="text/javascript" src="js/jquery-1.11.1.min.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function addItems() {
                $.post("addItems.jsp",
                        {}
                , function (result) {
                });
            }
            
            function searchItems(){
                var keyword = $("#searchInput").val();
                $.post("searchItems.jsp",
                        {keyword: keyword}
                , function (result) {
                    $("#resultDiv").html(result);
                });
            }
        </script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <button onclick="addItems()">Add Items</button>
        <br/><br/>
        <input  type="text" id="searchInput"/>
        <button onclick="searchItems()">Search Items</button>
        <br/>
        <div id="resultDiv"></div>
    </body>
</html>
