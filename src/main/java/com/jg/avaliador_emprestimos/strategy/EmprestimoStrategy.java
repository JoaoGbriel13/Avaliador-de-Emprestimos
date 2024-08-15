package com.jg.avaliador_emprestimos.strategy;

import com.jg.avaliador_emprestimos.dto.UserRequest;
import com.jg.avaliador_emprestimos.entity.Emprestimo;

public interface EmprestimoStrategy {
    boolean isAplicable(UserRequest userRequest);
    public Emprestimo checkLoan();
}
