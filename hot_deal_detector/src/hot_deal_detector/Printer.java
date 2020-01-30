package hot_deal_detector;

public class Printer {
	private String printContents;

	public String getPrintContents() {
		return printContents;
	}

	public void setPrintContents(String printContents) {
		this.printContents = printContents;
	}	
	
	public void print() {
		System.out.println(this.getPrintContents());
		
	}
}

class beginMessagePrinter extends Printer {
	public beginMessagePrinter() {
		this.setPrintContents(
				"＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝\n"
			  + "＝　　　　　　　　　　　　　　　　　　　　＝\n"
			  + "＝　　　　　　　　　　　　　　　　　　　　＝\n"
			  + "＝　　　　　　Shopping Crawler　　　　　＝\n"
			  + "＝　　　　　　　　　　　　　　　　　　　　＝\n"
			  + "＝　　　　　　　　　　　　　　　　　　　　＝\n"
			  + "＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝\n");
	}
}

class menuPrinter extends Printer {
	public menuPrinter() {
		this.setPrintContents(
				  "　　1. View status\n"
				+ "　　2. Insert new URL\n"
				+ "　　3. Insert new tag\n"
				+ "　　4. Run Detector\n"
				+ "＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝\n"
				+ "Enter the COMMAND NUMBER : ");
	}
}

class statusPrinter extends Printer {
	public statusPrinter() {
		String urlList, tagList;
		urlList = 
				  "1. http://cooln.net/bbs/jirum\n"
				+ "2. https://www.fmkorea.com/hotdeal\n";
		tagList = 
				  "1. ZARA\n"
				+ "2. 지오다노\n"
				+ "3. 맨투맨\n";
						
				
		this.setPrintContents(
				"\n＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝\n"
			  + "crawling url : \n"
			  + urlList
			  + "\n＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝\n\n"
			  + "dectected tag : \n"
			  + tagList
			  + "\n＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
	}
}
