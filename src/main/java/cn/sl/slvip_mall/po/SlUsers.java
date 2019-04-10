package cn.sl.slvip_mall.po;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "SL_USERS", schema = "SCOTT", catalog = "")
public class SlUsers {
    private long id;
    private String vipType;
    private String vipName;
    private String userName;
    private Long roleId;
    private String recName;
    private Long state;
    private Long cardType;
    private String cardName;
    private String photo;
    private String email;
    private String openbank;
    private String cardbank;
    private String cardbankname;
    private Time starttime;
    private Time updatetime;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "VIP_TYPE", nullable = true, length = 20)
    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    @Basic
    @Column(name = "VIP_NAME", nullable = true, length = 20)
    public String getVipName() {
        return vipName;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName;
    }

    @Basic
    @Column(name = "USER_NAME", nullable = true, length = 20)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "ROLE_ID", nullable = true, precision = 0)
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "REC_NAME", nullable = true, length = 20)
    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName;
    }

    @Basic
    @Column(name = "STATE", nullable = true, precision = 0)
    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    @Basic
    @Column(name = "CARD_TYPE", nullable = true, precision = 0)
    public Long getCardType() {
        return cardType;
    }

    public void setCardType(Long cardType) {
        this.cardType = cardType;
    }

    @Basic
    @Column(name = "CARD_NAME", nullable = true, length = 20)
    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    @Basic
    @Column(name = "PHOTO", nullable = true, length = 20)
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 20)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "OPENBANK", nullable = true, length = 20)
    public String getOpenbank() {
        return openbank;
    }

    public void setOpenbank(String openbank) {
        this.openbank = openbank;
    }

    @Basic
    @Column(name = "CARDBANK", nullable = true, length = 20)
    public String getCardbank() {
        return cardbank;
    }

    public void setCardbank(String cardbank) {
        this.cardbank = cardbank;
    }

    @Basic
    @Column(name = "CARDBANKNAME", nullable = true, length = 20)
    public String getCardbankname() {
        return cardbankname;
    }

    public void setCardbankname(String cardbankname) {
        this.cardbankname = cardbankname;
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
    @Column(name = "UPDATETIME", nullable = true)
    public Time getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Time updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlUsers slUsers = (SlUsers) o;
        return id == slUsers.id &&
                Objects.equals(vipType, slUsers.vipType) &&
                Objects.equals(vipName, slUsers.vipName) &&
                Objects.equals(userName, slUsers.userName) &&
                Objects.equals(roleId, slUsers.roleId) &&
                Objects.equals(recName, slUsers.recName) &&
                Objects.equals(state, slUsers.state) &&
                Objects.equals(cardType, slUsers.cardType) &&
                Objects.equals(cardName, slUsers.cardName) &&
                Objects.equals(photo, slUsers.photo) &&
                Objects.equals(email, slUsers.email) &&
                Objects.equals(openbank, slUsers.openbank) &&
                Objects.equals(cardbank, slUsers.cardbank) &&
                Objects.equals(cardbankname, slUsers.cardbankname) &&
                Objects.equals(starttime, slUsers.starttime) &&
                Objects.equals(updatetime, slUsers.updatetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vipType, vipName, userName, roleId, recName, state, cardType, cardName, photo, email, openbank, cardbank, cardbankname, starttime, updatetime);
    }
}
