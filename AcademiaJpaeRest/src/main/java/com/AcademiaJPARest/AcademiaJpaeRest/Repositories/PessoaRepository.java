package com.AcademiaJPARest.AcademiaJpaeRest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AcademiaJPARest.AcademiaJpaeRest.Models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
