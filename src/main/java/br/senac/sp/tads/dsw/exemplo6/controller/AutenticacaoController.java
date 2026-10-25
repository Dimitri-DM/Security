package br.senac.sp.tads.dsw.exemplo6.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import br.senac.sp.tads.dsw.exemplo6.dto.RegisterDTO;
import br.senac.sp.tads.dsw.exemplo6.service.AutenticacaoService;
import jakarta.validation.Valid;

@RestController 
@RequestMapping ("/auth")
public class AutenticacaoController {
    private final AutenticacaoService service;

    public AutenticacaoController(AutenticacaoService service) {
        this.service = service;
    }

    @PostMapping ("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void registrar(@RequestBody @Valid RegisterDTO dto) {
        service.registrar(dto);
    }
}

