/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dellnaresh.common.remote.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * @author nareshm
 */
@Entity
@Table(name = "BadmintonAccount")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BadmintonAccount.findAll", query = "SELECT b FROM BadmintonAccount b"),
    @NamedQuery(name = "BadmintonAccount.findById", query = "SELECT b FROM BadmintonAccount b WHERE b.id = :id"),
    @NamedQuery(name = "BadmintonAccount.findByMoneyRecieved", query = "SELECT b FROM BadmintonAccount b WHERE b.moneyRecieved = :moneyRecieved"),
    @NamedQuery(name = "BadmintonAccount.findByMoneyPaid", query = "SELECT b FROM BadmintonAccount b WHERE b.moneyPaid = :moneyPaid"),
    @NamedQuery(name = "BadmintonAccount.findByPurpose", query = "SELECT b FROM BadmintonAccount b WHERE b.purpose = :purpose"),
    @NamedQuery(name = "BadmintonAccount.findByCreated", query = "SELECT b FROM BadmintonAccount b WHERE b.created = :created"),
    @NamedQuery(name = "BadmintonAccount.findByLastModified", query = "SELECT b FROM BadmintonAccount b WHERE b.lastModified = :lastModified")})
public class BadmintonAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MoneyRecieved")
    private long moneyRecieved;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MoneyPaid")
    private long moneyPaid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Purpose")
    private String purpose;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LastModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModified;
    @JoinColumn(name = "HireId", referencedColumnName = "ID")
    @ManyToOne
    private BadmintonHire hireId;
    @JoinColumn(name = "PlayerId", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Player playerId;

    public BadmintonAccount() {
    }

    public BadmintonAccount(Long id) {
        this.id = id;
    }

    public BadmintonAccount(Long id, long moneyRecieved, long moneyPaid, String purpose, Date created, Date lastModified) {
        this.id = id;
        this.moneyRecieved = moneyRecieved;
        this.moneyPaid = moneyPaid;
        this.purpose = purpose;
        this.created = created;
        this.lastModified = lastModified;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getMoneyRecieved() {
        return moneyRecieved;
    }

    public void setMoneyRecieved(long moneyRecieved) {
        this.moneyRecieved = moneyRecieved;
    }

    public long getMoneyPaid() {
        return moneyPaid;
    }

    public void setMoneyPaid(long moneyPaid) {
        this.moneyPaid = moneyPaid;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public BadmintonHire getHireId() {
        return hireId;
    }

    public void setHireId(BadmintonHire hireId) {
        this.hireId = hireId;
    }

    public Player getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Player playerId) {
        this.playerId = playerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BadmintonAccount)) {
            return false;
        }
        BadmintonAccount other = (BadmintonAccount) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dellnaresh.common.remote.entities.BadmintonAccount[ id=" + id + " ]";
    }
    
}
