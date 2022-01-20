package br.com.principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.principal.entity.Banco;

@Repository
public interface BancoRepository extends JpaRepository<Banco, Long>{

}
