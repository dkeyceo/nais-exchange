package com.dkey.exchange.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="v$pv")
public class PV {

    @Column(name="CLNT_ID")
    private String clntId;
    @Column(name="NAME1_U")
    private String name1U;
    @Column(name="NAME2_U")
    private String name2U;
    @Column(name="NAME3_U")
    private String name3U;
    @Column(name="NAME1_L")
    private String name1L;
    @Column(name="NAME2_L")
    private String name2L;
    @Column(name="INN")
    private String inn;
    @Column(name="S_DOC")
    private String sDoc;
    @Column(name="N_DOC")
    private String nDoc;
    @Column(name="D_DOC")
    private String dDoc;
    @Column(name="D_END")
    private String dEnd;
    @Column(name="DEP")
    private String dep;
    @Column(name="CAT")
    private String cat;
    @Column(name="ADDRESS")
    private String address;
    @Column(name="STATUS")
    private String status;
    @Column(name="BIRTHDAY")
    private String birthday;
    @Column(name="B_CITY")
    private String bCity;
    @Column(name="B_CITY_L")
    private String bCityL;
    @Column(name="DEP_L")
    private String depL;
    @Column(name = "photo_byte_array")
    private String photoByteArray;
    @Column(name = "sign_byte_array")
    private String signByteArray;
    @Id
    @Column(name="FKEY_PAPER")
    private String fkeyPaper;

    public String getClntId() {
        return clntId;
    }

    public void setClntId(String clntId) {
        this.clntId = clntId;
    }

    public String getName1U() {
        return name1U;
    }

    public void setName1U(String name1U) {
        this.name1U = name1U;
    }

    public String getName2U() {
        return name2U;
    }

    public void setName2U(String name2U) {
        this.name2U = name2U;
    }

    public String getName3U() {
        return name3U;
    }

    public void setName3U(String name3U) {
        this.name3U = name3U;
    }

    public String getName1L() {
        return name1L;
    }

    public void setName1L(String name1L) {
        this.name1L = name1L;
    }

    public String getName2L() {
        return name2L;
    }

    public void setName2L(String name2L) {
        this.name2L = name2L;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getsDoc() {
        return sDoc;
    }

    public void setsDoc(String sDoc) {
        this.sDoc = sDoc;
    }

    public String getnDoc() {
        return nDoc;
    }

    public void setnDoc(String nDoc) {
        this.nDoc = nDoc;
    }

    public String getdDoc() {
        return dDoc;
    }

    public void setdDoc(String dDoc) {
        this.dDoc = dDoc;
    }

    public String getdEnd() {
        return dEnd;
    }

    public void setdEnd(String dEnd) {
        this.dEnd = dEnd;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getbCity() {
        return bCity;
    }

    public void setbCity(String bCity) {
        this.bCity = bCity;
    }

    public String getFkeyPaper() {
        return fkeyPaper;
    }

    public void setFkeyPaper(String fkeyPaper) {
        this.fkeyPaper = fkeyPaper;
    }

    public String getbCityL() {
        return bCityL;
    }

    public void setbCityL(String bCityL) {
        this.bCityL = bCityL;
    }

    public String getDepL() {
        return depL;
    }

    public void setDepL(String depL) {
        this.depL = depL;
    }

    public String getPhotoByteArray() {
        return photoByteArray;
    }

    public void setPhotoByteArray(String photoByteArray) {
        this.photoByteArray = photoByteArray;
    }

    public String getSignByteArray() {
        return signByteArray;
    }

    public void setSignByteArray(String signByteArray) {
        this.signByteArray = signByteArray;
    }
}
