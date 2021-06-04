package com.jevsoftwares.apirestencurtadorurl.model;

import javax.persistence.*;

@Entity
@Table(name = "tab_url")
public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    private Integer id;

    @Column(name = "urlOriginal", length = 1000)
    private String urlOriginal;

    @Column(name = "urlCurta", length = 500)
    private String UrlCurta;

    public Url() {
    }

    public Url(String urlOriginal, String urlCurta) {
        this.urlOriginal = urlOriginal;
        this.UrlCurta = urlCurta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrlOriginal() {
        return urlOriginal;
    }

    public void setUrlOriginal(String urlOriginal) {
        this.urlOriginal = urlOriginal;
    }

    public String getUrlCurta() {
        return UrlCurta;
    }

    public void setUrlCurta(String urlCurta) {
        UrlCurta = urlCurta;
    }
}
