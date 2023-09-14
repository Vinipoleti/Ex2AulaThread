package view;

import Controller.SomaVetor;

public class Principal {

	
	public static void main(String[] args) {
		int m [][]= new int [3][5];
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<5;j++) {
				m[i][j]= (int) (Math.random()*100);
				System.out.println(m[i][j]);
			}
			
		}
		for (int i=0; i<3;i++) {
			int vetor []= new int[5];
			for (int j=0; j<5;j++) {
				vetor[j]=m[i][j];
			}
			Thread SV = new SomaVetor(i,vetor);
			SV.start();
		}
	}

}
