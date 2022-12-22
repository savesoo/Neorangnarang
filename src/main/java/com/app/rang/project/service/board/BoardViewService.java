package com.app.rang.project.service.board;

import com.app.rang.project.entity.Board;
import com.app.rang.project.model.board.BoardViewModel;
import com.app.rang.project.repository.BoardRepository;
import com.app.rang.project.util.CategoryUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Log4j2
@Service
public class BoardViewService {
    @Autowired
    BoardRepository boardRepository;

    public BoardViewModel getBoard(long boardidx) {
        Board board =  boardRepository.findByBoardidx(boardidx);
        return board.toBoardViewModel();
    }
}
