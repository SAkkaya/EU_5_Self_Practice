package week9review;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysOfJobtitlestoArrayList {

	public static void main(String[] args) {
		
		
		String [] jobTitles = new String[5];
		jobTitles[0]  = "QA";
		jobTitles[1]  = "SDET";
		jobTitles[2]  = "BA";
		jobTitles[3]  = "Dev";
		jobTitles[4]  = "QA";
		
		
		ArrayList<String> listJobTitles = new ArrayList<String>(Arrays.asList(jobTitles));
		
		listJobTitles.removeIf(p -> !(p.equals("SDET") || p.equals("QA")));
		
	//	listJobTitles.retainAll(Arrays.asList("SDET", "QA"));
		
		System.out.println(listJobTitles);// [QA, SDET, QA]
		
		
		String[] jobTitles2 = { "SDET", "SDET", "QA", "QA", "QE", "BA", "PO", "SM", "PO", "Data Analyst", "DEV", "QA", "QA"};
		ArrayList<String> jobList = new ArrayList<>( Arrays.asList(jobTitles2));
		jobList.retainAll(  Arrays.asList("PO", "SM") );
		System.out.println(jobList);// [PO, SM, PO]
		
		jobList.removeAll(Arrays.asList("SM"));
		System.out.println(jobList); //[PO, PO]
		

	}

}
