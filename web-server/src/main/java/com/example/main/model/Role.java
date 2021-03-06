package com.example.main.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "role")
@Setter
@Getter
public class Role implements Serializable {
    private String roleName;
    private String roleId;

    @Basic
    @Column(name = "role_name")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Id
    @Column(name = "role_id", length = 32, nullable = false, unique = true)
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(roleName, role.roleName) &&
                Objects.equals(roleId, role.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, roleName);
    }
}
