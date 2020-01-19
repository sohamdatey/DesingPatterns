package com.designpattern.testing;

import java.util.ArrayList;
import java.util.List;

public class OnDemandReport {

			List<OnDemandReportData> OnDemandReportDatas= new ArrayList<OnDemandReportData>();

			public List<OnDemandReportData> getOnDemandReportDatas() {
				return OnDemandReportDatas;
			}

			public void setOnDemandReportDatas(List<OnDemandReportData> onDemandReportDatas) {
				OnDemandReportDatas = onDemandReportDatas;
			}
			
}
