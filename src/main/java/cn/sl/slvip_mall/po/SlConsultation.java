package cn.sl.slvip_mall.po;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SL_CONSULTATION", schema = "SCOTT", catalog = "")
public class SlConsultation {
    private long id;
    private String title;
    private Long contype;
    private String filepath;
    private String content;
    private Long state;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TITLE", nullable = true, length = 20)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "CONTYPE", nullable = true, precision = 0)
    public Long getContype() {
        return contype;
    }

    public void setContype(Long contype) {
        this.contype = contype;
    }

    @Basic
    @Column(name = "FILEPATH", nullable = true, length = 20)
    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    @Basic
    @Column(name = "CONTENT", nullable = true, length = 20)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "STATE", nullable = true, precision = 0)
    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlConsultation that = (SlConsultation) o;
        return id == that.id &&
                Objects.equals(title, that.title) &&
                Objects.equals(contype, that.contype) &&
                Objects.equals(filepath, that.filepath) &&
                Objects.equals(content, that.content) &&
                Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, contype, filepath, content, state);
    }
}
