package com.solution.p2p.core.common.entity;

import java.io.Serializable;

public class SysRole implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.id
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.role
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    private String role;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.description
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.resource_ids
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    private String resourceIds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.available
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    private Boolean available;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.id
     *
     * @return the value of sys_role.id
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.id
     *
     * @param id the value for sys_role.id
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.role
     *
     * @return the value of sys_role.role
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.role
     *
     * @param role the value for sys_role.role
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.description
     *
     * @return the value of sys_role.description
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.description
     *
     * @param description the value for sys_role.description
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.resource_ids
     *
     * @return the value of sys_role.resource_ids
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    public String getResourceIds() {
        return resourceIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.resource_ids
     *
     * @param resourceIds the value for sys_role.resource_ids
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    public void setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.available
     *
     * @return the value of sys_role.available
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.available
     *
     * @param available the value for sys_role.available
     *
     * @mbggenerated Sun Oct 05 15:15:24 CST 2014
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysRole role = (SysRole) o;

        if (id != null ? !id.equals(role.id) : role.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "SysRole{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", description='" + description + '\'' +
                ", resourceIds=" + resourceIds +
                ", available=" + available +
                '}';
    }
}