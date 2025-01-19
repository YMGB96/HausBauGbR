/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.services;

import com.mycompany.dao.GenericDao;
import com.mycompany.model.template.ModelTemplate;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Yannick
 */
public class ServiceTemplate<T extends ModelTemplate, D extends GenericDao<T>> implements Serializable
{
  //-------------------------------------------------------------------------
  //  Constructor(s)
  //------------------------------------------------------------------------- 
    public ServiceTemplate(D dao) { super(); this.dao = dao; } 

  
  //-------------------------------------------------------------------------
  //  DAO
  //-------------------------------------------------------------------------     
    protected D dao;

    public D getDao() { return this.dao; }

    
  //-------------------------------------------------------------------------
  //  Item
  //-------------------------------------------------------------------------     
    public T getNewItemInstance() { return getDao().getNewEntityInstance(); }


  //-------------------------------------------------------------------------
  //  List
  //-------------------------------------------------------------------------     
    public List<T> getItemList() throws Exception 
    { 
        return getDao().list(); 
    }

    
    
}
