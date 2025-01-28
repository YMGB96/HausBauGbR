/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.classes;

import com.mycompany.model.enums.MietobjektTyp;
import com.mycompany.model.template.ModelTemplate;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
/**
 *
 * @author masou
 */
@Entity
@Table(name = "mietobjekt")
public class Mietobjekt extends ModelTemplate{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected long id = -1L; 
    protected int objektNr = 0;
    @Enumerated(EnumType.STRING) 
    protected MietobjektTyp objektTyp = null;
    protected boolean objektPrivat = true;
    protected String objektBeschreibung = null;
    protected Adresse anschrift = new Adresse();
    protected int wohnflaeche = 0;
    protected int m2PreisKalt = 0;
    protected int nebenkostenGes = 0;
    protected String notizfeld = null;
    protected Mietobjekt verbundenesObjekt = null;
    protected Mieter objektMieter = null;
    protected Benutzer ansprechpartner = null;
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "finanzstatus_id", nullable = true)
    protected Finanzstatus finanzstatus;
    protected String dokument = null;
    @ManyToOne(fetch=FetchType.EAGER) // cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}, 
    @JoinColumn(name="mietvertrag_id")
    protected Mietvertrag mietvertrag = null;
    @ManyToOne(fetch=FetchType.EAGER) // cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}, 
    @JoinColumn(name="verantwortlichkeiten_id")
    protected Verantwortlichkeiten verantwortlichkeiten = null;

    public Mietobjekt() { super(); }
    
    public Mietobjekt(int ObjektNr, MietobjektTyp objektTyp, Boolean objektPrivat, String objektBeschreibung, int wohnflaeche, int m2PreisKalt, int nebenkostenGes, String notizfeld, String dokument) {
        super();
        this.objektNr = ObjektNr;
        this.objektTyp = objektTyp;
        this.objektPrivat = objektPrivat;
        this.objektBeschreibung = objektBeschreibung;
        this.wohnflaeche = wohnflaeche;
        this.m2PreisKalt = m2PreisKalt;
        this.nebenkostenGes = nebenkostenGes;
        this.notizfeld = notizfeld;
        this.dokument = dokument;
    }

    @Override
    public long getId() { return this.id; }

    @Override
    public void setId(long id) { this.id = id; }

    public int getObjektNr() {
        return objektNr;
    }

    public void setObjektNr(int ObjektNr) {
        this.objektNr = ObjektNr;
    }

    public MietobjektTyp getObjektTyp() {
        return objektTyp;
    }

    public void setObjektTyp(MietobjektTyp objektTyp) {
        this.objektTyp = objektTyp;
    }

    public Boolean getObjektPrivat() {
        return objektPrivat;
    }

    public void setObjektPrivat(Boolean objektPrivat) {
        this.objektPrivat = objektPrivat;
    }

    public String getObjektBeschreibung() {
        return objektBeschreibung;
    }

    public void setObjektBeschreibung(String objektBeschreibung) {
        this.objektBeschreibung = objektBeschreibung;
    }

    public Adresse getAnschrift() 
    { 
        if (anschrift == null) { anschrift = new Adresse(); }
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
