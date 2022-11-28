/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.vps.Interface;

import com.portfolio.vps.Entity.Persona;
import java.util.List;

/**
 *
 * @author Vane
 */
public interface IPersonaService {

    public List<Persona> getPersona();

    public void savePersona(Persona persona);

    public void deletePersona(Long id);

    public Persona findPersona(Long id);
    
}
