/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.interfaces;

/**
 *
 * @author Yannick
 */
public interface IdInterface
{ 
    
    public long getId();
    
    public void setId(long id);
    
    default public boolean hasId() { return (getId() > 0); }; 
}
