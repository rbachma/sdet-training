package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle;
		String choice = "Ring";
		bookTitle = "Lord of the Rings";
		
		if (bookTitle.contains(choice)){
			System.out.println("Book contains Ring");
		}
		
		String browser = "Chrome";
		
		if (browser.equalsIgnoreCase("chrome")){
			System.out.println("Browser is Chrome");
		}
		
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "24323324";
		
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.print(SSN.substring(3));
	}

}
