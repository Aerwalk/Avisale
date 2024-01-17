package com.aero.aviasale.service;

import com.aero.aviasale.domain.entity.BoardingPasses;
import com.aero.aviasale.repository.BoardingPassesRepository;
import com.aero.aviasale.domain.entity.compositeKeys.TicketNoFlightIdPK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardingPassesService {
    private final BoardingPassesRepository boardingPassesRepository;

    @Autowired
    public BoardingPassesService(BoardingPassesRepository boardingPassesRepository) {
        this.boardingPassesRepository = boardingPassesRepository;
    }

    public void createBoardingPass(TicketNoFlightIdPK ticketNoFlightIdPK, String seatNo) {
        BoardingPasses boardingPass = new BoardingPasses();
        boardingPass.setBoardingPassesCompositePK(ticketNoFlightIdPK);
        boardingPass.setSeatNo(seatNo);
        //DB is not set to auto-increment for this column
        boardingPass.setBoardingNo((int) (Math.random() * 1_000_000_000));
        boardingPassesRepository.save(boardingPass);
    }
}
