package cn.sl.slvip_mall.po;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SL_REGION", schema = "SCOTT", catalog = "")
public class SlRegion {
    private long id;
    private String name;
    private Long parentid;
    private Long levels;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "PARENTID", nullable = true, precision = 0)
    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    @Basic
    @Column(name = "LEVELS", nullable = true, precision = 0)
    public Long getLevels() {
        return levels;
    }

    public void setLevels(Long levels) {
        this.levels = levels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlRegion slRegion = (SlRegion) o;
        return id == slRegion.id &&
                Objects.equals(name, slRegion.name) &&
                Objects.equals(parentid, slRegion.parentid) &&
                Objects.equals(levels, slRegion.levels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, parentid, levels);
    }
}
