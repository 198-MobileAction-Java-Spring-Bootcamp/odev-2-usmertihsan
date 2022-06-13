package com.usmertihsan.Homework2.District.dao;

import com.usmertihsan.Homework2.District.dto.DistrictDto;
import com.usmertihsan.Homework2.District.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IDistrictDao extends JpaRepository<District,Long> {

}
