<%@page import="Entities.Stock.StockItem"%>
<%@page import="java.util.List"%>
<%@page import="Entities.Stock.StockSessionBeanLocal"%>
<%@page import="javax.naming.InitialContext"%>
<%
    try {

        InitialContext ctx = new InitialContext();
        StockSessionBeanLocal stockBean = (StockSessionBeanLocal) ctx.lookup("java:comp/env/stock");

        String keyword = request.getParameter("keyword");
        
        List<StockItem> resList = stockBean.searchStockItem(keyword);
        
        for(StockItem si: resList){
            out.print(si.toString() + "<br/>");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

%>