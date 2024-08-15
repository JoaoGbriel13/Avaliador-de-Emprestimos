package com.jg.avaliador_emprestimos.dto;

import com.jg.avaliador_emprestimos.entity.EstadoBrasileiro;

public record UserRequest(
        int age,
        String cpf,
        String name,
        double income,
        EstadoBrasileiro location
) {
}
