/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.classes;

import com.mycompany.model.enums.MietobjektTyp;
import com.mycompany.model.template.ModelTemplate;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate; 
/**
 *
 * @author masou
 */
@Entity
public class Mietobjekt extends ModelTemplate{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected long id = -1L; 
    private int ObjektNr;
    @Enumerated(EnumType.STRING) 
    private MietobjektTyp objektTyp;
    private Boolean objektPrivate;
    private String objektBeschreibung;
    private Adresse anschrift;
    private int wohnflaeche;
    private int m2PreisKalt;
    private int nebenkostenGes;
    private String notizfeld;
    private Mietobjekt verbundenesObjekt;
    private Mieter objektMieter;
    private Benutzer ansprechpartner;
    private Finanzstatus finanzstatus;
    private String dokument;
    @ManyToOne(fetch=FetchType.EAGER) // cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}, 
    @JoinColumn(name="mietvertrag_id")
    protected Mietvertrag mietvertrag = null;
    @ManyToOne(fetch=FetchType.EAGER) // cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}, 
    @JoinColumn(name="verantwortlichkeiten_id")
    protected Verantwortlichkeiten verantwortlichkeiten;

    public Mietobjekt() { super(); }
    
    public Mietobjekt(int ObjektNr, MietobjektTyp objektTyp, Boolean objektPrivate, String objektBeschreibung, Adresse anschrift, int wohnflaeche, int m2PreisKalt, int nebenkostenGes, String notizfeld, Mietobjekt verbundenesObjekt, Mieter objektMieter, Benutzer ansprechpartner, Finanzstatus finanzstatus, String dokument) {
        this.ObjektNr = ObjektNr;
        this.objektTyp = objektTyp;
        this.objektPrivate = objektPrivate;
        this.objektBeschreibung = objektBeschreibung;
        this.anschrift = anschrift;
        this.wohnflaeche = wohnflaeche;
        this.m2PreisKalt = m2PreisKalt;
        this.nebenkostenGes = nebenkostenGes;
        this.notizfeld = notizfeld;
        this.verbundenesObjekt = verbundenesObjekt;
        this.objektMieter = objektMieter;
        this.ansprechpartner = ansprechpartner;
        this.finanzstatus = finanzstatus;
        this.dokument = dokument;
    }

    @Override
    public long getId() { return this.id; }

    @Override
    public void setId(long id) { this.id = id; }

    public int getObjektNr() {
        return ObjektNr;
    }

    public void setObjektNr(int ObjektNr) {
        this.ObjektNr = ObjektNr;
    }

    public MietobjektTyp getObjektTyp() {
        return objektTyp;
    }

    public void setObjektTyp(MietobjektTyp objektTyp) {
        this.objektTyp = objektTyp;
    }

    public Boolean getObjektPrivate() {
        return objektPrivate;
    }

    public void setObjektPrivate(Boolean objektPrivate) {
        this.objektPrivate = objektPrivate;
    }

    public String getObjektBeschreibung() {
        return objektBeschreibung;
    }

    public void setObjektBeschreibung(String objektBeschreibung) {
        this.objektBeschreibung = objektBeschreibung;
    }

    public Adresse getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(Adresse anschrift) {
        this.anschrift = anschrift;
    }

    public int getWohnflaeche() {
        return wohnflaeche;
    }

    public void setWohnflaeche(int wohnflaeche) {
        this.wohnflaeche = wohnflaeche;
    }

    public int getM2PreisKalt() {
        return m2PreisKalt;
    }

    public void setM2PreisKalt(int m2PreisKalt) {
        this.m2PreisKalt = m2PreisKalt;
    }

    public int getNebenkostenGes() {
        return nebenkostenGes;
    }

    public void setNebenkostenGes(int nebenkostenGes) {
        this.nebenkostenGes = nebenkostenGes;
    }

    public String getNotizfeld() {
        return notizfeld;
    }

    public void setNotizfeld(String notizfeld) {
        this.notizfeld = notizfeld;
    }

    public Mietobjekt getVerbundenesObjekt() {
        return verbundenesObjekt;
    }

    public void setVerbundenesObjekt(Mietobjekt verbundenesObjekt) {
        this.verbundenesObjekt = verbundenesObjekt;
    }

    public Mieter getObjektMieter() {
        return objektMieter;
    }

    public void setObjektMieter(Mieter objektMieter) {
        this.objektMieter = objektMieter;
    }

    public Benutzer getAnsprechpartner() {
        return ansprechpartner;
    }

    public void setAnsprechpartner(Benutzer ansprechpartner) {
        this.ansprechpartner = ansprechpartner;
    }

    public Finanzstatus getFinanzstatus() {
        return finanzstatus;
    }

    public void setFinanzstatus(Finanzstatus finanzstatus) {
        this.finanzstatus = finanzstatus;
    }

    public String getDokument() {
        return dokument;
    }

    public void setDokument(String dokument) {
        this.dokument = dokument;
    }

    public Mietvertrag getMietvertrag() {
        return mietvertrag;
    }

    public void setMietvertrag(Mietvertrag mietvertrag) {
        this.mietvertrag = mietvertrag;
    }
    
    public boolean hasMietvertrag(){
        return this.mietvertrag !=null;
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
    public int nebenkostenM2(){
        return this.nebenkostenGes/this.wohnflaeche;
    }
    
    public int m2PreisWarm(){
        return this.m2PreisKalt*this.getM2PreisKalt();
    }
    
    public int mieteKalt(){
        return this.m2PreisKalt*this.wohnflaeche;
    }
    
    public int mieteWarm(){
        return (this.m2PreisKalt*this.wohnflaeche)+this.nebenkostenGes;
    }

}
