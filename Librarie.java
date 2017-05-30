/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_commands;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ervin
 */
@Entity
@Table(name = "LIBRARIE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Librarie.findAll", query = "SELECT l FROM Librarie l")
    , @NamedQuery(name = "Librarie.findByLibraryId", query = "SELECT l FROM Librarie l WHERE l.libraryId = :libraryId")
    , @NamedQuery(name = "Librarie.findByLibraryName", query = "SELECT l FROM Librarie l WHERE l.libraryName = :libraryName")
    , @NamedQuery(name = "Librarie.findByAdress", query = "SELECT l FROM Librarie l WHERE l.adress = :adress")
    , @NamedQuery(name = "Librarie.findByVanzare", query = "SELECT l FROM Librarie l WHERE l.vanzare = :vanzare")})
public class Librarie implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "LIBRARY_ID")
    private BigDecimal libraryId;
    @Basic(optional = false)
    @Column(name = "LIBRARY_NAME")
    private String libraryName;
    @Column(name = "ADRESS")
    private String adress;
    @Column(name = "VANZARE")
    private BigInteger vanzare;

    public Librarie() {
    }

    public Librarie(BigDecimal libraryId) {
        this.libraryId = libraryId;
    }

    public Librarie(BigDecimal libraryId, String libraryName) {
        this.libraryId = libraryId;
        this.libraryName = libraryName;
    }

    public BigDecimal getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(BigDecimal libraryId) {
        this.libraryId = libraryId;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public BigInteger getVanzare() {
        return vanzare;
    }

    public void setVanzare(BigInteger vanzare) {
        this.vanzare = vanzare;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (libraryId != null ? libraryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Librarie)) {
            return false;
        }
        Librarie other = (Librarie) object;
        if ((this.libraryId == null && other.libraryId != null) || (this.libraryId != null && !this.libraryId.equals(other.libraryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin_commands.Librarie[ libraryId=" + libraryId + " ]";
    }
    
}
