package cn.sl.slvip_mall.po;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SL_ADDRESS", schema = "SCOTT", catalog = "")
public class SlAddress {
    private long id;
    private Long userid;
    private Long region1;
    private Long region2;
    private Long region3;
    private String receivingadd;
    private String postalcode;
    private String addlabel;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "USERID", nullable = true, precision = 0)
    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "REGION1", nullable = true, precision = 0)
    public Long getRegion1() {
        return region1;
    }

    public void setRegion1(Long region1) {
        this.region1 = region1;
    }

    @Basic
    @Column(name = "REGION2", nullable = true, precision = 0)
    public Long getRegion2() {
        return region2;
    }

    public void setRegion2(Long region2) {
        this.region2 = region2;
    }

    @Basic
    @Column(name = "REGION3", nullable = true, precision = 0)
    public Long getRegion3() {
        return region3;
    }

    public void setRegion3(Long region3) {
        this.region3 = region3;
    }

    @Basic
    @Column(name = "RECEIVINGADD", nullable = true, length = 50)
    public String getReceivingadd() {
        return receivingadd;
    }

    public void setReceivingadd(String receivingadd) {
        this.receivingadd = receivingadd;
    }

    @Basic
    @Column(name = "POSTALCODE", nullable = true, length = 6)
    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    @Basic
    @Column(name = "ADDLABEL", nullable = true, length = 20)
    public String getAddlabel() {
        return addlabel;
    }

    public void setAddlabel(String addlabel) {
        this.addlabel = addlabel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlAddress slAddress = (SlAddress) o;
        return id == slAddress.id &&
                Objects.equals(userid, slAddress.userid) &&
                Objects.equals(region1, slAddress.region1) &&
                Objects.equals(region2, slAddress.region2) &&
                Objects.equals(region3, slAddress.region3) &&
                Objects.equals(receivingadd, slAddress.receivingadd) &&
                Objects.equals(postalcode, slAddress.postalcode) &&
                Objects.equals(addlabel, slAddress.addlabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userid, region1, region2, region3, receivingadd, postalcode, addlabel);
    }
}
