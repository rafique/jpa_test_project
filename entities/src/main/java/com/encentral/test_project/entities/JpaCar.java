/*


To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "car")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "JpaCar.findAll", query = "SELECT j FROM JpaCar j") })
public class JpaCar implements Serializable {

	@Id
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 64)
	@Column(name = "car_id", nullable = false, length = 64)
	private String carId;

	@Column(nullable = false)
	@Size(min = 1, max = 25)
	@NotNull(message = "Username can not be null!")
	private String username;

	@Column(nullable = false)
	@Size(min = 1, max = 255)
	@NotNull(message = "Password can not be null!")
	private String password;

	@Column(nullable = false, name = "online_status")
	@NotNull(message = "online_status can not be null!")
	@Size(min = 1, max = 10)
	private String onlineStatus;

	@Column(nullable = false, name = "deleted")
	private boolean deleted;

	@Basic(optional = false)
	@NotNull
	@Column(name = "date_created", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;

	@Column(name = "date_modified")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateModified;
	
	@OneToOne(mappedBy = "car")
	private JpaDriver driver;
	
	public JpaDriver getDriver() {
		return driver;
	}
	
	public void setDriver(JpaDriver driver) {
		this.driver = driver;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public String getOnlineStatus() {
		return onlineStatus;
	}

	public void setOnlineStatus(String onlineStatus) {
		this.onlineStatus = onlineStatus;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

}
