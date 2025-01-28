/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.classes;

import com.mycompany.model.template.ModelTemplate;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
/**
 *
 * @author masou
 */
@Entity
@Table(name = "benutzer")
public class Benutzer extends ModelTemplate {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected long id = -1L;
    private Boolean istAdmin;
    private String vorname;
    private String nachname;
    @Embedded
    private Adresse anschrift = null;
    private String telefonFestnetz;
    private String telefonMobil;
    private String email;
    private String benutzerName;
    private String passwort;
    @ManyToOne(fetch=FetchType.EAGER) // cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}, 
    @JoinColumn(name="verantwortlichkeiten_id")
    protected Verantwortlichkeiten verantwortlichkeiten;

    public Benutzer()  { super(); }
    
    public Benutzer(Boolean istAdmin, String vorname, String nachname, Adresse anschrift, String telefonFestnetz, String telefonMobil, String email, String benutzerName, String passwort) {
        this.istAdmin = istAdmin;
        this.vorname = vorname;
        this.nachname = nachname;
        this.anschrift = anschrift;
        this.telefonFestnetz = telefonFestnetz;
        this.telefonMobil = telefonMobil;
        this.email = email;
        this.benutzerName = benutzerName;
        this.passwort = passwort;
    }

    @Override
    public long getId() { return this.id; }

    @Override
    public void setId(long id) { this.id = id; }
    
    public Boolean getIstAdmin() {
        return istAdmin;
    }

    public void setIstAdmin(Boolean istAdmin) {
        this.istAdmin = istAdmin;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Adresse getAnschrift() {
        if (anschrift == null) { anschrift = new Adresse(); }
        return anschrift;
    }

    public void setAnschrift(Adresse anschrift) {
        this.anschrift = anschrift;
    }

    public String getTelefonFestnetz() {
        return telefonFestnetz;
    }

    public void setTelefonFestnetz(String telefonFestnetz) {
        this.telefonFestnetz = telefonFestnetz;
    }

    public String getTelefonMobil() {
        return telefonMobil;
    }

    public void setTelefonMobil(String telefonMobil) {
        this.telefonMobil = telefonMobil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBenutzerName() {
        return benutzerName;
    }

    public void setBenutzerName(String benutzerName) {
        this.benutzerName = benutzerName;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }
    
    public Verantwortlichkeiten getVerantwortlichkeiten(){
        return verantwortlichkeiten;
    }
    
    public void setVerantwortlichkeiten(Verantwortlichkeiten verantwortlichkeiten){
        this.verantwortlichkeiten = verantwortlichkeiten;
    }
    
    public boolean hasVerantwortlichkeiten(){
        return this.verantwortlichkeiten !=null;
    }
}
