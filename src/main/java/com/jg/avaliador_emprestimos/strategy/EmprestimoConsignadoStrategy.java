package com.jg.avaliador_emprestimos.strategy;

import com.jg.avaliador_emprestimos.dto.UserRequest;
import com.jg.avaliador_emprestimos.entity.Emprestimo;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoConsignadoStrategy implements EmprestimoStrategy{
    @Override
    public boolean isAplicable(UserRequest userRequest) {
        return userRequest.income() >= 5000;
    }

    @Override
    public Emprestimo checkLoan() {
        return new Emprestimo("CONSIGNMENT", 2);
    }
}
