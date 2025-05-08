package com.prata.bff_agendador.business;


import com.prata.bff_agendador.business.dto.in.EnderecoDTORequest;
import com.prata.bff_agendador.business.dto.in.LoginRequestDTO;
import com.prata.bff_agendador.business.dto.in.TelefoneDTORequest;
import com.prata.bff_agendador.business.dto.in.UsuarioDTORequest;
import com.prata.bff_agendador.business.dto.out.EnderecoDTOResponse;
import com.prata.bff_agendador.business.dto.out.TelefoneDTOResponse;
import com.prata.bff_agendador.business.dto.out.UsuarioDTOResponse;
import com.prata.bff_agendador.infrastructure.client.UsuarioClient;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioClient usuarioClient;

    public UsuarioDTOResponse salavaUsuario(UsuarioDTORequest usuarioDTO) {

        return usuarioClient.salvaUsuario(usuarioDTO);
    }

    public String loginUsuario(LoginRequestDTO usuarioDTO) {
        return usuarioClient.login(usuarioDTO);
    }

    public UsuarioDTOResponse buscarUsuarioPorEmail(String email, String token){
        return usuarioClient.buscaUsuarioPorEmail(email, token);
    }

    public void deletaUsuarioPorEmail(String email, String token){
        usuarioClient.deletaUsuarioPorEmail(email, token);
    }

    public UsuarioDTOResponse atualizaDadosUsuario(String token, UsuarioDTORequest dto) {
       return usuarioClient.atualizaDadosUsuario(dto, token);
    }

    public EnderecoDTOResponse atualizaEndereco(Long idEndereco, EnderecoDTORequest enderecoDTO, String token){
       return usuarioClient.atualizaEndereco(enderecoDTO, idEndereco, token);
    }

    public TelefoneDTOResponse atualizaTelefone(Long idTelefone, TelefoneDTORequest telefoneDTO, String token){
        return usuarioClient.atualizaTelefone(telefoneDTO, idTelefone, token);
    }

    public EnderecoDTOResponse cadastrarEndereco(String token, EnderecoDTORequest enderecoDTO) {
        return usuarioClient.cadastraEndereco(enderecoDTO, token);
    }

    public TelefoneDTOResponse cadastraTelefone(String token, TelefoneDTORequest telefoneDTO){

        return usuarioClient.cadastraTelefone(telefoneDTO, token);
    }
}
