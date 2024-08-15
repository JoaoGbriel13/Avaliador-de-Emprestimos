package com.jg.avaliador_emprestimos.controller;

import com.jg.avaliador_emprestimos.dto.UserRequest;
import com.jg.avaliador_emprestimos.service.EmprestimoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmprestimoController {
    private final EmprestimoService emprestimoService;

    public EmprestimoController(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }

    @PostMapping("/customer-loans")
    public ResponseEntity checkLoansAvailable(@RequestBody UserRequest userRequest){
        return emprestimoService.checkEligibility(userRequest);
    }
}
