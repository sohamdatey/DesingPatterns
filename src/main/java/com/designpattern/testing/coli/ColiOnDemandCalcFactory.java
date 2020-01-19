package com.designpattern.testing.coli;

import com.designpattern.testing.OnDemandCalcFactory;
import com.designpattern.testing.OutputReportType;

import main.OnDemandReportGenerator;

public  class ColiOnDemandCalcFactory extends OnDemandCalcFactory{

	
	public static  int createColiData(){
		return 22;
	}
	
	public  OnDemandReportGenerator  generateOnDemandOutputReportGenerator(OutputReportType outputReportType){
			
			switch (outputReportType) {
			case EXCEL:
				return new ColiOndemandExcelReportGenerator();
			case PDF:
				return new ColiOnDemandPdfReportGenerator();
			default:
				return null;
			}
		}
	
	
}
