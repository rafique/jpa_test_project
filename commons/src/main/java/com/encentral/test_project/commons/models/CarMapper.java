/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encentral.test_project.commons.models;

import com.encentral.test_project.entities.JpaCar;

/**
 *
 * @author Itoro Ikon
 */
public class CarMapper 
{

    public static CarDTO jpaCarToCarDTO(JpaCar jpaCar) 
	{
        CarDTO dTO = new CarDTO();
        dTO.setDateCreated(jpaCar.getDateCreated());
        dTO.setDateModified(jpaCar.getDateModified());
        dTO.setCarId(jpaCar.getCarId());
        dTO.setUsername(jpaCar.getUsername());
        dTO.setPassword(jpaCar.getPassword());
        dTO.setOnlineStatus(jpaCar.getOnlineStatus());
        return dTO;
    }

    public static JpaCar carDTotoJpaCar(CarDTO dTO) 
	{
        JpaCar jpaCar = new JpaCar();
        jpaCar.setDateCreated(dTO.getDateCreated());
        jpaCar.setDateModified(dTO.getDateModified());
        jpaCar.setCarId(dTO.getCarId());
        jpaCar.setUsername(dTO.getUsername());
        jpaCar.setPassword(dTO.getPassword());
        jpaCar.setOnlineStatus(dTO.getOnlineStatus());
        return jpaCar;
    }
}
