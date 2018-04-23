package com.chrome.browserhistory;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		new ChromeBrowserHistoryUtils().exportChromeBHToExcel("xls");
	}
}
