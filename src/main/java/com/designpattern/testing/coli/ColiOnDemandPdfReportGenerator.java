package com.designpattern.testing.coli;

import com.designpattern.testing.OutputReport;

import main.OnDemandReportGenerator;

public class ColiOnDemandPdfReportGenerator extends OnDemandReportGenerator{

	@Override
	protected byte[] createOutPutReport(OutputReport outputReport) {
		System.out.println("setting coli pdf Data");
		return null;
	}

}
