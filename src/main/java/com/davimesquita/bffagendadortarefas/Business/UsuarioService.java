package com.davimesquita.bffagendadortarefas.Business;

import com.davimesquita.bffagendadortarefas.Business.Dto.In.EnderecoDTORequest;
import com.davimesquita.bffagendadortarefas.Business.Dto.In.LoginDTORequest;
import com.davimesquita.bffagendadortarefas.Business.Dto.In.TelefoneDTORequest;
import com.davimesquita.bffagendadortarefas.Business.Dto.In.UsuarioDTORequest;
import com.davimesquita.bffagendadortarefas.Business.Dto.Out.EnderecoDTOResponse;
import com.davimesquita.bffagendadortarefas.Business.Dto.Out.TelefoneDTOResponse;
import com.davimesquita.bffagendadortarefas.Business.Dto.Out.UsuarioDTOResponse;
import com.davimesquita.bffagendadortarefas.Infrastructure.Client.UsuarioClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UsuarioService {

    private final UsuarioClient client;

    public UsuarioDTOResponse salvaUsuario(UsuarioDTORequest usuarioDTO) {
        return client.salvaUsuario(usuarioDTO);
    }

    public  String loginUsuario(LoginDTORequest usuarioDTO) {
        return client.login(usuarioDTO);
    }

    public UsuarioDTOResponse buscarUsuarioPorEmail(String email, String token) {
       return client.buscaUsuarioPorEmail(email, token);
    }

    public void deletaUsuarioPorEmail(String email, String token) {
        client.deletaUsuarioPorEmail(email, token);
    }

    public UsuarioDTOResponse atualizaDadosUsuario(String token, UsuarioDTORequest dto) {
        return client.atualizaDadosUsuario(dto, token);
    }

    public EnderecoDTOResponse atualizaEndereco(Long idEndereco, EnderecoDTORequest enderecoDTO, String token) {
        return client.atualizaEndereco(enderecoDTO, idEndereco, token);
    }

    public TelefoneDTOResponse atualizaTelefone(Long idTelefone, TelefoneDTORequest telefoneDTO, String token) {
        return client.atualizaTelefone(telefoneDTO, idTelefone, token);
    }

    public EnderecoDTOResponse cadastraEndereco(String token, EnderecoDTORequest dto) {
        return client.cadastraEndereco(dto, token);
    }

    public TelefoneDTOResponse cadastraTelefone(String token, TelefoneDTORequest dto) {
        return client.cadastraTelefone(dto, token);
    }
}
