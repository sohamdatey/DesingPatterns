package com.designpattern.testing.factory;

import com.designpattern.testing.OnDemandCalcFactory;
import com.designpattern.testing.ReportType;
import com.designpattern.testing.coli.ColiOnDemandCalcFactory;
import com.designpattern.testing.mf.MFOnDemandCalcFactory;

public class OnDemandReportTypeFactory {

	public static OnDemandCalcFactory generateOnDemandReportTypeFactory(ReportType reportType) {

		switch (reportType) {
		case COLI:
			return new ColiOnDemandCalcFactory();
		case MUTUAL_FUND:
			return new MFOnDemandCalcFactory();
		default:
			return null;
		}
		
	}
	

}
