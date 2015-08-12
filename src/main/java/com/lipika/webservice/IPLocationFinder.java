package com.lipika.webservice;

/*
 * A simple skeleton program to call SOAP based webservice
 * To generate webservice classes use : wsimport command via command promt
 * with the webservice SOAP URL.
 */

public class IPLocationFinder {
	
	public static void main(String[] args) {
		if(args.length!=1){
			System.out.println("Please pass IP address...");
		}else{
			String ipAddress = args[0];
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap geoIpServiceSoap = ipService.getGeoIPServiceSoap(); // geoIpServiceSoap : stub
			GeoIP geoIp = geoIpServiceSoap.getGeoIP(ipAddress);
			System.out.println("Country name:" + geoIp.getCountryName());
		}
	}

}
