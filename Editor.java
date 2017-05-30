/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_commands;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "EDITOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Editor.findAll", query = "SELECT e FROM Editor e")
    , @NamedQuery(name = "Editor.findByEditorId", query = "SELECT e FROM Editor e WHERE e.editorId = :editorId")
    , @NamedQuery(name = "Editor.findByEditorName", query = "SELECT e FROM Editor e WHERE e.editorName = :editorName")
    , @NamedQuery(name = "Editor.findByAdress", query = "SELECT e FROM Editor e WHERE e.adress = :adress")})
public class Editor implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "EDITOR_ID")
    private BigDecimal editorId;
    @Basic(optional = false)
    @Column(name = "EDITOR_NAME")
    private String editorName;
    @Column(name = "ADRESS")
    private String adress;

    public Editor() {
    }

    public Editor(BigDecimal editorId) {
        this.editorId = editorId;
    }

    public Editor(BigDecimal editorId, String editorName) {
        this.editorId = editorId;
        this.editorName = editorName;
    }

    public BigDecimal getEditorId() {
        return editorId;
    }

    public void setEditorId(BigDecimal editorId) {
        this.editorId = editorId;
    }

    public String getEditorName() {
        return editorName;
    }

    public void setEditorName(String editorName) {
        this.editorName = editorName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (editorId != null ? editorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Editor)) {
            return false;
        }
        Editor other = (Editor) object;
        if ((this.editorId == null && other.editorId != null) || (this.editorId != null && !this.editorId.equals(other.editorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin_commands.Editor[ editorId=" + editorId + " ]";
    }
    
}
