package com.fjdz.browserhistory.test;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.junit.Ignore;
import org.junit.Test;

import com.chrome.browserhistory.ChromeBrowserHistory;
import com.chrome.browserhistory.ChromeBrowserHistoryData;
import com.chrome.browserhistory.ChromeBrowserHistoryUtils;

public class BrowserHistoryUtilsTest {
	
	
	@Ignore
	@Test
	public void test3(){
		long radate = 13168602961075262L;
		long time = new ChromeBrowserHistoryUtils().getChromeBrowserLastVisitTime(radate);
		System.out.println(new SimpleDateFormat("yyyy年MM月dd日: HH时mm分ss秒").format(new Date(time)));
	}
	
	@Ignore
	@Test
	public void test4(){
		ChromeBrowserHistoryUtils utils = new ChromeBrowserHistoryUtils();
		String sqlite = utils.findChromeCacheLocation();
		List<ChromeBrowserHistory> list = utils.getChromeBrowserHistories(sqlite);
		for(ChromeBrowserHistory chromeBrowserHistory : list){
//			System.out.println(chromeBrowserHistory);
		}
	}
	
	@Ignore
	@Test
	public void test5(){
		ChromeBrowserHistoryUtils utils = new ChromeBrowserHistoryUtils();
		String sqlite = utils.findChromeCacheLocation();
		List<ChromeBrowserHistoryData> list = utils.getChromeChromeBrowserHistoryData(sqlite);
		for(ChromeBrowserHistoryData cbhd : list){
			System.out.println(cbhd);
		}
	}
	
	@Test
	public void test6() throws IOException{
		ChromeBrowserHistoryUtils utils = new ChromeBrowserHistoryUtils();
		utils.exportChromeBHToExcel("xls");
	}
	

}
