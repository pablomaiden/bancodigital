package br.com.principal.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="conta")
public class Conta implements IConta{
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		
	}
	
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void transferir(double valor, IConta contaDestino) {
		// TODO Auto-generated method stub		
	}
	
	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub		
	}
	
	

}
