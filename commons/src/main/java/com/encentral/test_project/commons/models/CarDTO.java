package com.encentral.test_project.commons.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarDTO 
{

    private String carId;

    @NotNull(message = "Username can not be null!")
    @Size(min = 5)
    private String username;

    @NotNull(message = "Password can not be null!")
    @Size(min = 5)
    @JsonIgnore
    private String password;

    @NotNull(message = "online_status can not be null!")
    private String onlineStatus;

    private Date dateCreated;
	
    private Date DateModified;

    public String getCarId() 
	{
        return carId;
    }

    public void setCarId(String carId) 
	{
        this.carId = carId;
    }

    public String getUsername() 
	{
        return username;
    }

    public void setUsername(String username) 
	{
        this.username = username;
    }

    public String getPassword() 
	{
        return password;
    }

    @JsonProperty
    public void setPassword(String password) 
	{
        this.password = password;
    }

    public Date getDateCreated() 
	{
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) 
	{
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() 
	{
        return DateModified;
    }

    public void setDateModified(Date DateModified) 
	{
        this.DateModified = DateModified;
    }

    public String getOnlineStatus() 
	{
        return onlineStatus;
    }

    public void setOnlineStatus(String onlineStatus) 
	{
        this.onlineStatus = onlineStatus;
    }

}
