package com.dkey.exchange.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;


@XmlRootElement
@Entity
@Table(name="v$cars")
public class Car {

    @Id
    @Column(name="DOC_ID")
    private String docId;
    @Column(name="OPER_CODE")
    private String operCode;
    @Column(name="OPER_NAME")
    private String operName;
    @Column(name="n_reg_new")
    private String nRegNew;
    @Column(name="N_INZ_NEW")
    private String nInzNew;
    @Column(name="D_REG")
    private LocalDate dReg;
    @Column(name="NEW_CERT")
    private String newCert;
    @Column(name="BRAND")
    private String brand;
    @Column(name="BODY")
    private String body;
    @Column(name="COLOR")
    private String color;
    @Column(name="FUEL")
    private String fuel;
    @Column(name="PURPOSE")
    private String purpose;
    @Column(name="KIND")
    private String kind;
    @Column(name="INN_CHAR")
    private String innChar;
    @Column(name="NZA")
    private String nza;
    @Column(name="VIN")
    private String vin;
    @Column(name="N_SHASSIS")
    private String nShassis;
    @Column(name="N_ENGINE")
    private String nEngine;
    @Column(name="N_BODY")
    private String nBody;
    @Column(name="CAPACITY")
    private String capacity;
    @Column(name="MAKE_YEAR")
    private String makeYear;
    @Column(name="OWN_WEIGHT")
    private String ownWeight;
    @Column(name="TOTAL_WEIGHT")
    private String totalWeight;
    @Column(name="CLNT_ID")
    private String clntId;
    @Column(name="NAME")
    private String name;
    @Column(name="BIRTHDAY")
    private String birthday;
    @Column(name="CLNT_ADDRESS")
    private String clntAddress;
    @Column(name="DEP")
    private String dep;
    @Column(name="DEP_CODE")
    private String depCode;
    @Column(name="d_reg_first")
    private String dRegFirst;
    @Column(name="name1_l")
    private String name1L;
    @Column(name="name2_l")
    private String name2L;
    @Column(name="name3_l")
    private String name3L;
    @Column(name="address_l")
    private String addressL;
    @Column(name="dep_l")
    private String depL;
    @Column(name="n_seating")
    private String nSeating;
    @Column(name="n_standing")
    private String nStanding;
    @Column(name="note")
    private String note;



    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public String getnRegNew() {
        return nRegNew;
    }

    public void setnRegNew(String nRegNew) {
        this.nRegNew = nRegNew;
    }

    public String getnInzNew() {
        return nInzNew;
    }

    public void setnInzNew(String nInzNew) {
        this.nInzNew = nInzNew;
    }

    public LocalDate getdReg() {
        return dReg;
    }

    public void setdReg(LocalDate dReg) {
        this.dReg = dReg;
    }

    public String getNewCert() {
        return newCert;
    }

    public void setNewCert(String newCert) {
        this.newCert = newCert;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getInnChar() {
        return innChar;
    }

    public void setInnChar(String innChar) {
        this.innChar = innChar;
    }

    public String getNza() {
        return nza;
    }

    public void setNza(String nza) {
        this.nza = nza;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getnShassis() {
        return nShassis;
    }

    public void setnShassis(String nShassis) {
        this.nShassis = nShassis;
    }

    public String getnEngine() {
        return nEngine;
    }

    public void setnEngine(String nEngine) {
        this.nEngine = nEngine;
    }

    public String getnBody() {
        return nBody;
    }

    public void setnBody(String nBody) {
        this.nBody = nBody;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(String makeYear) {
        this.makeYear = makeYear;
    }

    public String getOwnWeight() {
        return ownWeight;
    }

    public void setOwnWeight(String ownWeight) {
        this.ownWeight = ownWeight;
    }

    public String getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getClntId() {
        return clntId;
    }

    public void setClntId(String clntId) {
        this.clntId = clntId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getClntAddress() {
        return clntAddress;
    }

    public void setClntAddress(String clntAddress) {
        this.clntAddress = clntAddress;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public String getdRegFirst() {
        return dRegFirst;
    }

    public void setdRegFirst(String dRegFirst) {
        this.dRegFirst = dRegFirst;
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

    public String getName3L() {
        return name3L;
    }

    public void setName3L(String name3L) {
        this.name3L = name3L;
    }

    public String getAddressL() {
        return addressL;
    }

    public void setAddressL(String addressL) {
        this.addressL = addressL;
    }

    public String getDepL() {
        return depL;
    }

    public void setDepL(String depL) {
        this.depL = depL;
    }

    public String getnSeating() {
        return nSeating;
    }

    public void setnSeating(String nSeating) {
        this.nSeating = nSeating;
    }

    public String getnStanding() {
        return nStanding;
    }

    public void setnStanding(String nStanding) {
        this.nStanding = nStanding;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}