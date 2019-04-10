package cn.sl.slvip_mall.po;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "SL_COMM", schema = "SCOTT", catalog = "")
public class SlComm {
    private long id;
    private String tradename;
    private Long price;
    private Long discountprice;
    private Long stock;
    private Long commType;
    private Time commTime;
    private String company;
    private String commguige;
    private String commexplain;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TRADENAME", nullable = true, length = 20)
    public String getTradename() {
        return tradename;
    }

    public void setTradename(String tradename) {
        this.tradename = tradename;
    }

    @Basic
    @Column(name = "PRICE", nullable = true, precision = 2)
    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Basic
    @Column(name = "DISCOUNTPRICE", nullable = true, precision = 2)
    public Long getDiscountprice() {
        return discountprice;
    }

    public void setDiscountprice(Long discountprice) {
        this.discountprice = discountprice;
    }

    @Basic
    @Column(name = "STOCK", nullable = true, precision = 0)
    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    @Basic
    @Column(name = "COMM_TYPE", nullable = true, precision = 0)
    public Long getCommType() {
        return commType;
    }

    public void setCommType(Long commType) {
        this.commType = commType;
    }

    @Basic
    @Column(name = "COMM_TIME", nullable = true)
    public Time getCommTime() {
        return commTime;
    }

    public void setCommTime(Time commTime) {
        this.commTime = commTime;
    }

    @Basic
    @Column(name = "COMPANY", nullable = true, length = 20)
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Basic
    @Column(name = "COMMGUIGE", nullable = true, length = 50)
    public String getCommguige() {
        return commguige;
    }

    public void setCommguige(String commguige) {
        this.commguige = commguige;
    }

    @Basic
    @Column(name = "COMMEXPLAIN", nullable = true, length = 20)
    public String getCommexplain() {
        return commexplain;
    }

    public void setCommexplain(String commexplain) {
        this.commexplain = commexplain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlComm slComm = (SlComm) o;
        return id == slComm.id &&
                Objects.equals(tradename, slComm.tradename) &&
                Objects.equals(price, slComm.price) &&
                Objects.equals(discountprice, slComm.discountprice) &&
                Objects.equals(stock, slComm.stock) &&
                Objects.equals(commType, slComm.commType) &&
                Objects.equals(commTime, slComm.commTime) &&
                Objects.equals(company, slComm.company) &&
                Objects.equals(commguige, slComm.commguige) &&
                Objects.equals(commexplain, slComm.commexplain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tradename, price, discountprice, stock, commType, commTime, company, commguige, commexplain);
    }
}
