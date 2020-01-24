package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "C:\\Users\\Reid Bachman\\Files\\PhoneNumber.txt";
		File file = new File(filename);
		String[] phoneNums = new String[5];
		String phoneNum = null;
		try{
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i = 0; i < phoneNums.length; i++){
				phoneNums[i] = br.readLine();
			}
				br.close();
		} catch (FileNotFoundException e){
			System.out.println("ERROR: File not found");
		} catch(IOException e){
			System.out.println("ERROR: Could not read file");
		}
		
		for (int n = 0; n < phoneNums.length; n++){
			phoneNum = phoneNums[n];
			try{
				if (phoneNum.length() != 10){
					throw new TenDigitException(phoneNum); 
				}
				if ((phoneNum.substring(0,1).equals("0")) || (phoneNum.substring(0,1).equals("9"))){
					throw new AreaCodeException(phoneNum);
				}
				for (int i = 0; i < phoneNum.length() - 2; i++){
					if (phoneNum.substring(i, (i+1)).equals("9")){
						if (phoneNum.substring(i +1, (i+3)).equals("11")){
							throw new EmergencyException(phoneNum);
						}
					}
				}
				System.out.println(phoneNum);
			} catch(TenDigitException e) {
				System.out.println("ERROR: Phone number is not ten digits");
				System.out.println(e.toString());
			} catch (AreaCodeException e){
				System.out.println("ERROR: Phone number area code cannot be 0 or 9.");
				System.out.println(e.toString());
			} catch (EmergencyException e){
				System.out.println("ERROR: Emergency sequence found.");
				System.out.println(e.toString());
			}
		}
	}
}
class TenDigitException extends Exception{
	String num;
	TenDigitException(String num){
		this.num = num;
	}
	public String toString(){
		return("TenDigitException: " + num);
	}
}
class AreaCodeException extends Exception {
	String num;
	AreaCodeException(String num){
		this.num = num; 
	}
	public String toString(){
		return("AreaCodeException: " + num);
	}
}
class EmergencyException extends Exception {
	String num;
	EmergencyException(String num){
		this.num = num; 
	}
	public String toString(){
		return("EmergencyException: " + num);
	}
}
