package com.ufp.domainentry.domain;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Temporal;

import java.time.LocalDateTime;

@Entity
@Table(name="domain_entry", uniqueConstraints={ @UniqueConstraint(columnNames={ "domain", "category" })})
public class DomainEntry {
    private Long id;
    private String domain;
    private String category;

    private LocalDateTime working;

    private int httpStatusCode;
    private LocalDateTime httpLastTime;

    private int httpsStatusCode;
    private LocalDateTime httpsLastTime;

    private String httpRedirect;
    private String httpsRedirect;

    public DomainEntry() {
        this(null, null);
    }

    public DomainEntry(String domain, String category) {
        this.domain = domain;
        this.category = category;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="domain")
    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Column(name="category")
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Column(name="working")
    public LocalDateTime getWorking() {
        return this.working;
    }

    public void setWorking(LocalDateTime working) {
        this.working = working;
    }

    @Column(name="http_status")
    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    @Column(name="http_last_time")
    public LocalDateTime getHttpLastTime() {
        return this.httpLastTime;
    }

    public void setHttpLastTime(LocalDateTime httpLastTime) {
        this.httpLastTime = httpLastTime;
    }

    @Column(name="https_status")
    public int getHttpsStatusCode() {
        return this.httpsStatusCode;
    }

    public void setHttpsStatusCode(int httpsStatusCode) {
        this.httpsStatusCode = httpsStatusCode;
    }

    @Column(name="https_last_time")
    public LocalDateTime getHttpsLastTime() {
        return this.httpsLastTime;
    }

    public void setHttpsLastTime(LocalDateTime httpsLastTime) {
        this.httpsLastTime = httpsLastTime;
    }

    @Column(name="http_redirect")
    public String getHttpRedirect() {
        return this.httpRedirect;
    }

    public void setHttpRedirect(String httpRedirect) {
        this.httpRedirect = httpRedirect;
    }

    @Column(name="https_redirect")
    public String getHttpsRedirect() {
        return this.httpsRedirect;
    }

    public void setHttpsRedirect(String httpsRedirect) {
        this.httpsRedirect = httpsRedirect;
    }
}
