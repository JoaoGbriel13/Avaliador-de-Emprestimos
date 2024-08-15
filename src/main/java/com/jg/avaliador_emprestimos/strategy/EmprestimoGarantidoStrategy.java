package com.jg.avaliador_emprestimos.strategy;

import com.jg.avaliador_emprestimos.dto.UserRequest;
import com.jg.avaliador_emprestimos.entity.Emprestimo;
import com.jg.avaliador_emprestimos.entity.EstadoBrasileiro;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoGarantidoStrategy implements EmprestimoStrategy{
    @Override
    public boolean isAplicable(UserRequest userRequest) {
        return userRequest.income() < 3000 ||
                userRequest.income() >= 3000 && userRequest.income() <= 5000 && userRequest.age() < 30 &&
                        userRequest.location() == EstadoBrasileiro.SP;
    }

    @Override
    public Emprestimo checkLoan() {
        return new Emprestimo("GUARANTEED", 3);
    }
}
