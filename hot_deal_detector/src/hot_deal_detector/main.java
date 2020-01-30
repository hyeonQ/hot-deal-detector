package hot_deal_detector;
import java.util.Scanner;

// 할 일 : url, tag 파일입출력으로 받아오기 -> print 부분도 받아온거 출력하기
public class main {
	private Container<String> urlList = new Container<String>();
	private Container<String> tagList = new Container<String>();
	
	private static void printDefault() {
		beginMessagePrinter p = new beginMessagePrinter();
		p.print();
	}
	
	private static void printStatus() {
		statusPrinter p = new statusPrinter();
		p.print();
	}
	
	private static int getCommand() {
		menuPrinter p = new menuPrinter();
		p.print();
		
		Scanner sc = new Scanner(System.in);
		int cmd = sc.nextInt();
		sc.close();
		
		return cmd;
	}
	
	private static void waitDone() {
		System.out.println("         press ENTER button if you done..");
		try
        {
			Scanner sc = new Scanner(System.in);
            sc.nextLine();
            sc.close();
        }  
        catch(Exception e)
        {}  
	}
	
	private static void commandSwitch(int cmd) {
		if(cmd == 1) {
			printStatus();
		} else if (cmd == 2) {
			getNewUrl();
		} else if (cmd == 3) {
			//getNewTag();
		} else if (cmd == 4) {
			//runDetector();
		} else {
			System.out.println("Wrong Command!!!\n");
		}
	}
	
	private static void getNewUrl() {
		
		
	}

	public static void main(String[] args) {
		printDefault();
		while (true) {
			commandSwitch(getCommand());
			waitDone();
		}

	}
	
	

}
