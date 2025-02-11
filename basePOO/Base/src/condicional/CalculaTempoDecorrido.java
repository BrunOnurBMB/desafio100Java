package condicional;

import java.util.Locale;
import java.util.Scanner;

public class CalculaTempoDecorrido {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempStart, tempFinish, tempTotal;
		
		System.out.println("Informe primeiro a hora inicial e depois a hora final: ");
		tempStart = sc.nextInt();
		tempFinish = sc.nextInt();
				
		tempTotal = (tempStart == 0 && tempFinish == 0) ? 24 :
					(tempStart > 12 && tempFinish > 12) ? tempFinish - tempStart :
					(tempStart < 12 && tempFinish < 12)	? tempFinish - tempStart :
					(tempStart > 12 && tempFinish < 12) ? (tempFinish + 24) - tempStart :
					tempFinish - tempStart ;
		
		System.out.println("Durou: " + tempTotal + "hr");
		sc.close();

	}

}
