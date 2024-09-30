package com.project.LGC.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VehicleTracker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String vehicaleType;
	private String drivarName;
	private String vehicaleStartLocation;
	private String vehicaleLocation;
	private String goodsName;
	private String vehicalCapacity;
	private String vehicaleEndLocation;
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVehicaleType() {
		return vehicaleType;
	}

	public void setVehicaleType(String vehicaleType) {
		this.vehicaleType = vehicaleType;
	}

	public String getDrivarName() {
		return drivarName;
	}

	public void setDrivarName(String drivarName) {
		this.drivarName = drivarName;
	}

	public String getVehicaleStartLocation() {
		return vehicaleStartLocation;
	}

	public void setVehicaleStartLocation(String vehicaleStartLocation) {
		this.vehicaleStartLocation = vehicaleStartLocation;
	}

	public String getVehicaleLocation() {
		return vehicaleLocation;
	}

	public void setVehicaleLocation(String vehicaleLocation) {
		this.vehicaleLocation = vehicaleLocation;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getVehicalCapacity() {
		return vehicalCapacity;
	}

	public void setVehicalCapacity(String vehicalCapacity) {
		this.vehicalCapacity = vehicalCapacity;
	}

	public String getVehicaleEndLocation() {
		return vehicaleEndLocation;
	}

	public void setVehicaleEndLocation(String vehicaleEndLocation) {
		this.vehicaleEndLocation = vehicaleEndLocation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public VehicleTracker(int id, String vehicaleType, String drivarName, String vehicaleStartLocation,
			String vehicaleLocation, String goodsName, String vehicalCapacity, String vehicaleEndLocation,
			String status) {
		super();
		this.id = id;
		this.vehicaleType = vehicaleType;
		this.drivarName = drivarName;
		this.vehicaleStartLocation = vehicaleStartLocation;
		this.vehicaleLocation = vehicaleLocation;
		this.goodsName = goodsName;
		this.vehicalCapacity = vehicalCapacity;
		this.vehicaleEndLocation = vehicaleEndLocation;
		this.status = status;
	}

	@Override
	public String toString() {
		return "VehicleTracker [id=" + id + ", vehicaleType=" + vehicaleType + ", drivarName=" + drivarName
				+ ", vehicaleStartLocation=" + vehicaleStartLocation + ", vehicaleLocation=" + vehicaleLocation
				+ ", goodsName=" + goodsName + ", vehicalCapacity=" + vehicalCapacity + ", vehicaleEndLocation="
				+ vehicaleEndLocation + ", status=" + status + "]";
	}

	public VehicleTracker() {
		super();
		// TODO Auto-generated constructor stub
	}

}
