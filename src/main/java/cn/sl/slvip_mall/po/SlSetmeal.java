package cn.sl.slvip_mall.po;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SL_SETMEAL", schema = "SCOTT", catalog = "")
public class SlSetmeal {
    private long id;
    private String mealname;
    private Long prick;
    private Long discountprick;
    private Long surplusdis;
    private Long type;
    private Long distype;
    private Long relevantcomm;
    private String explain;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MEALNAME", nullable = true, length = 20)
    public String getMealname() {
        return mealname;
    }

    public void setMealname(String mealname) {
        this.mealname = mealname;
    }

    @Basic
    @Column(name = "PRICK", nullable = true, precision = 2)
    public Long getPrick() {
        return prick;
    }

    public void setPrick(Long prick) {
        this.prick = prick;
    }

    @Basic
    @Column(name = "DISCOUNTPRICK", nullable = true, precision = 2)
    public Long getDiscountprick() {
        return discountprick;
    }

    public void setDiscountprick(Long discountprick) {
        this.discountprick = discountprick;
    }

    @Basic
    @Column(name = "SURPLUSDIS", nullable = true, precision = 0)
    public Long getSurplusdis() {
        return surplusdis;
    }

    public void setSurplusdis(Long surplusdis) {
        this.surplusdis = surplusdis;
    }

    @Basic
    @Column(name = "TYPE", nullable = true, precision = 0)
    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    @Basic
    @Column(name = "DISTYPE", nullable = true, precision = 0)
    public Long getDistype() {
        return distype;
    }

    public void setDistype(Long distype) {
        this.distype = distype;
    }

    @Basic
    @Column(name = "RELEVANTCOMM", nullable = true, precision = 0)
    public Long getRelevantcomm() {
        return relevantcomm;
    }

    public void setRelevantcomm(Long relevantcomm) {
        this.relevantcomm = relevantcomm;
    }

    @Basic
    @Column(name = "EXPLAIN", nullable = true, length = 50)
    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlSetmeal slSetmeal = (SlSetmeal) o;
        return id == slSetmeal.id &&
                Objects.equals(mealname, slSetmeal.mealname) &&
                Objects.equals(prick, slSetmeal.prick) &&
                Objects.equals(discountprick, slSetmeal.discountprick) &&
                Objects.equals(surplusdis, slSetmeal.surplusdis) &&
                Objects.equals(type, slSetmeal.type) &&
                Objects.equals(distype, slSetmeal.distype) &&
                Objects.equals(relevantcomm, slSetmeal.relevantcomm) &&
                Objects.equals(explain, slSetmeal.explain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mealname, prick, discountprick, surplusdis, type, distype, relevantcomm, explain);
    }
}
