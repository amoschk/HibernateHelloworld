package Entities.Stock;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class StockSessionBean implements StockSessionBeanLocal {

    @PersistenceContext(unitName = "HelloWorldEE-ejbPU")
    private EntityManager em;

    @Override
    public int createStockItem(StockItem si) {
        try {
            em.persist(si);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public StockItem getStockItem(int id) {
        try {
            StockItem si = em.find(StockItem.class, id);
            return si;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int updateStockItem(StockItem si) {
        try {
            em.merge(si);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public int deleteStockItem(StockItem si) {
        try {
            em.remove(si);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public List<StockItem> searchStockItem(String keyword) {
        try {
            String HQL = "select si from StockItem si "
                    + "WHERE si.stockcode like :keyword "
                    + "OR si.stockdesc like :keyword "
                    + "OR si.stockname like :keyword ";
            Query q = em.createQuery(HQL);
            q.setParameter("keyword", "%" + keyword + "%");
            
            List resList = q.getResultList();

            return resList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
