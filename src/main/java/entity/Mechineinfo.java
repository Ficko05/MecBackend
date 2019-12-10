
package entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ficko
 */
@Entity
@Table(name = "mechineinfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mechineinfo.findAll", query = "SELECT m FROM Mechineinfo m")
    , @NamedQuery(name = "Mechineinfo.findByAutoNum", query = "SELECT m FROM Mechineinfo m WHERE m.autoNum = :autoNum")
    , @NamedQuery(name = "Mechineinfo.findByOrderId", query = "SELECT m FROM Mechineinfo m WHERE m.orderId = :orderId")
    , @NamedQuery(name = "Mechineinfo.findByDate", query = "SELECT m FROM Mechineinfo m WHERE m.date = :date")
    , @NamedQuery(name = "Mechineinfo.findByFixtur", query = "SELECT m FROM Mechineinfo m WHERE m.fixtur = :fixtur")
    , @NamedQuery(name = "Mechineinfo.findByFixtur2", query = "SELECT m FROM Mechineinfo m WHERE m.fixtur2 = :fixtur2")
    , @NamedQuery(name = "Mechineinfo.findByStatus", query = "SELECT m FROM Mechineinfo m WHERE m.status = :status")
    , @NamedQuery(name = "Mechineinfo.findByDriftArt", query = "SELECT m FROM Mechineinfo m WHERE m.driftArt = :driftArt")
    , @NamedQuery(name = "Mechineinfo.findByFejlKodeOhm", query = "SELECT m FROM Mechineinfo m WHERE m.fejlKodeOhm = :fejlKodeOhm")
    , @NamedQuery(name = "Mechineinfo.findByFejlKodeKraftVej", query = "SELECT m FROM Mechineinfo m WHERE m.fejlKodeKraftVej = :fejlKodeKraftVej")
    , @NamedQuery(name = "Mechineinfo.findByOhm1", query = "SELECT m FROM Mechineinfo m WHERE m.ohm1 = :ohm1")
    , @NamedQuery(name = "Mechineinfo.findByOhm2", query = "SELECT m FROM Mechineinfo m WHERE m.ohm2 = :ohm2")
    , @NamedQuery(name = "Mechineinfo.findByOhm3", query = "SELECT m FROM Mechineinfo m WHERE m.ohm3 = :ohm3")
    , @NamedQuery(name = "Mechineinfo.findByOhm4", query = "SELECT m FROM Mechineinfo m WHERE m.ohm4 = :ohm4")
    , @NamedQuery(name = "Mechineinfo.findByOhm5", query = "SELECT m FROM Mechineinfo m WHERE m.ohm5 = :ohm5")
    , @NamedQuery(name = "Mechineinfo.findByOhm6", query = "SELECT m FROM Mechineinfo m WHERE m.ohm6 = :ohm6")
    , @NamedQuery(name = "Mechineinfo.findByPrell1", query = "SELECT m FROM Mechineinfo m WHERE m.prell1 = :prell1")
    , @NamedQuery(name = "Mechineinfo.findByPrell2", query = "SELECT m FROM Mechineinfo m WHERE m.prell2 = :prell2")
    , @NamedQuery(name = "Mechineinfo.findByPrell3", query = "SELECT m FROM Mechineinfo m WHERE m.prell3 = :prell3")
    , @NamedQuery(name = "Mechineinfo.findByPrell4", query = "SELECT m FROM Mechineinfo m WHERE m.prell4 = :prell4")
    , @NamedQuery(name = "Mechineinfo.findByPrell5", query = "SELECT m FROM Mechineinfo m WHERE m.prell5 = :prell5")
    , @NamedQuery(name = "Mechineinfo.findByPrell6", query = "SELECT m FROM Mechineinfo m WHERE m.prell6 = :prell6")
    , @NamedQuery(name = "Mechineinfo.findByOnMaxN", query = "SELECT m FROM Mechineinfo m WHERE m.onMaxN = :onMaxN")
    , @NamedQuery(name = "Mechineinfo.findByOnMinN", query = "SELECT m FROM Mechineinfo m WHERE m.onMinN = :onMinN")
    , @NamedQuery(name = "Mechineinfo.findByOffMaxN", query = "SELECT m FROM Mechineinfo m WHERE m.offMaxN = :offMaxN")
    , @NamedQuery(name = "Mechineinfo.findByOffMinN", query = "SELECT m FROM Mechineinfo m WHERE m.offMinN = :offMinN")
    , @NamedQuery(name = "Mechineinfo.findByMetalDomeSpoleNr", query = "SELECT m FROM Mechineinfo m WHERE m.metalDomeSpoleNr = :metalDomeSpoleNr")
    , @NamedQuery(name = "Mechineinfo.findByNedKlik", query = "SELECT m FROM Mechineinfo m WHERE m.nedKlik = :nedKlik")
    , @NamedQuery(name = "Mechineinfo.findByDiff", query = "SELECT m FROM Mechineinfo m WHERE m.diff = :diff")
    , @NamedQuery(name = "Mechineinfo.findByBundtryk", query = "SELECT m FROM Mechineinfo m WHERE m.bundtryk = :bundtryk")
    , @NamedQuery(name = "Mechineinfo.findByVarme", query = "SELECT m FROM Mechineinfo m WHERE m.varme = :varme")
    , @NamedQuery(name = "Mechineinfo.findByOperator", query = "SELECT m FROM Mechineinfo m WHERE m.operator = :operator")
    , @NamedQuery(name = "Mechineinfo.findByCharge", query = "SELECT m FROM Mechineinfo m WHERE m.charge = :charge")
    , @NamedQuery(name = "Mechineinfo.findByRing", query = "SELECT m FROM Mechineinfo m WHERE m.ring = :ring")
    , @NamedQuery(name = "Mechineinfo.findBySupplier", query = "SELECT m FROM Mechineinfo m WHERE m.supplier = :supplier")
    , @NamedQuery(name = "Mechineinfo.findByHusMasterSpole", query = "SELECT m FROM Mechineinfo m WHERE m.husMasterSpole = :husMasterSpole")
    , @NamedQuery(name = "Mechineinfo.findByProdSpole", query = "SELECT m FROM Mechineinfo m WHERE m.prodSpole = :prodSpole")
    , @NamedQuery(name = "Mechineinfo.findByHusSpoleNo", query = "SELECT m FROM Mechineinfo m WHERE m.husSpoleNo = :husSpoleNo")
    , @NamedQuery(name = "Mechineinfo.findByCharge3", query = "SELECT m FROM Mechineinfo m WHERE m.charge3 = :charge3")
    , @NamedQuery(name = "Mechineinfo.findByProdBoxNo", query = "SELECT m FROM Mechineinfo m WHERE m.prodBoxNo = :prodBoxNo")
    , @NamedQuery(name = "Mechineinfo.findByTestStationName", query = "SELECT m FROM Mechineinfo m WHERE m.testStationName = :testStationName")
    , @NamedQuery(name = "Mechineinfo.findByDutName", query = "SELECT m FROM Mechineinfo m WHERE m.dutName = :dutName")
    , @NamedQuery(name = "Mechineinfo.findByDutType", query = "SELECT m FROM Mechineinfo m WHERE m.dutType = :dutType")
    , @NamedQuery(name = "Mechineinfo.findByDutDescription", query = "SELECT m FROM Mechineinfo m WHERE m.dutDescription = :dutDescription")
    , @NamedQuery(name = "Mechineinfo.findByDutID", query = "SELECT m FROM Mechineinfo m WHERE m.dutID = :dutID")
    , @NamedQuery(name = "Mechineinfo.findByUserID", query = "SELECT m FROM Mechineinfo m WHERE m.userID = :userID")
    , @NamedQuery(name = "Mechineinfo.findByMetalDomeCharge", query = "SELECT m FROM Mechineinfo m WHERE m.metalDomeCharge = :metalDomeCharge")})
