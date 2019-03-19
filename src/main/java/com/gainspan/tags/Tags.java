package com.gainspan.tags;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;  
@Entity  
public class Tags {  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;  
    private String name;  
    private String server; 
    private String 	geps_version;  
    private String app_version;
    private String wlan_version;
    private Date  released;
    public Tags(){}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public String getGeps_version() {
		return geps_version;
	}
	public void setGeps_version(String geps_version) {
		this.geps_version = geps_version;
	}
	public String getApp_version() {
		return app_version;
	}
	public void setApp_version(String app_version) {
		this.app_version = app_version;
	}
	public String getWlan_version() {
		return wlan_version;
	}
	public void setWlan_version(String wlan_version) {
		this.wlan_version = wlan_version;
	}
	public Date getReleased() {
		return released;
	}
	public void setReleased(Date released) {
		this.released = released;
	}  
}  