package com.hk.tldclick.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="link")
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="link")
    private String link;

    @Column(name="link_key")
    private String linkKey;

    @Column(name="created_by")
    private Integer createdBy;

    @Column(name="expiration")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiration;

    @Column(name="active")
    private boolean active;

    @Column(name="created")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp created;

    @Column(name="deleted")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp deleted;

    public Link() {
    }

    public Link(String link, String linkKey, Integer createdBy, Timestamp expiration) {
        this.link = link;
        this.linkKey = linkKey;
        this.createdBy = createdBy;
        this.expiration = expiration;
    }

    public Link(String link, String key, Integer createdBy, Timestamp expiration, boolean active, Timestamp created, Timestamp deleted) {
        this.link = link;
        this.linkKey = key;
        this.createdBy = createdBy;
        this.expiration = expiration;
        this.active = active;
        this.created = created;
        this.deleted = deleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLinkKey() {
        return linkKey;
    }

    public void setLinkKey(String linkKey) {
        this.linkKey = linkKey;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Date getDeleted() {
        return deleted;
    }

    public void setDeleted(Timestamp deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Link{" +
                "id=" + id +
                ", link='" + link + '\'' +
                ", linkKey='" + linkKey + '\'' +
                ", createdBy=" + createdBy +
                ", expiration=" + expiration +
                ", active=" + active +
                ", created=" + created +
                ", deleted=" + deleted +
                '}';
    }
}
