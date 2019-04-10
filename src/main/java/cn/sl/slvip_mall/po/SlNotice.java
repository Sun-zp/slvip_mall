package cn.sl.slvip_mall.po;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "SL_NOTICE", schema = "SCOTT", catalog = "")
public class SlNotice {
    private long id;
    private String title;
    private Time starttime;
    private Time endtime;
    private String content;

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
    @Column(name = "STARTTIME", nullable = true)
    public Time getStarttime() {
        return starttime;
    }

    public void setStarttime(Time starttime) {
        this.starttime = starttime;
    }

    @Basic
    @Column(name = "ENDTIME", nullable = true)
    public Time getEndtime() {
        return endtime;
    }

    public void setEndtime(Time endtime) {
        this.endtime = endtime;
    }

    @Basic
    @Column(name = "CONTENT", nullable = true, length = 255)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlNotice slNotice = (SlNotice) o;
        return id == slNotice.id &&
                Objects.equals(title, slNotice.title) &&
                Objects.equals(starttime, slNotice.starttime) &&
                Objects.equals(endtime, slNotice.endtime) &&
                Objects.equals(content, slNotice.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, starttime, endtime, content);
    }
}
