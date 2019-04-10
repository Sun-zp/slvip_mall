package cn.sl.slvip_mall.po;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SL_DOCTYPE", schema = "SCOTT", catalog = "")
public class SlDoctype {
    private long id;
    private String cardtypename;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CARDTYPENAME", nullable = true, length = 20)
    public String getCardtypename() {
        return cardtypename;
    }

    public void setCardtypename(String cardtypename) {
        this.cardtypename = cardtypename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlDoctype slDoctype = (SlDoctype) o;
        return id == slDoctype.id &&
                Objects.equals(cardtypename, slDoctype.cardtypename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cardtypename);
    }
}