public class Mechineinfo implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "AutoNum")
    private Double autoNum;
    @Column(name = "OrderId")
    private Double orderId;
    @Column(name = "date", columnDefinition = "TIMESTAMP")
    private LocalDateTime date;
    @Size(max = 45)
    @Column(name = "Fixtur")
    private String fixtur;
    @Size(max = 45)
    @Column(name = "Fixtur2")
    private String fixtur2;
    @Column(name = "Status")
    private Double status;
    @Column(name = "DriftArt")
    private Double driftArt;
    @Column(name = "FejlKodeOhm")
    private Double fejlKodeOhm;
    @Column(name = "FejlKodeKraftVej")
    private Double fejlKodeKraftVej;
    @Column(name = "Ohm1")
    private Double ohm1;
    @Column(name = "Ohm2")
    private Double ohm2;
    @Column(name = "Ohm3")
    private Double ohm3;
    @Column(name = "Ohm4")
    private Double ohm4;
    @Column(name = "Ohm5")
    private Double ohm5;
    @Column(name = "Ohm6")
    private Double ohm6;
    @Column(name = "Prell1")
    private Double prell1;
    @Column(name = "Prell2")
    private Double prell2;
    @Column(name = "Prell3")
    private Double prell3;
    @Column(name = "Prell4")
    private Double prell4;
    @Column(name = "Prell5")
    private Double prell5;
    @Column(name = "Prell6")
    private Double prell6;
    @Column(name = "OnMaxN")
    private Double onMaxN;
    @Column(name = "OnMinN")
    private Double onMinN;
    @Column(name = "OffMaxN")
    private Double offMaxN;
    @Column(name = "OffMinN")
    private Double offMinN;
    @Column(name = "MetalDomeSpoleNr")
    private Double metalDomeSpoleNr;
    @Column(name = "NedKlik")
    private Double nedKlik;
    @Column(name = "Diff")
    private Double diff;
    @Column(name = "bundtryk")
    private Double bundtryk;
    @Column(name = "varme")
    private Double varme;
    @Column(name = "operator")
    private Double operator;
    @Column(name = "charge")
    private Double charge;
    @Column(name = "ring")
    private Double ring;
    @Size(max = 45)
    @Column(name = "supplier")
    private String supplier;
    @Column(name = "HusMasterSpole")
    private Double husMasterSpole;
    @Column(name = "ProdSpole")
    private Double prodSpole;
    @Column(name = "husSpoleNo")
    private Double husSpoleNo;
    @Column(name = "charge3")
    private Double charge3;
    @Column(name = "ProdBoxNo")
    private Double prodBoxNo;
    @Size(max = 45)
    @Column(name = "TestStationName")
    private String testStationName;
    @Size(max = 45)
    @Column(name = "DutName")
    private String dutName;
    @Column(name = "DutType")
    private Double dutType;
    @Size(max = 45)
    @Column(name = "DutDescription")
    private String dutDescription;
    @Column(name = "DutID")
    private Double dutID;
    @Column(name = "UserID")
    private Double userID;
    @Column(name = "MetalDomeCharge")
    private Double metalDomeCharge;

    public Mechineinfo() {
    }

    public Mechineinfo(Double autoNum) {
        this.autoNum = autoNum;
    }

    public Double getAutoNum() {
        return autoNum;
    }

    public void setAutoNum(Double autoNum) {
        this.autoNum = autoNum;
    }

    public Double getOrderId() {
        return orderId;
    }

    public void setOrderId(Double orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getFixtur() {
        return fixtur;
    }

    public void setFixtur(String fixtur) {
        this.fixtur = fixtur;
    }

    public String getFixtur2() {
        return fixtur2;
    }

    public void setFixtur2(String fixtur2) {
        this.fixtur2 = fixtur2;
    }

    public Double getStatus() {
        return status;
    }

    public void setStatus(Double status) {
        this.status = status;
    }

    public Double getDriftArt() {
        return driftArt;
    }

    public void setDriftArt(Double driftArt) {
        this.driftArt = driftArt;
    }

    public Double getFejlKodeOhm() {
        return fejlKodeOhm;
    }

    public void setFejlKodeOhm(Double fejlKodeOhm) {
        this.fejlKodeOhm = fejlKodeOhm;
    }

    public Double getFejlKodeKraftVej() {
        return fejlKodeKraftVej;
    }

    public void setFejlKodeKraftVej(Double fejlKodeKraftVej) {
        this.fejlKodeKraftVej = fejlKodeKraftVej;
    }

    public Double getOhm1() {
        return ohm1;
    }

    public void setOhm1(Double ohm1) {
        this.ohm1 = ohm1;
    }

    public Double getOhm2() {
        return ohm2;
    }

    public void setOhm2(Double ohm2) {
        this.ohm2 = ohm2;
    }

    public Double getOhm3() {
        return ohm3;
    }

    public void setOhm3(Double ohm3) {
        this.ohm3 = ohm3;
    }

    public Double getOhm4() {
        return ohm4;
    }

    public void setOhm4(Double ohm4) {
        this.ohm4 = ohm4;
    }

    public Double getOhm5() {
        return ohm5;
    }

    public void setOhm5(Double ohm5) {
        this.ohm5 = ohm5;
    }

    public Double getOhm6() {
        return ohm6;
    }

    public void setOhm6(Double ohm6) {
        this.ohm6 = ohm6;
    }

    public Double getPrell1() {
        return prell1;
    }

    public void setPrell1(Double prell1) {
        this.prell1 = prell1;
    }

    public Double getPrell2() {
        return prell2;
    }

    public void setPrell2(Double prell2) {
        this.prell2 = prell2;
    }

    public Double getPrell3() {
        return prell3;
    }

    public void setPrell3(Double prell3) {
        this.prell3 = prell3;
    }

    public Double getPrell4() {
        return prell4;
    }

    public void setPrell4(Double prell4) {
        this.prell4 = prell4;
    }

    public Double getPrell5() {
        return prell5;
    }

    public void setPrell5(Double prell5) {
        this.prell5 = prell5;
    }

    public Double getPrell6() {
        return prell6;
    }

    public void setPrell6(Double prell6) {
        this.prell6 = prell6;
    }

    public Double getOnMaxN() {
        return onMaxN;
    }

    public void setOnMaxN(Double onMaxN) {
        this.onMaxN = onMaxN;
    }

    public Double getOnMinN() {
        return onMinN;
    }

    public void setOnMinN(Double onMinN) {
        this.onMinN = onMinN;
    }

    public Double getOffMaxN() {
        return offMaxN;
    }

    public void setOffMaxN(Double offMaxN) {
        this.offMaxN = offMaxN;
    }

    public Double getOffMinN() {
        return offMinN;
    }

    public void setOffMinN(Double offMinN) {
        this.offMinN = offMinN;
    }

    public Double getMetalDomeSpoleNr() {
        return metalDomeSpoleNr;
    }

    public void setMetalDomeSpoleNr(Double metalDomeSpoleNr) {
        this.metalDomeSpoleNr = metalDomeSpoleNr;
    }

    public Double getNedKlik() {
        return nedKlik;
    }

    public void setNedKlik(Double nedKlik) {
        this.nedKlik = nedKlik;
    }

    public Double getDiff() {
        return diff;
    }

    public void setDiff(Double diff) {
        this.diff = diff;
    }

    public Double getBundtryk() {
        return bundtryk;
    }

    public void setBundtryk(Double bundtryk) {
        this.bundtryk = bundtryk;
    }

    public Double getVarme() {
        return varme;
    }

    public void setVarme(Double varme) {
        this.varme = varme;
    }

    public Double getOperator() {
        return operator;
    }

    public void setOperator(Double operator) {
        this.operator = operator;
    }

    public Double getCharge() {
        return charge;
    }

    public void setCharge(Double charge) {
        this.charge = charge;
    }

    public Double getRing() {
        return ring;
    }

    public void setRing(Double ring) {
        this.ring = ring;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Double getHusMasterSpole() {
        return husMasterSpole;
    }

    public void setHusMasterSpole(Double husMasterSpole) {
        this.husMasterSpole = husMasterSpole;
    }

    public Double getProdSpole() {
        return prodSpole;
    }

    public void setProdSpole(Double prodSpole) {
        this.prodSpole = prodSpole;
    }

    public Double getHusSpoleNo() {
        return husSpoleNo;
    }

    public void setHusSpoleNo(Double husSpoleNo) {
        this.husSpoleNo = husSpoleNo;
    }

    public Double getCharge3() {
        return charge3;
    }

    public void setCharge3(Double charge3) {
        this.charge3 = charge3;
    }

    public Double getProdBoxNo() {
        return prodBoxNo;
    }

    public void setProdBoxNo(Double prodBoxNo) {
        this.prodBoxNo = prodBoxNo;
    }

    public String getTestStationName() {
        return testStationName;
    }

    public void setTestStationName(String testStationName) {
        this.testStationName = testStationName;
    }

    public String getDutName() {
        return dutName;
    }

    public void setDutName(String dutName) {
        this.dutName = dutName;
    }

    public Double getDutType() {
        return dutType;
    }

    public void setDutType(Double dutType) {
        this.dutType = dutType;
    }

    public String getDutDescription() {
        return dutDescription;
    }

    public void setDutDescription(String dutDescription) {
        this.dutDescription = dutDescription;
    }

    public Double getDutID() {
        return dutID;
    }

    public void setDutID(Double dutID) {
        this.dutID = dutID;
    }

    public Double getUserID() {
        return userID;
    }

    public void setUserID(Double userID) {
        this.userID = userID;
    }

    public Double getMetalDomeCharge() {
        return metalDomeCharge;
    }

    public void setMetalDomeCharge(Double metalDomeCharge) {
        this.metalDomeCharge = metalDomeCharge;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (autoNum != null ? autoNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mechineinfo)) {
            return false;
        }
        Mechineinfo other = (Mechineinfo) object;
        if ((this.autoNum == null && other.autoNum != null) || (this.autoNum != null && !this.autoNum.equals(other.autoNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Mechineinfo[ autoNum=" + autoNum + " ]";
    }
    /*public LocalDateTime dateToLocalDateTime(Date date){
        LocalDateTime LDT = new LocalDateTime(date);
        return LDT;
    }
    */
}
