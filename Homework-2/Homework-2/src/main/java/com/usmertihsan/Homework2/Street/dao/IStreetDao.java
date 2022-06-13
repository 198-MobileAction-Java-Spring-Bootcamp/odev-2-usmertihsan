package com.usmertihsan.Homework2.Street.dao;

import com.usmertihsan.Homework2.Street.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStreetDao extends JpaRepository<Street,Long> {
}
