/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dellnaresh.common.remote.entities;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author nareshm
 */
@Entity
@Table(name = "badimintion_hire")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BadimintionHire.findAll", query = "SELECT b FROM BadmintonHire b"),
    @NamedQuery(name = "BadimintionHire.findById", query = "SELECT b FROM BadmintonHire b WHERE b.id = :id"),
    @NamedQuery(name = "BadimintionHire.findByCourtName", query = "SELECT b FROM BadmintonHire b WHERE b.courtName = :courtName"),
    @NamedQuery(name = "BadimintionHire.findByDateHired", query = "SELECT b FROM BadmintonHire b WHERE b.dateHired = :dateHired"),
    @NamedQuery(name = "BadimintionHire.findByStartTime", query = "SELECT b FROM BadmintonHire b WHERE b.startTime = :startTime"),
    @NamedQuery(name = "BadimintionHire.findByEndTime", query = "SELECT b FROM BadmintonHire b WHERE b.endTime = :endTime"),
    @NamedQuery(name = "BadimintionHire.findByMoneyPaid", query = "SELECT b FROM BadmintonHire b WHERE b.moneyPaid = :moneyPaid")})
public class BadmintonHire implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CourtName")
    private String courtName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHired")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHired;
    @Basic(optional = false)
    @NotNull
    @Column(name = "StartTime")
    @Temporal(TemporalType.TIME)
    private Date startTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EndTime")
    @Temporal(TemporalType.TIME)
    private Date endTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MoneyPaid")
    private long moneyPaid;
    @OneToMany(mappedBy = "hireId")
    private Collection<Badmintonaccount> BadmintonaccountCollection;
    @JoinColumn(name = "Payer", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Player payer;

    public BadmintonHire() {
    }

    public BadmintonHire(Long id) {
        this.id = id;
    }

    public BadmintonHire(Long id, String courtName, Date dateHired, Date startTime, Date endTime, long moneyPaid) {
        this.id = id;
        this.courtName = courtName;
        this.dateHired = dateHired;
        this.startTime = startTime;
        this.endTime = endTime;
        this.moneyPaid = moneyPaid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public long getMoneyPaid() {
        return moneyPaid;
    }

    public void setMoneyPaid(long moneyPaid) {
        this.moneyPaid = moneyPaid;
    }

    @XmlTransient
    public Collection<Badmintonaccount> getBadmintonaccountCollection() {
        return BadmintonaccountCollection;
    }

    public void setBadmintonaccountCollection(Collection<Badmintonaccount> BadmintonaccountCollection) {
        this.BadmintonaccountCollection = BadmintonaccountCollection;
    }

    public Player getPayer() {
        return payer;
    }

    public void setPayer(Player payer) {
        this.payer = payer;
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
        if (!(object instanceof BadmintonHire)) {
            return false;
        }
        BadmintonHire other = (BadmintonHire) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dellnaresh.common.remote.entities.BadimintionHire[ id=" + id + " ]";
    }
    
}
