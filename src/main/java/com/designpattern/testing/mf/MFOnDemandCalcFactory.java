package com.designpattern.testing.mf;

import com.designpattern.testing.OnDemandCalcFactory;
import com.designpattern.testing.OutputReportType;

import main.OnDemandReportGenerator;

public class MFOnDemandCalcFactory extends OnDemandCalcFactory{
	
	
	public static  int createMFData(){
		return 1000;
	}
	
	@Override
	public OnDemandReportGenerator generateOnDemandOutputReportGenerator(OutputReportType outputReportType) {
		switch (outputReportType) {
		case PDF:
			return new MfOndemandPdfReportGenerator();
		default:
			return null;
		}
	}
}
