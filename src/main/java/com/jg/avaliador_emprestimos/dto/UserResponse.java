package com.jg.avaliador_emprestimos.dto;

import com.jg.avaliador_emprestimos.entity.Emprestimo;

import java.util.List;

public record UserResponse(
    String customer,
    List<Emprestimo> loans
){

}
