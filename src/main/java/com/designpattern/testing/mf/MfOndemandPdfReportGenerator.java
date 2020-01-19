package com.designpattern.testing.mf;

import com.designpattern.testing.OutputReport;

import main.OnDemandReportGenerator;

public class MfOndemandPdfReportGenerator extends OnDemandReportGenerator {


	@Override
	protected byte[] createOutPutReport(OutputReport outputReport) {
		System.out.println("mfffff pdf ");
		outputReport.setRptData(new byte[]{1,2,3});
		return null;
	}

	
}
