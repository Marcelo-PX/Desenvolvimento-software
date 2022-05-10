package models;

public class FolhaPagamento {
	
	private Funcionario funcionario;
	private int mes;
	private int ano;
	private int horasTrabalhadas;
	private double valorHora;
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
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
				+" Colaborador: "+getFuncionario()+"\n"
				+" MÊS: "+getMes()+"\n"
				+" ANO: "+getAno()+"\n"
				+" Horas Trabalhadas: "+getHorasTrabalhadas()+"\n"
				+" Valor da Hora: "+getValorHora()
				+"\n");
	}
}



























