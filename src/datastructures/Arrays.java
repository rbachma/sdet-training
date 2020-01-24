package datastructures;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] alphabet = {"a", "b", "c", "d", "e", "f"};
		for (int i =0; i < 5; i++){
			System.out.println(alphabet[i]);
		}
		System.out.println("\nUsing the length method");
		int size = alphabet.length;
		for (int n = 0; n < size; n++){
			System.out.print(alphabet[n]);
		}
		
		System.out.println("\nUsing the for each method");
		for (String letter: alphabet){
			System.out.print(letter);
		}
		String[][] users = {{"John", "Williams", "reid@email.com", "654345654"},
							{"Sara", "Jackson", "sj@email.com", "65434565"},
							{"Rachel", "Wallace", "rw@email.com", "58763554"}
				};
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("Number of users is: " + numOfUsers);
		System.out.println("Number of fields is: " + numOfFields);

		for (int i = 0; i < numOfUsers; i++){
				String firstName = users[i][0];
				String lastName = users[i][1];
				String email = users[i][2];
				String phone = users[i][3];
		}
		for (String[] user : users){
			System.out.print("[");
			for (String field : user){
				System.out.println(field + " ");
			}
		}
	
	}

}
