package cn.sl.slvip_mall.po;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "SL_BANKUSERS", schema = "SCOTT", catalog = "")
public class SlBankusers {
    private long id;
    private String cardholder;
    private Time creationtime;
    private Long accbalance;
    private String openbank;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CARDHOLDER", nullable = true, length = 20)
    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    @Basic
    @Column(name = "CREATIONTIME", nullable = true)
    public Time getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Time creationtime) {
        this.creationtime = creationtime;
    }

    @Basic
    @Column(name = "ACCBALANCE", nullable = true, precision = 2)
    public Long getAccbalance() {
        return accbalance;
    }

    public void setAccbalance(Long accbalance) {
        this.accbalance = accbalance;
    }

    @Basic
    @Column(name = "OPENBANK", nullable = true, length = 20)
    public String getOpenbank() {
        return openbank;
    }

    public void setOpenbank(String openbank) {
        this.openbank = openbank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlBankusers that = (SlBankusers) o;
        return id == that.id &&
                Objects.equals(cardholder, that.cardholder) &&
                Objects.equals(creationtime, that.creationtime) &&
                Objects.equals(accbalance, that.accbalance) &&
                Objects.equals(openbank, that.openbank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cardholder, creationtime, accbalance, openbank);
    }
}
