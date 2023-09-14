package Controller;

public class SomaVetor extends Thread {

	private int [] vetor = new int [5];
	private int i;
	public SomaVetor(int i, int [] vetor) {
		this.vetor= vetor;
		this.i=i;
	}
	@Override
	public void run() {
		int soma =0;
		for (int j=0; j<5; j++) {
			soma= soma + vetor[j];
		}
		System.out.println("Soma da linha " +i+ ": "  + soma);
	}

	
}
