package cn.sl.slvip_mall.po;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SL_VIPTYPE", schema = "SCOTT", catalog = "")
public class SlViptype {
    private long id;
    private String typename;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TYPENAME", nullable = true, length = 20)
    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlViptype slViptype = (SlViptype) o;
        return id == slViptype.id &&
                Objects.equals(typename, slViptype.typename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typename);
    }
}
