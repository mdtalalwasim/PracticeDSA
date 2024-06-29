package practiceDSAapc;

public class LinearSearchArrayForString {

public static void main(String[] args) {
		

		String names[] = {"Antor", "Rafa", "Kalpo", "Safaa", "Abdur Rahman", "Abdullah", "Taimur", "Omaar"};
		
		String key= "Omaar";
		
		int index = findNameLinearSearch(names,key);
		
		if(index == -1) {
			System.out.println("Not Found!");
		}else {
			System.out.println("key at index : "+index+" Key is :"+key);
		}
		
		
		
	}

	private static int findNameLinearSearch(String[] names, String key) {
			for(int i=0; i<names.length; i++) {
				if(names[i].equals(key)) {

					return i;
				}
			}
			return -1;
	}

}
