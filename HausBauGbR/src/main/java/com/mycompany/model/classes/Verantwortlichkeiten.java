/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.classes;

import com.mycompany.model.template.ModelTemplate;
import jakarta.persistence.Entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Yannick
 */
@Entity
public class Verantwortlichkeiten extends ModelTemplate{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected long id = -1L;
    protected Set<Mietobjekt> mietobjektList = null;
    @OneToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name = "benutzer_id")
    protected Benutzer benutzer = null;
    
    public Verantwortlichkeiten(){
        super();
    }
    
    
    
    @Override
    public long getId(){
        return this.id;
    }
    
    @Override
    public void setId(long id) {
            this.id = id;
    }
    
    public Set<Mietobjekt> getMietobjektList(){
        if (mietobjektList == null){
            mietobjektList = new HashSet<>();
    }
        return mietobjektList;
    }

    public void setMietobjektList(Set<Mietobjekt> mietobjektList) {
        this.mietobjektList = mietobjektList;
    }
    
    public Benutzer getBenutzer() {
        return benutzer;
    }

    public void setBenutzer(Benutzer benutzer) {
        this.benutzer = benutzer;
    }
    
    //Mietobjekte bearbeiten
    
    public boolean hasMietobjekt(){
        return (mietobjektList != null && !mietobjektList.isEmpty());
    }
    
    public void addMietobjekt(Mietobjekt m){
        if (m != null && m.hasId()){
            getMietobjektList().add(m);
            m.setVerantwortlichkeiten(this);
        }
    }
    
    public void removeMietobjekt(Mietobjekt m){
        if (hasMietobjekt()){
            getMietobjektList().remove(m);
            m.setVerantwortlichkeiten(null);
        }
    }
    
    //Mieter bearbeiten
    
    public boolean hasBenutzer(){
        return (this.benutzer != null);
    }
    
    public void addBenutzer(Benutzer b){
        if (b != null && b.hasId()){
            this.benutzer = b;
            b.setVerantwortlichkeiten(this);
        }
    }
    
    public void removeBenutzer(){
        this.benutzer.setVerantwortlichkeiten(null);
        this.benutzer = null;
    }
}
