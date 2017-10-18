
package Entities.Stock;

import java.util.List;
import javax.ejb.Local;

@Local
public interface StockSessionBeanLocal {

    public int createStockItem(StockItem si);
    
    public StockItem getStockItem(int id);

    int updateStockItem(StockItem si);

    int deleteStockItem(StockItem si);

    List<StockItem> searchStockItem(String keyword);
    
}
