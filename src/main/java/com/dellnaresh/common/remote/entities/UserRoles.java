/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dellnaresh.common.remote.entities;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nareshm
 */
@Entity
@Table(name = "user_roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserRoles.findAll", query = "SELECT u FROM UserRoles u"),
    @NamedQuery(name = "UserRoles.findByRoleid", query = "SELECT u FROM UserRoles u WHERE u.roleid = :roleid"),
    @NamedQuery(name = "UserRoles.findByRole", query = "SELECT u FROM UserRoles u WHERE u.role = :role")})
public class UserRoles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "roleid")
    private Long roleid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "role")
    private String role;
    @JoinColumn(name = "userid", referencedColumnName = "login")
    @ManyToOne(optional = false)
    private Users userid;

    public UserRoles() {
    }

    public UserRoles(Long roleid) {
        this.roleid = roleid;
    }

    public UserRoles(Long roleid, String role) {
        this.roleid = roleid;
        this.role = role;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Users getUserid() {
        return userid;
    }

    public void setUserid(Users userid) {
        this.userid = userid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roleid != null ? roleid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserRoles)) {
            return false;
        }
        UserRoles other = (UserRoles) object;
        if ((this.roleid == null && other.roleid != null) || (this.roleid != null && !this.roleid.equals(other.roleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dellnaresh.common.remote.entities.UserRoles[ roleid=" + roleid + " ]";
    }
    
}
