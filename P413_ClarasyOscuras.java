import java.util.Scanner;

public class P413_ClarasyOscuras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int casos;

		int ancho;
		int largo;
		
		int blancas = 0;
		int negras = 0;
		
		double cantidad = 0;
		double total;
		
		casos = teclado.nextInt();

		for(int cont=0; cont < casos; cont++) {

			ancho = teclado.nextInt();
			largo = teclado.nextInt();

			total = (double)ancho * largo;
			cantidad = (double)total / 2;
			
			blancas = (int)cantidad;
			negras = (int)cantidad;
			
			if(ancho == 1 && largo == 1) {
				blancas = 1;
				negras = 0;
			}else {
				if((total % 2) != 0) {
					blancas = (int)cantidad + 1;
				}
			}
			
			System.out.println(blancas +" "+ negras);
			System.out.println();
		}


	}

}