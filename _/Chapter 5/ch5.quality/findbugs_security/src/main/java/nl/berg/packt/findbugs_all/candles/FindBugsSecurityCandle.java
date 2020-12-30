package nl.berg.packt.findbugs_all.candles;

public class FindBugsSecurityCandle {
	private final String[] permissions={"Read", "SEARCH"};
	
	private void infiniteLoop(int loops){
		infiniteLoop(99);
	}
	
	public String[] exposure(){
		return permissions;
	}
	
	public static void main(String[] args) {		 
		String[] myPermissions = new FindBugsSecurityCandle().exposure();
		myPermissions[0]="READ/WRITE";
		System.out.println(myPermissions[0]);
	}
}

