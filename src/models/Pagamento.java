package models;

public class Pagamento {
	
	private String pagamento;
	private int mes;
	private int ano;
	private int horasTrabalhadas;
	private double valorHora;
	
	public String getPagamento() {
		return pagamento;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	@Override
	public String toString() {
		
		return("\n"
				+" Pagamento: "+pagamento+"\n"
				+" MÊS: "+mes+"\n"
				+" ANO: "+ano+"\n"
				+" Horas Trabalhadas: "+horasTrabalhadas+"\n"
				+" Valor da Hora: "+valorHora
				+"\n");
	}
}



























