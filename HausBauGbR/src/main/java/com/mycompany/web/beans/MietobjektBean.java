/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.web.beans;

/**
 *
 * @author Yannick
 */
import com.mycompany.dao.MietobjektDao;
import com.mycompany.model.classes.Mietobjekt;
import com.mycompany.services.ServiceTemplate;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named; 
import java.util.Date;

@Named(value = "mietobjekt")
@ViewScoped
public class MietobjektBean extends BeanTemplate<Mietobjekt, ServiceTemplate<Mietobjekt, MietobjektDao<Mietobjekt>>>
{
    
    private Date startMonth;
    private Date endMonth;
  //-------------------------------------------------------------------------
  //  Constructor(s)
  //-------------------------------------------------------------------------     
    public MietobjektBean() { super(new ServiceTemplate<Mietobjekt, MietobjektDao<Mietobjekt>>(new MietobjektDao<Mietobjekt>(Mietobjekt.class))); } 

    @PostConstruct
    public void init()
    { 
        resetItem(); 
    }

    public Date getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(Date startMonth) {
        this.startMonth = startMonth;
    }

    public Date getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(Date endMonth) {
        this.endMonth = endMonth;
    }
    
    
}
