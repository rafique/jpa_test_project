/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encentral.test_project.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "car")
@XmlRootElement
@NamedQueries
({
    @NamedQuery(name = "JpaCar.findAll", query = "SELECT j FROM JpaCar j")
})
public class JpaCar implements Serializable 
{
	
	enum EngineType 
	{ 
		ELECTRIC, GAS
	};

    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "car_id", nullable = false, length = 64)
    private String carId;

    @Column(nullable = false, name = "license_plate")
    @Size(min = 1, max = 25)
    @NotNull(message = "License plate can not be null!")
    private String licensePlate;

    @Column(nullable = false, name = "seat_count")
    @NotNull(message = "Seat count can not be null!")
    private int seatCount;

    @Column(nullable = false, name = "convertible")
    @NotNull(message = "convertible field can not be null!")
    private boolean convertible;

    @Column(nullable = true, name = "rating")
    private int rating;
	
	@Column(nullable = true, name = "engine_type")
    private EngineType engineType;
	
	@Column(nullable = true, name = "manufacturer")
    private String manufacturer;


    public String getCarId() 
	{
        return carId;
    }

    public void setCarId(String carId) 
	{
        this.carId = carId;
    }

    public String getLicensePlate() 
	{
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) 
	{
        this.licensePlate = licensePlate;
    }

    public int getSeatCount() 
	{
        return seatCount;
    }

    public void setSeatCount(String seatCount) 
	{
        this.seatCount = seatCount;
    }

    public Boolean isConvertible() 
	{
        return convertible;
    }
	
	public void setConvertible(String convertible) 
	{
        this.convertible = convertible;
    }
	
	public String getRating() 
	{
        return rating;
    }

    public void setRating(String rating) 
	{
        this.rating = rating;
    }

    public Date getEngineType() 
	{
        return engineType;
    }

    public void setEngineType(EngineType engineType) 
	{
        this.engineType = engineType;
    }

    public Date getManufacturer() 
	{
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) 
	{
        this.manufacturer = manufacturer;
    }
}
