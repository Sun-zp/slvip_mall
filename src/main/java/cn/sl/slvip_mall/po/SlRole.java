package cn.sl.slvip_mall.po;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "SL_ROLE", schema = "SCOTT", catalog = "")
public class SlRole {
    private long id;
    private String rolename;
    private Long founder;
    private Long adminid;
    private Long type;
    private Time creationdate;
    private Time updateddate;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ROLENAME", nullable = true, length = 20)
    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Basic
    @Column(name = "FOUNDER", nullable = true, precision = 0)
    public Long getFounder() {
        return founder;
    }

    public void setFounder(Long founder) {
        this.founder = founder;
    }

    @Basic
    @Column(name = "ADMINID", nullable = true, precision = 0)
    public Long getAdminid() {
        return adminid;
    }

    public void setAdminid(Long adminid) {
        this.adminid = adminid;
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
    @Column(name = "CREATIONDATE", nullable = true)
    public Time getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Time creationdate) {
        this.creationdate = creationdate;
    }

    @Basic
    @Column(name = "UPDATEDDATE", nullable = true)
    public Time getUpdateddate() {
        return updateddate;
    }

    public void setUpdateddate(Time updateddate) {
        this.updateddate = updateddate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlRole slRole = (SlRole) o;
        return id == slRole.id &&
                Objects.equals(rolename, slRole.rolename) &&
                Objects.equals(founder, slRole.founder) &&
                Objects.equals(adminid, slRole.adminid) &&
                Objects.equals(type, slRole.type) &&
                Objects.equals(creationdate, slRole.creationdate) &&
                Objects.equals(updateddate, slRole.updateddate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rolename, founder, adminid, type, creationdate, updateddate);
    }
}
