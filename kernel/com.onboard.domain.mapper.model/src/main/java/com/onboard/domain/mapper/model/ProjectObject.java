/*******************************************************************************
 * Copyright [2015] [Onboard team of SERC, Peking University]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.onboard.domain.mapper.model;

import com.onboard.domain.mapper.model.common.BaseItem;

import java.util.Date;

public class ProjectObject implements BaseItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.companyId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer companyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.name
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.description
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.archived
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Boolean archived;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.creatorId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer creatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.deleted
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Boolean deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.created
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.updated
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Date updated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.colorId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer colorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.creatorName
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String creatorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.creatorAvatar
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String creatorAvatar;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.id
     *
     * @return the value of project.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.id
     *
     * @param id the value for project.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.companyId
     *
     * @return the value of project.companyId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.companyId
     *
     * @param companyId the value for project.companyId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.name
     *
     * @return the value of project.name
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.name
     *
     * @param name the value for project.name
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.description
     *
     * @return the value of project.description
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.description
     *
     * @param description the value for project.description
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.archived
     *
     * @return the value of project.archived
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Boolean getArchived() {
        return archived;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.archived
     *
     * @param archived the value for project.archived
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.creatorId
     *
     * @return the value of project.creatorId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.creatorId
     *
     * @param creatorId the value for project.creatorId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.deleted
     *
     * @return the value of project.deleted
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.deleted
     *
     * @param deleted the value for project.deleted
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.created
     *
     * @return the value of project.created
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.created
     *
     * @param created the value for project.created
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.updated
     *
     * @return the value of project.updated
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.updated
     *
     * @param updated the value for project.updated
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.colorId
     *
     * @return the value of project.colorId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getColorId() {
        return colorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.colorId
     *
     * @param colorId the value for project.colorId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.creatorName
     *
     * @return the value of project.creatorName
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.creatorName
     *
     * @param creatorName the value for project.creatorName
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.creatorAvatar
     *
     * @return the value of project.creatorAvatar
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getCreatorAvatar() {
        return creatorAvatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.creatorAvatar
     *
     * @param creatorAvatar the value for project.creatorAvatar
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setCreatorAvatar(String creatorAvatar) {
        this.creatorAvatar = creatorAvatar == null ? null : creatorAvatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public ProjectObject(ProjectObject parent) {
        this.id = parent.getId();
        this.companyId = parent.getCompanyId();
        this.name = parent.getName();
        this.description = parent.getDescription();
        this.archived = parent.getArchived();
        this.creatorId = parent.getCreatorId();
        this.deleted = parent.getDeleted();
        this.created = parent.getCreated();
        this.updated = parent.getUpdated();
        this.colorId = parent.getColorId();
        this.creatorName = parent.getCreatorName();
        this.creatorAvatar = parent.getCreatorAvatar();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public ProjectObject() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public ProjectObject(int id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public ProjectObject(boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public ProjectObject(int id, boolean deleted) {
        this.id = id;
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    @Override
    public ProjectObject copy() {
        return new ProjectObject(this);
    }
}