package com.meencodewriter.toy.sample.repository;

import com.meencodewriter.toy.sample.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Integer> {
	

}