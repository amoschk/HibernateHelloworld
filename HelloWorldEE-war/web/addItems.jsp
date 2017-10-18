<%@page import="Entities.Stock.StockSessionBeanLocal"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="Entities.Stock.StockItem"%>
<%
    try {
        InitialContext ctx = new InitialContext();
        StockSessionBeanLocal stockBean = (StockSessionBeanLocal) ctx.lookup("java:comp/env/stock");

        StockItem si = new StockItem();
        si.setStockcode("A1");
        si.setStockname("Toothbrush XW");
        si.setStockdesc("a white toothbrush");
        si.setStockqty(20);
        si.setObsolete(false);
        stockBean.createStockItem(si);
        
        si = new StockItem();
        si.setStockcode("A2");
        si.setStockname("Toothbrush XB");
        si.setStockdesc("a black toothbrush");
        si.setStockqty(20);
        si.setObsolete(false);
        stockBean.createStockItem(si);
        
        si = new StockItem();
        si.setStockcode("A3");
        si.setStockname("Toothbrush XR");
        si.setStockdesc("a red toothbrush");
        si.setStockqty(20);
        si.setObsolete(false);
        stockBean.createStockItem(si);
        
        si = new StockItem();
        si.setStockcode("A4");
        si.setStockname("Toothbrush XG");
        si.setStockdesc("a green toothbrush");
        si.setStockqty(20);
        si.setObsolete(false);
        stockBean.createStockItem(si);
        
        si = new StockItem();
        si.setStockcode("A5");
        si.setStockname("Toothbrush XP");
        si.setStockdesc("a purple toothbrush");
        si.setStockqty(20);
        si.setObsolete(false);
        stockBean.createStockItem(si);
        
        StockItem si = new StockItem();
        si.setStockcode("A1");
        si.setStockname("Pen XW");
        si.setStockdesc("a white pen");
        si.setStockqty(20);
        si.setObsolete(false);
        stockBean.createStockItem(si);
        
        si = new StockItem();
        si.setStockcode("A2");
        si.setStockname("Pen XB");
        si.setStockdesc("a black pen");
        si.setStockqty(20);
        si.setObsolete(false);
        stockBean.createStockItem(si);
        
        si = new StockItem();
        si.setStockcode("A3");
        si.setStockname("Pen XR");
        si.setStockdesc("a red pen");
        si.setStockqty(20);
        si.setObsolete(false);
        stockBean.createStockItem(si);
        
        si = new StockItem();
        si.setStockcode("A4");
        si.setStockname("Pen XG");
        si.setStockdesc("a green pen");
        si.setStockqty(20);
        si.setObsolete(false);
        stockBean.createStockItem(si);
        
        si = new StockItem();
        si.setStockcode("A5");
        si.setStockname("Pen XP");
        si.setStockdesc("a purple pen");
        si.setStockqty(20);
        si.setObsolete(false);
        stockBean.createStockItem(si);
        
        
        

    } catch (Exception e) {
        e.printStackTrace();
    }

%>