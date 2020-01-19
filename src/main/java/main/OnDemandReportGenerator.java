package main;

import java.util.ArrayList;
import java.util.List;

import com.designpattern.testing.OnDemandCalcFactory;
import com.designpattern.testing.OnDemandReport;
import com.designpattern.testing.OnDemandReportData;
import com.designpattern.testing.OutputReport;
import com.designpattern.testing.OutputReportType;
import com.designpattern.testing.ReportType;
import com.designpattern.testing.factory.OnDemandReportTypeFactory;

public abstract class OnDemandReportGenerator {

	public static void generateOndemandReport(OnDemandReport onDemandReport) {

		for (OnDemandReportData onDemandReportData : onDemandReport.getOnDemandReportDatas()) {
			OnDemandCalcFactory calcFactory = OnDemandReportTypeFactory
					.generateOnDemandReportTypeFactory(onDemandReportData.getRptType());
			for (OutputReport outputReport : onDemandReportData.getOutputReports()) {
				calcFactory.generateOnDemandOutputReportGenerator(outputReport.getOutRptType())
						.createOutPutReport(outputReport);
			}
		}
	}

	protected abstract byte[] createOutPutReport(OutputReport outputReport);

	public static void main(String[] args) {
		OnDemandReport onDemandReport = new OnDemandReport();

		OutputReport pdfoutputReport = new OutputReport();
		pdfoutputReport.setOutRptType(OutputReportType.PDF);

		OutputReport exceloutputReport = new OutputReport();
		exceloutputReport.setOutRptType(OutputReportType.EXCEL);

		OutputReport pdfcolioutputReport = new OutputReport();
		pdfcolioutputReport.setOutRptType(OutputReportType.PDF);

		List<OutputReport> mfoutRps = new ArrayList<OutputReport>();
		mfoutRps.add(pdfoutputReport);
		OnDemandReportData mfonDemandReportData = new OnDemandReportData();
		mfonDemandReportData.setRptType(ReportType.MUTUAL_FUND);
		mfonDemandReportData.setOutputReports(mfoutRps);

		List<OutputReport> colioutRps = new ArrayList<OutputReport>();
		colioutRps.add(exceloutputReport);
		colioutRps.add(pdfcolioutputReport);
		OnDemandReportData colionDemandReportData = new OnDemandReportData();
		colionDemandReportData.setRptType(ReportType.COLI);
		colionDemandReportData.setOutputReports(colioutRps);

		List<OnDemandReportData> datas = new ArrayList<OnDemandReportData>();
		datas.add(colionDemandReportData);
		datas.add(mfonDemandReportData);

		onDemandReport.setOnDemandReportDatas(datas);
		generateOndemandReport(onDemandReport);

		for (OnDemandReportData onDemandReportData : datas) {
			for (OutputReport outputReport : onDemandReportData.getOutputReports()) {
				System.out.println(outputReport.getRptData());
			}
		}

	}

	/*
	 * public static void generateOndemandReport(OnDemandReport onDemandReport)
	 * {
	 * 
	 * for (OnDemandReportData onDemandReportData :
	 * onDemandReport.getOnDemandReportDatas()) { final OnDemandCalcFactory
	 * calcFactory = OnDemandReportTypeFactory
	 * .generateOnDemandReportTypeFactory(onDemandReportData.getRptType());
	 * 
	 * Thread[] threads = new
	 * Thread[onDemandReportData.getOutputReports().size()]; int count = 0;
	 * 
	 * for (final OutputReport outputReport :
	 * onDemandReportData.getOutputReports()) {
	 * 
	 * Runnable runnable = new Runnable() { public void run() {
	 * calcFactory.generateOnDemandOutputReportGenerator(outputReport.
	 * getOutRptType()) .createOutPutReport(outputReport); } }; threads[count] =
	 * new Thread(runnable); threads[count].start(); count++; }
	 * 
	 * for (Thread thread : threads) { try { thread.join(); } catch
	 * (InterruptedException e) { // TODO Auto-generated catch // block
	 * e.printStackTrace(); } } }
	 * 
	 * }
	 */

}
