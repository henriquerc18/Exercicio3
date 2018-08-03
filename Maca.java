package ex3;

public class Maca {
	
	private int qtdMaca = 0;
	
	public Maca(int qtdMaca){
		this.qtdMaca = qtdMaca;
	}
	
	public int getQtdMaca(){
		return qtdMaca;
	}
	
	public void setqtdMaca(int qtdMaca){
		this.qtdMaca = qtdMaca;
	}
	
	public double calcularPreco(){
		double total;
		if(qtdMaca < 12 && qtdMaca > 0){
			total = qtdMaca * 1.30;
		}else if(qtdMaca >= 12){
			total = qtdMaca * 1.00;
		}else{
			total = 0;
		}
		return total;
	}

}
