package br.com.principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.principal.entity.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{

}
