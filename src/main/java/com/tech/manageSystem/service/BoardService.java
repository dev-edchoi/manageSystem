package com.tech.manageSystem.service;

import com.tech.manageSystem.model.Board;
import com.tech.manageSystem.model.User;
import com.tech.manageSystem.repository.BoardRepository;
import com.tech.manageSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public Board save(String username, Board board){
        User user = userRepository.findByUsername(username);

        board.setUser(user);
        return boardRepository.save(board);
    }
}
