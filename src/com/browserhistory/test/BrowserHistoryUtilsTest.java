package com.browserhistory.test;

import java.io.IOException;
import org.junit.Test;

import com.chrome.browserhistory.ChromeBrowserHistoryUtils;

public class BrowserHistoryUtilsTest {
	
	@Test
	public void test6() throws IOException{
		ChromeBrowserHistoryUtils utils = new ChromeBrowserHistoryUtils();
		utils.exportChromeBHToExcel("xls");
	}
	

}
