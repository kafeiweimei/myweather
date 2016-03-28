package com.example.myweather.model;

public class City 
{
	private int id;
	private String cityName;
	private String cityCode;
	private int provinceId;
	
	public int getId()
	{
		return id;
	}
	public void setId()
	{
		this.id=id;
	}
	
	
	public String getCityName()
	{
		return cityName;
	}
	public void setCityName()
	{
		this.cityName=cityName;
	}
	
	public String getCityCode()
	{
		return cityCode;
	}
	public void setCityCode()
	{
		this.cityCode=cityCode;
	}
	
	public int getProvinceId()
	{
		return provinceId;
	}
	public void setProvinceId()
	{
		this.provinceId=provinceId;
	}

}
