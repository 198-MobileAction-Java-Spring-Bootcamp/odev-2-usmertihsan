package com.usmertihsan.Homework2.City.dao;

import com.usmertihsan.Homework2.City.entity.City;
import com.usmertihsan.Homework2.Country.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICityDao extends JpaRepository<City,Long> {
    List<City> findByCityPlateNo(String cityPlateNo);
}
