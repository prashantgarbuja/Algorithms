package org.luffy;

public class BruteForce {

	public static void main(String [] args) {
		bruteForce(3);//this brute force works if we know fixed length.
	}
	public static String bruteForce(int size) {
		int[] password = new int[size];
		String pass = "345"; //testing string.
		return computePermutations(size, password, 0, pass);
	}
	
	private static String computePermutations(int size, int[] password, int position, String pass) {
		String testString = "";
		String assemble = "";
		for (int i = 0; i<36; i++) {
			password[position] = i;
			
			if (position !=size - 1) {
				testString = computePermutations(size, password, position + 1, pass);
				if (testString != "") {
					return testString;
				}
			}else if (position == size - 1) {
				for (int j = 0; j < size; j++) {
					switch(password[j] + 1) {
					case 1:
						assemble = assemble + "A";
						break;
					case 2:
						assemble = assemble + "B";
						break;
					case 3:
						assemble = assemble + "C";
						break;
					case 4:
						assemble = assemble + "D";
						break;
					case 5:
						assemble = assemble + "E";
						break;
					case 6:
						assemble = assemble + "F";
						break;
					case 7:
						assemble = assemble + "G";
						break;
					case 8:
						assemble = assemble + "H";
						break;
					case 9:
						assemble = assemble + "I";
						break;
					case 10:
						assemble = assemble + "J";
						break;
					case 11:
						assemble = assemble + "K";
						break;
					case 12:
						assemble = assemble + "L";
						break;
					case 13:
						assemble = assemble + "M";
						break;
					case 14:
						assemble = assemble + "N";
						break;
					case 15:
						assemble = assemble + "O";
						break;
					case 16:
						assemble = assemble + "P";
						break;
					case 17:
						assemble = assemble + "Q";
						break;
					case 18:
						assemble = assemble + "R";
						break;
					case 19:
						assemble = assemble + "S";
						break;
					case 20:
						assemble = assemble + "T";
						break;
					case 21:
						assemble = assemble + "U";
						break;
					case 22:
						assemble = assemble + "V";
						break;
					case 23:
						assemble = assemble + "W";
						break;
					case 24:
						assemble = assemble + "X";
						break;
					case 25:
						assemble = assemble + "Y";
						break;
					case 26:
						assemble = assemble + "Z";
						break;
					case 27:
						assemble = assemble + "0";
						break;
					case 28:
						assemble = assemble + "1";
						break;
					case 29:
						assemble = assemble + "2";
						break;
					case 30:
						assemble = assemble + "3";
						break;
					case 31:
						assemble = assemble + "4";
						break;
					case 32:
						assemble = assemble + "5";
						break;
					case 33:
						assemble = assemble + "6";
						break;
					case 34:
						assemble = assemble + "7";
						break;
					case 35:
						assemble = assemble + "8";
						break;
					case 36:
						assemble = assemble + "9";
						break;
					}
				}
				System.out.println(assemble);
				if (assemble.equalsIgnoreCase(pass)) {
					System.out.println("Password is :" + assemble);
					return assemble;
				} else {
					assemble = "";
				}
			}
		}
		return "";
	}
}
