package br.com.principal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.principal.entity.Banco;
import br.com.principal.entity.Cliente;
import br.com.principal.entity.Conta;
import br.com.principal.entity.ContaCorrente;
import br.com.principal.exception.StandartError;
import br.com.principal.service.BancoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api("API Banco Digital")
@RestController
@RequestMapping("/api/bancodigital")
public class BancoDigitalController {
	
	@Autowired
	private BancoService bancoService;
	
	@ApiOperation(value = "Transferir")
	@ApiResponses(value = {
	@ApiResponse(code = 201, message = "Created",               response = Banco.class),
	@ApiResponse(code = 400, message = "Bad request",           response = StandartError.class),
	@ApiResponse(code = 401, message = "Unauthorized",          response = StandartError.class),
	@ApiResponse(code = 403, message = "Forbidden",             response = StandartError.class),
	@ApiResponse(code = 404, message = "Not found",             response = StandartError.class),
	@ApiResponse(code = 500, message = "Internal server error", response = StandartError.class)
	})	
	@PostMapping
	public void transferir() {		
		Cliente cliente = new Cliente();
		Conta contaCorrente = new ContaCorrente(cliente);		
		bancoService.transferir(100d,contaCorrente);		
	}
	
	@ApiOperation(value = "Depositar")
	@ApiResponses(value = {
	@ApiResponse(code = 201, message = "Created",               response = Banco.class),
	@ApiResponse(code = 400, message = "Bad request",           response = StandartError.class),
	@ApiResponse(code = 401, message = "Unauthorized",          response = StandartError.class),
	@ApiResponse(code = 403, message = "Forbidden",             response = StandartError.class),
	@ApiResponse(code = 404, message = "Not found",             response = StandartError.class),
	@ApiResponse(code = 500, message = "Internal server error", response = StandartError.class)
	})	
	@PostMapping
	public void depositar() {
		Cliente cliente = new Cliente();
		Conta contaCorrente = new ContaCorrente(cliente);		
		bancoService.transferir(1252d,contaCorrente);	
	}
	
	

}
