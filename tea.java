public class tea {

	int delta = 0x9e3779b9; // (2^32 golden ratio, key scheduling constant)
	int sum = 0;
	int k[] = new int[4];
	int p[] = new int[2];
    int L, R;
	/*
	* @param
	* @return
	*    L += ((R<<4)+K[0]) XOR (R+sum) XOR ((R>>5)+K[1]) 
	*	 R += ((L<<4)+K[2]) XOR (L+sum) XOR ((L>>5)+K[3]) 
	*
	*/
	public void encrypt(int L, int R) {
		
		for (i=1;i<=32;i++) {
			sum += delta;
			L += (); 
			R += ();
		}
	}	

	public void decrypt() {

	}

	public void getKey() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0, idx = 0;
		try {
			String str = br.readLine();
			while (count <= 3) {
				k[count++] = Integer.parseInt(str.substring(idx, idx + 2));
				idx += 2;
			}	
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
		}
	}

	public void getPlainText() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0, idx = 0;
		try {
			String number = br.readLine();
			while (count <= 1) {
				p[count++] = Integer.parseInt(number.substring(idx, idx + 2));
				idx += 2;
			}	
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String args[]) {
		System.out.println("TEA ENCRYPTION: ");
	}

}