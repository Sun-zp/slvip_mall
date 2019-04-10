package cn.sl.slvip_mall.po;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SL_BASICINFO", schema = "SCOTT", catalog = "")
public class SlBasicinfo {
    private String parakey;
    private String paraid;
    private String paravalue;
    private String paradescribe;

    @Basic
    @Column(name = "PARAKEY", nullable = false, length = 20)
    public String getParakey() {
        return parakey;
    }

    public void setParakey(String parakey) {
        this.parakey = parakey;
    }

    @Id
    @Column(name = "PARAID", nullable = false, length = 20)
    public String getParaid() {
        return paraid;
    }

    public void setParaid(String paraid) {
        this.paraid = paraid;
    }

    @Basic
    @Column(name = "PARAVALUE", nullable = true, length = 20)
    public String getParavalue() {
        return paravalue;
    }

    public void setParavalue(String paravalue) {
        this.paravalue = paravalue;
    }

    @Basic
    @Column(name = "PARADESCRIBE", nullable = true, length = 50)
    public String getParadescribe() {
        return paradescribe;
    }

    public void setParadescribe(String paradescribe) {
        this.paradescribe = paradescribe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlBasicinfo that = (SlBasicinfo) o;
        return Objects.equals(parakey, that.parakey) &&
                Objects.equals(paraid, that.paraid) &&
                Objects.equals(paravalue, that.paravalue) &&
                Objects.equals(paradescribe, that.paradescribe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parakey, paraid, paravalue, paradescribe);
    }
}
