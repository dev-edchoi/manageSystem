package com.tech.manageSystem.repository;

import com.tech.manageSystem.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
