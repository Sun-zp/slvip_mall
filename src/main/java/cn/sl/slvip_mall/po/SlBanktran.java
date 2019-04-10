package cn.sl.slvip_mall.po;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "SL_BANKTRAN", schema = "SCOTT", catalog = "")
public class SlBanktran {
    private long id;
    private Time transactiontime;
    private Long transactionmoney;
    private Long balance;
    private Long transactiontype;
    private Long transactionstate;
    private Long drawee;
    private Long payee;
    private String description;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TRANSACTIONTIME", nullable = true)
    public Time getTransactiontime() {
        return transactiontime;
    }

    public void setTransactiontime(Time transactiontime) {
        this.transactiontime = transactiontime;
    }

    @Basic
    @Column(name = "TRANSACTIONMONEY", nullable = true, precision = 2)
    public Long getTransactionmoney() {
        return transactionmoney;
    }

    public void setTransactionmoney(Long transactionmoney) {
        this.transactionmoney = transactionmoney;
    }

    @Basic
    @Column(name = "BALANCE", nullable = true, precision = 2)
    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    @Basic
    @Column(name = "TRANSACTIONTYPE", nullable = true, precision = 0)
    public Long getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(Long transactiontype) {
        this.transactiontype = transactiontype;
    }

    @Basic
    @Column(name = "TRANSACTIONSTATE", nullable = true, precision = 0)
    public Long getTransactionstate() {
        return transactionstate;
    }

    public void setTransactionstate(Long transactionstate) {
        this.transactionstate = transactionstate;
    }

    @Basic
    @Column(name = "DRAWEE", nullable = true, precision = 0)
    public Long getDrawee() {
        return drawee;
    }

    public void setDrawee(Long drawee) {
        this.drawee = drawee;
    }

    @Basic
    @Column(name = "PAYEE", nullable = true, precision = 0)
    public Long getPayee() {
        return payee;
    }

    public void setPayee(Long payee) {
        this.payee = payee;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 50)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlBanktran that = (SlBanktran) o;
        return id == that.id &&
                Objects.equals(transactiontime, that.transactiontime) &&
                Objects.equals(transactionmoney, that.transactionmoney) &&
                Objects.equals(balance, that.balance) &&
                Objects.equals(transactiontype, that.transactiontype) &&
                Objects.equals(transactionstate, that.transactionstate) &&
                Objects.equals(drawee, that.drawee) &&
                Objects.equals(payee, that.payee) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, transactiontime, transactionmoney, balance, transactiontype, transactionstate, drawee, payee, description);
    }
}
