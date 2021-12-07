package com.sunje.test.sample;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BoardRepository extends JpaRepository<Board, Long>{
	List<Board> findByC1(int c1);
	List<Board> findByC5(int c5);
}
