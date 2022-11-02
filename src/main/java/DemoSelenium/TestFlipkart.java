package DemoSelenium;


public class TestFlipkart {

	public static void main(String[] args) throws Exception {
		
		
		BrowserUtil br = new BrowserUtil();
		br.launchBrowser("chrome");
		br.launchUrl("https://www.cricbuzz.com/live-cricket-scorecard/51264/sl-vs-pak-final-asia-cup-2022");
		
		//a[text()=' B Rajapaksa ']/parent::div/following-sibling::div
		
	
}

}