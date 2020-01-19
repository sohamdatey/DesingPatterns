package com.designpattern.testing;

import main.OnDemandReportGenerator;

public abstract class OnDemandCalcFactory {

	public abstract OnDemandReportGenerator  generateOnDemandOutputReportGenerator(OutputReportType outputReportType);
}
