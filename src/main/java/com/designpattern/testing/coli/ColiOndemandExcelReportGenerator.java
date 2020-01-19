package com.designpattern.testing.coli;

import com.designpattern.testing.OutputReport;

import main.OnDemandReportGenerator;

public class ColiOndemandExcelReportGenerator extends OnDemandReportGenerator{


	@Override
	protected byte[] createOutPutReport(OutputReport outputReport) {
		System.out.println("coliiii excel");
		outputReport.setRptData(new byte[]{1,2,3,4});
		return null;
	}

	
}
