package com.jg.avaliador_emprestimos.service;

import com.jg.avaliador_emprestimos.dto.UserRequest;
import com.jg.avaliador_emprestimos.dto.UserResponse;
import com.jg.avaliador_emprestimos.entity.Emprestimo;
import com.jg.avaliador_emprestimos.strategy.EmprestimoStrategy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmprestimoService {
    private final List<EmprestimoStrategy> strategies;

    public EmprestimoService(List<EmprestimoStrategy> strategies) {
        this.strategies = strategies;
    }

    public ResponseEntity checkEligibility(UserRequest userRequest){
        List<Emprestimo> loansAvailable = new ArrayList<>();
        for (EmprestimoStrategy strategy : strategies){
            if (strategy.isAplicable(userRequest)){
                loansAvailable.add(strategy.checkLoan());
            }
        }
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(new UserResponse(userRequest.name(), loansAvailable));
    }
}
