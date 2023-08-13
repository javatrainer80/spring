package com.tech2java.springcore;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CustomerBean {

	private List<Object> addressList;
	private Set<Object> addressSet;
	private Map<Object,Object> addressMap;
	
	private Properties addrProperties;
	
	public List<Object> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Object> addressList) {
		this.addressList = addressList;
	}
	public Set<Object> getAddressSet() {
		return addressSet;
	}
	public void setAddressSet(Set<Object> addressSet) {
		this.addressSet = addressSet;
	}
	public Map<Object, Object> getAddressMap() {
		return addressMap;
	}
	public void setAddressMap(Map<Object, Object> addressMap) {
		this.addressMap = addressMap;
	}
	public Properties getAddrProperties() {
		return addrProperties;
	}
	public void setAddrProperties(Properties addrProperties) {
		this.addrProperties = addrProperties;
	}
	

	
}
