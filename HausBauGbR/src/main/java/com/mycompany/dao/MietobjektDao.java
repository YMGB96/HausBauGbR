/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.model.classes.Mietobjekt;

/**
 *
 * @author Yannick
 */
public class MietobjektDao<H extends Mietobjekt> extends GenericDao<H>{
    
    public MietobjektDao(Class clazz) { super(clazz); }
    
}
