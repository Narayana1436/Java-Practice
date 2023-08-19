package labelWhile;

public class labelWhile {

	public static void main(String[] args) {
	int i=1;
	rajini:while(i<=5) {
		int m=1;
		samantha:while(m<=5) {
			System.out.print("*");
			m++;
			break rajini;
		}
		System.out.println();
			i++;
			
		}
	}

	}


