package Entities.Stock;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "STOCKITEM")
@XmlRootElement
public class StockItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SIID")
    private Integer siid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "STOCKCODE")
    private String stockcode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "STOCKNAME")
    private String stockname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "STOCKDESC")
    private String stockdesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STOCKQTY")
    private int stockqty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OBSOLETE")
    private boolean obsolete;

    public StockItem() {
    }

    public StockItem(Integer siid) {
        this.siid = siid;
    }

    public StockItem(Integer siid, String stockcode, String stockdesc, int stockqty, boolean obsolete) {
        this.siid = siid;
        this.stockcode = stockcode;
        this.stockdesc = stockdesc;
        this.stockqty = stockqty;
        this.obsolete = obsolete;
    }

    public Integer getSiid() {
        return siid;
    }

    public void setSiid(Integer siid) {
        this.siid = siid;
    }

    public String getStockcode() {
        return stockcode;
    }

    public void setStockcode(String stockcode) {
        this.stockcode = stockcode;
    }

    public String getStockname() {
        return stockname;
    }

    public void setStockname(String stockname) {
        this.stockname = stockname;
    }

    public String getStockdesc() {
        return stockdesc;
    }

    public void setStockdesc(String stockdesc) {
        this.stockdesc = stockdesc;
    }

    public int getStockqty() {
        return stockqty;
    }

    public void setStockqty(int stockqty) {
        this.stockqty = stockqty;
    }

    public boolean getObsolete() {
        return obsolete;
    }

    public void setObsolete(boolean obsolete) {
        this.obsolete = obsolete;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (siid != null ? siid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StockItem)) {
            return false;
        }
        StockItem other = (StockItem) object;
        if ((this.siid == null && other.siid != null) || (this.siid != null && !this.siid.equals(other.siid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "[ID:" + siid +", Code:" + stockcode + ", Name:" + stockname + ", Desc:" + stockdesc + ", Qty:" + stockqty + " Obsolete:" + obsolete + " ]";
    }
    
}
