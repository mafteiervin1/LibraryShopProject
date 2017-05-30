/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_commands;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ervin
 */
@Entity
@Table(name = "BOOKS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Books.findAll", query = "SELECT b FROM Books b")
    , @NamedQuery(name = "Books.findByBookId", query = "SELECT b FROM Books b WHERE b.bookId = :bookId")
    , @NamedQuery(name = "Books.findByTitle", query = "SELECT b FROM Books b WHERE b.title = :title")
    , @NamedQuery(name = "Books.findByAuthorName", query = "SELECT b FROM Books b WHERE b.authorName = :authorName")
    , @NamedQuery(name = "Books.findByEditura", query = "SELECT b FROM Books b WHERE b.editura = :editura")
    , @NamedQuery(name = "Books.findByCategoryBook", query = "SELECT b FROM Books b WHERE b.categoryBook = :categoryBook")
    , @NamedQuery(name = "Books.findByRating", query = "SELECT b FROM Books b WHERE b.rating = :rating")
    , @NamedQuery(name = "Books.findByPret", query = "SELECT b FROM Books b WHERE b.pret = :pret")})
public class Books implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "BOOK_ID")
    private BigDecimal bookId;
    @Basic(optional = false)
    @Column(name = "TITLE")
    private String title;
    @Column(name = "AUTHOR_NAME")
    private String authorName;
    @Column(name = "EDITURA")
    private String editura;
    @Column(name = "CATEGORY_BOOK")
    private String categoryBook;
    @Column(name = "RATING")
    private BigInteger rating;
    @Column(name = "PRET")
    private BigInteger pret;
    @JoinTable(name = "VANZARI", joinColumns = {
        @JoinColumn(name = "BOOK_ID", referencedColumnName = "BOOK_ID")}, inverseJoinColumns = {
        @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")})
    @ManyToMany
    private Collection<Userss> userssCollection;
    @OneToMany(mappedBy = "bookId")
    private Collection<Author> authorCollection;

    public Books() {
    }

    public Books(BigDecimal bookId) {
        this.bookId = bookId;
    }

    public Books(BigDecimal bookId, String title) {
        this.bookId = bookId;
        this.title = title;
                 
    }

    public BigDecimal getBookId() {
        return bookId;
    }

    public void setBookId(BigDecimal bookId) {
        BigDecimal oldBookId = this.bookId;
        this.bookId = bookId;
        changeSupport.firePropertyChange("bookId", oldBookId, bookId);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        String oldTitle = this.title;
        this.title = title;
        changeSupport.firePropertyChange("title", oldTitle, title);
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        String oldAuthorName = this.authorName;
        this.authorName = authorName;
        changeSupport.firePropertyChange("authorName", oldAuthorName, authorName);
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        String oldEditura = this.editura;
        this.editura = editura;
        changeSupport.firePropertyChange("editura", oldEditura, editura);
    }

    public String getCategoryBook() {
        return categoryBook;
    }

    public void setCategoryBook(String categoryBook) {
        String oldCategoryBook = this.categoryBook;
        this.categoryBook = categoryBook;
        changeSupport.firePropertyChange("categoryBook", oldCategoryBook, categoryBook);
    }

    public BigInteger getRating() {
        return rating;
    }

    public void setRating(BigInteger rating) {
        BigInteger oldRating = this.rating;
        this.rating = rating;
        changeSupport.firePropertyChange("rating", oldRating, rating);
    }

    public BigInteger getPret() {
        return pret;
    }

    public void setPret(BigInteger pret) {
        BigInteger oldPret = this.pret;
        this.pret = pret;
        changeSupport.firePropertyChange("pret", oldPret, pret);
    }

    @XmlTransient
    public Collection<Userss> getUserssCollection() {
        return userssCollection;
    }

    public void setUserssCollection(Collection<Userss> userssCollection) {
        this.userssCollection = userssCollection;
    }

    @XmlTransient
    public Collection<Author> getAuthorCollection() {
        return authorCollection;
    }

    public void setAuthorCollection(Collection<Author> authorCollection) {
        this.authorCollection = authorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookId != null ? bookId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Books)) {
            return false;
        }
        Books other = (Books) object;
        if ((this.bookId == null && other.bookId != null) || (this.bookId != null && !this.bookId.equals(other.bookId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin_commands.Books[ bookId=" + bookId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
