package cn.sl.slvip_mall.po;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SL_DATADIC", schema = "SCOTT", catalog = "")
public class SlDatadic {
    private long id;
    private String type;
    private String name;
    private Long datavalue;
    private String describe;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TYPE", nullable = true, length = 20)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "DATAVALUE", nullable = true, precision = 0)
    public Long getDatavalue() {
        return datavalue;
    }

    public void setDatavalue(Long datavalue) {
        this.datavalue = datavalue;
    }

    @Basic
    @Column(name = "DESCRIBE", nullable = true, length = 50)
    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlDatadic slDatadic = (SlDatadic) o;
        return id == slDatadic.id &&
                Objects.equals(type, slDatadic.type) &&
                Objects.equals(name, slDatadic.name) &&
                Objects.equals(datavalue, slDatadic.datavalue) &&
                Objects.equals(describe, slDatadic.describe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, name, datavalue, describe);
    }
}
