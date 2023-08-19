package labelWhile;

public class labelDowhile {

	public static void main(String[] args) {
		int a=2;
		rajini:do {
			int b=3;
			a++;
		kamal:do {
			System.out.println("kamal");
			b++;
			break rajini;
		}while(b<=8);
		}while(a<=8);
		System.out.println("rajini");
			
		}
				
			}
		

	


