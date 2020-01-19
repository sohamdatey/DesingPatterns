package com.designpattern.testing;

import java.util.ArrayList;
import java.util.List;

public class OnDemandReportData {

	ReportType rptType;
	List<OutputReport> outputReports = new ArrayList<OutputReport>();
	public ReportType getRptType() {
		return rptType;
	}
	public void setRptType(ReportType rptType) {
		this.rptType = rptType;
	}
	public List<OutputReport> getOutputReports() {
		return outputReports;
	}
	public void setOutputReports(List<OutputReport> outputReports) {
		this.outputReports = outputReports;
	}
	
	
}
