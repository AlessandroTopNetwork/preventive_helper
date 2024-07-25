package com.quote.preventive.service;

import java.util.List;

import com.quote.preventive.model.ProductionModel;

public interface ConnectionService {
	
	void scaperStart(List<ProductionModel> production) throws Exception;
	
	boolean fristTryScarper(List<ProductionModel> production) throws Exception;
	
//	boolean static scraperBody(Production production) throws Exception;
	
	void startExecution();
	
	void stopScraper();
	
}
