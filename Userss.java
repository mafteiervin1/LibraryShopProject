/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_commands;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ervin
 */
@Entity
@Table(name = "USERSS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userss.findAll", query = "SELECT u FROM Userss u")
    , @NamedQuery(name = "Userss.findByUserId", query = "SELECT u FROM Userss u WHERE u.userId = :userId")
    , @NamedQuery(name = "Userss.findByUserFirst", query = "SELECT u FROM Userss u WHERE u.userFirst = :userFirst")
    , @NamedQuery(name = "Userss.findByUserLast", query = "SELECT u FROM Userss u WHERE u.userLast = :userLast")
    , @NamedQuery(name = "Userss.findByEmail", query = "SELECT u FROM Userss u WHERE u.email = :email")
    , @NamedQuery(name = "Userss.findByNrTelefon", query = "SELECT u FROM Userss u WHERE u.nrTelefon = :nrTelefon")
    , @NamedQuery(name = "Userss.findByPermisie", query = "SELECT u FROM Userss u WHERE u.permisie = :permisie")
    , @NamedQuery(name = "Userss.findByCart", query = "SELECT u FROM Userss u WHERE u.cart = :cart")
    , @NamedQuery(name = "Userss.findByPassword", query = "SELECT u FROM Userss u WHERE u.password = :password")})
public class Userss implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "USER_ID")
    private BigDecimal userId;
    @Basic(optional = false)
    @Column(name = "USER_FIRST")
    private String userFirst;
    @Basic(optional = false)
    @Column(name = "USER_LAST")
    private String userLast;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "NR_TELEFON")
    private String nrTelefon;
    @Basic(optional = false)
    @Column(name = "PERMISIE")
    private String permisie;
    @Column(name = "CART")
    private Serializable cart;
    @Basic(optional = false)
    @Column(name = "PASSWORD")
    private String password;
    @ManyToMany(mappedBy = "userssCollection")
    private Collection<Books> booksCollection;

    public Userss() {
    }

    public Userss(BigDecimal userId) {
        this.userId = userId;
    }

    public Userss(BigDecimal userId, String userFirst, String userLast, String email, String permisie, String password) {
        this.userId = userId;
        this.userFirst = userFirst;
        this.userLast = userLast;
        this.email = email;
        this.permisie = permisie;
        this.password = password;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public String getUserFirst() {
        return userFirst;
    }

    public void setUserFirst(String userFirst) {
        this.userFirst = userFirst;
    }

    public String getUserLast() {
        return userLast;
    }

    public void setUserLast(String userLast) {
        this.userLast = userLast;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getPermisie() {
        return permisie;
    }

    public void setPermisie(String permisie) {
        this.permisie = permisie;
    }

    public Serializable getCart() {
        return cart;
    }

    public void setCart(Serializable cart) {
        this.cart = cart;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlTransient
    public Collection<Books> getBooksCollection() {
        return booksCollection;
    }

    public void setBooksCollection(Collection<Books> booksCollection) {
        this.booksCollection = booksCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userss)) {
            return false;
        }
        Userss other = (Userss) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin_commands.Userss[ userId=" + userId + " ]";
    }
    
}
