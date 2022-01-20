package br.com.principal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.principal.entity.Cliente;
import br.com.principal.entity.Conta;
import br.com.principal.repository.BancoRepository;
import br.com.principal.repository.ContaRepository;

@Service
public class BancoService {
	
	@Autowired
	private BancoRepository planilhaRepository;
	
	@Autowired
	private ContaRepository contaRepository;
	
	public void sacar(double valor, Cliente clienteDestino, Conta conta) {		
		contaRepository.save(conta);		
	}
		
	public void transferir(double valor,Conta conta) {
		contaRepository.save(conta);					
	}
	
	public void depositar(double valor, Conta conta) {
		contaRepository.save(conta);		
	}
	
    public void debitar(double valor, Conta conta) {
    	contaRepository.save(conta);		
	}
	
	
	

}
