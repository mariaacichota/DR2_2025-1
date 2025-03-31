package com.infnet.DR2_TP3.controller;

import com.infnet.DR2_TP3.model.Usuario;

public class UsuarioController {
    private Usuario usuario;

    public UsuarioController(Usuario usuario) {
        this.usuario = usuario;
    }

    public void atualizarEmail(String novoEmail) {
        usuario.atualizarEmail(novoEmail);
    }

    public void definirCargo(String novoCargo) {
        usuario.definirCargo(novoCargo);
    }
}
