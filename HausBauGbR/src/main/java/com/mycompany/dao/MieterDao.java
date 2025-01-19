/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.model.classes.Mieter;

/**
 *
 * @author Yannick
 */
public class MieterDao<H extends Mieter> extends GenericDao<H>{
    
    public MieterDao(Class clazz) { super(clazz); }
    
}
