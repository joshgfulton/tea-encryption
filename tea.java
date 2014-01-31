public class tea {

	int delta = 0x9e3779b9; // (2^32 golden ratio, key scheduling constant)
	int sum = 0;

	/*
	* @param
	* @return
	*/
	public void encrypt(int L, int R) {
		for (i=1;i<=32;i++) {
			sum += delta;

		}
	}	

	public void decrypt() {

	}

	public static void main(String args[]) {
		System.out.println("TEA ENCRYPTION: ");
	}

}