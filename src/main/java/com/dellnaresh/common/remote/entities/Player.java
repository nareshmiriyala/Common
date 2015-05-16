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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "player")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Player.findAll", query = "SELECT p FROM Player p"),
    @NamedQuery(name = "Player.findById", query = "SELECT p FROM Player p WHERE p.id = :id"),
    @NamedQuery(name = "Player.findByFirstName", query = "SELECT p FROM Player p WHERE p.firstName = :firstName"),
    @NamedQuery(name = "Player.findByLastName", query = "SELECT p FROM Player p WHERE p.lastName = :lastName"),
    @NamedQuery(name = "Player.findByMiddleName", query = "SELECT p FROM Player p WHERE p.middleName = :middleName"),
    @NamedQuery(name = "Player.findByEmailID", query = "SELECT p FROM Player p WHERE p.emailID = :emailID"),
    @NamedQuery(name = "Player.findByContactNo", query = "SELECT p FROM Player p WHERE p.contactNo = :contactNo"),
    @NamedQuery(name = "Player.findByAddress", query = "SELECT p FROM Player p WHERE p.address = :address"),
    @NamedQuery(name = "Player.findByJoiningDate", query = "SELECT p FROM Player p WHERE p.joiningDate = :joiningDate"),
    @NamedQuery(name = "Player.findByEndDate", query = "SELECT p FROM Player p WHERE p.endDate = :endDate"),
    @NamedQuery(name = "Player.findByActive", query = "SELECT p FROM Player p WHERE p.active = :active")})
public class Player implements Serializable {
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "player")
    private Users users;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "FirstName")
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "LastName")
    private String lastName;
    @Size(max = 20)
    @Column(name = "MiddleName")
    private String middleName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "EmailID")
    private String emailID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "contactNo")
    private long contactNo;
    @Size(max = 20)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Column(name = "JoiningDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date joiningDate;
    @Column(name = "EndDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Active")
    private short active;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "playerId")
    private Collection<Badmintonaccount> BadmintonaccountCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "payer")
    private Collection<BadmintonHire> badmintonHireCollection;

    public Player() {
    }

    public Player(Integer id) {
        this.id = id;
    }

    public Player(Integer id, String firstName, String lastName, String emailID, long contactNo, Date joiningDate, short active) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailID = emailID;
        this.contactNo = contactNo;
        this.joiningDate = joiningDate;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public short getActive() {
        return active;
    }

    public void setActive(short active) {
        this.active = active;
    }

    @XmlTransient
    public Collection<Badmintonaccount> getBadmintonaccountCollection() {
        return BadmintonaccountCollection;
    }

    public void setBadmintonaccountCollection(Collection<Badmintonaccount> BadmintonaccountCollection) {
        this.BadmintonaccountCollection = BadmintonaccountCollection;
    }

    @XmlTransient
    public Collection<BadmintonHire> getBadmintonHireCollection() {
        return badmintonHireCollection;
    }

    public void setBadmintonHireCollection(Collection<BadmintonHire> badmintonHireCollection) {
        this.badmintonHireCollection = badmintonHireCollection;
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
        if (!(object instanceof Player)) {
            return false;
        }
        Player other = (Player) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dellnaresh.common.remote.entities.Player[ id=" + id + " ]";
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
    
}
