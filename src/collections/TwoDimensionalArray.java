package collections;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		String [][] states = new String[3][2];
		states[0][0] = "Telangana";
		states[0][1] = "Hyderabad";
		states[1][0] = "AP";
		states[1][1] = "Vijayawada";
		states[2][0] = "Karanataka";
		states[2][1] = "Bangalore";
		
		for (int i = 0; i < states.length; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < states[i].length; j++) {
				if (j == 0) {
					sb.append("The capitol of ");
				} else {
					sb.append(" is ");
				}
				sb.append(states[i][j]);
			}
			System.out.println(sb);
		}
	}

}
