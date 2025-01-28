/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.web.beans;

/**
 *
 * @author Yannick
 */
import com.mycompany.dao.FinanzstatusDao;
import com.mycompany.model.classes.Finanzstatus;
import com.mycompany.services.ServiceTemplate;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named; 

@Named(value = "finanzstatus")
@ViewScoped
public class FinanzstatusBean extends BeanTemplate<Finanzstatus, ServiceTemplate<Finanzstatus, FinanzstatusDao<Finanzstatus>>>
{
  //-------------------------------------------------------------------------
  //  Constructor(s)
  //-------------------------------------------------------------------------     
    public FinanzstatusBean() { super(new ServiceTemplate<Finanzstatus, FinanzstatusDao<Finanzstatus>>(new FinanzstatusDao<Finanzstatus>(Finanzstatus.class))); } 

    @PostConstruct
    public void init()
    { 
        resetItem(); 
    }
}
