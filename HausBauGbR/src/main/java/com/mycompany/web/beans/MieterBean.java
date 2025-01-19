/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.web.beans;

/**
 *
 * @author Yannick
 */

import com.mycompany.dao.MieterDao;
import com.mycompany.model.classes.Mieter;
import com.mycompany.services.ServiceTemplate;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named; 

@Named(value = "mieter")
@ViewScoped
public class MieterBean extends BeanTemplate<Mieter, ServiceTemplate<Mieter, MieterDao<Mieter>>>
{
  //-------------------------------------------------------------------------
  //  Constructor(s)
  //-------------------------------------------------------------------------     
    public MieterBean() { super(new ServiceTemplate<Mieter, MieterDao<Mieter>>(new MieterDao<Mieter>(Mieter.class))); } 

    @PostConstruct
    public void init()
    { 
        resetItem(); 
    }
}
