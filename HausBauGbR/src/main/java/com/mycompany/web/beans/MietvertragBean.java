package com.mycompany.web.beans;
 

import com.mycompany.dao.GenericDao;
import com.mycompany.dao.MietvertragDao;
import com.mycompany.model.classes.Mieter;
import com.mycompany.model.classes.Mietobjekt;
import com.mycompany.model.classes.Mietvertrag;
import com.mycompany.services.ServiceTemplate;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;


@Named(value = "mietvertrag") 
@ViewScoped  
public class MietvertragBean extends BeanTemplate<Mietvertrag, ServiceTemplate<Mietvertrag, MietvertragDao>>
{ 
  //-------------------------------------------------------------------------
  //  Constructor(s)
  //-------------------------------------------------------------------------     
    public MietvertragBean() { super(new ServiceTemplate<Mietvertrag, MietvertragDao>(new MietvertragDao())); } 

    @PostConstruct
    public void init()
    { 
        resetItem();
    }
 
 
  //-------------------------------------------------------------------------
  //  Mieter
  //-------------------------------------------------------------------------  
    public void addMieter(Mieter m)
    {
        try        
        {
            getItem().addMieter(m);
            getService().getDao().save(getItem());
            new GenericDao<Mieter>(Mieter.class).save(m); 
        } 
        catch (Exception e)
        { 
            handleException("Fehler", e); 
        }
    }
    
    public void removeMieter(Mietvertrag mv)
    {
        if (mv == null || !mv.hasMieter()) { return; }
        try        
        {
            Mieter m = mv.getMieter();
            mv.setMieter(null);
            m.setMietvertrag(null);
            getService().getDao().save(mv);
            new GenericDao<Mieter>(Mieter.class).save(m);
        } 
        catch (Exception e)
        {
            handleException("Fehler", e); 
        }
    }
    
    
  //-------------------------------------------------------------------------
  //  Mietobjekt
  //-------------------------------------------------------------------------  
    public void addMietobjekt(Mietvertrag mv, Mietobjekt mo)
    {
        try        
        {
            mv.addMietobjekt(mo);
            getService().getDao().save(mv);
            new GenericDao<Mietobjekt>(Mietobjekt.class).save(mo); 
        } 
        catch (Exception e)
        { 
            handleException("Fehler", e); 
        } 
    }
    
    public void removeMietobjekt(Mietobjekt mo)
    { 
        if (mo == null || !mo.hasMietvertrag()) { return; }
        try        
        {
            Mietvertrag mv = mo.getMietvertrag(); 
            mv.removeMietobjekt(mo); 
            getService().getDao().save(mv);
            new GenericDao<Mietobjekt>(Mietobjekt.class).save(mo); 
        } 
        catch (Exception e)
        {
            handleException("Fehler", e); 
        }
    }    
 
    
    
}
