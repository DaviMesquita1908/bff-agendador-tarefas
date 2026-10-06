package com.davimesquita.bffagendadortarefas.Infrastructure.Client;

import com.davimesquita.bffagendadortarefas.Business.Dto.In.EnderecoDTORequest;
import com.davimesquita.bffagendadortarefas.Business.Dto.In.LoginDTORequest;
import com.davimesquita.bffagendadortarefas.Business.Dto.In.TelefoneDTORequest;
import com.davimesquita.bffagendadortarefas.Business.Dto.In.UsuarioDTORequest;
import com.davimesquita.bffagendadortarefas.Business.Dto.Out.EnderecoDTOResponse;
import com.davimesquita.bffagendadortarefas.Business.Dto.Out.TelefoneDTOResponse;
import com.davimesquita.bffagendadortarefas.Business.Dto.Out.UsuarioDTOResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "usuario", url = "${usuario.url}")

public interface UsuarioClient {

    @GetMapping("/usuario")
    UsuarioDTOResponse buscaUsuarioPorEmail(@RequestParam("email") String email,
                                    @RequestHeader("Authorization") String token);

    @PostMapping
    UsuarioDTOResponse salvaUsuario(@RequestBody UsuarioDTORequest usuarioDTO);

    @PostMapping("/login")
    String login(@RequestBody LoginDTORequest usuarioDTO);

    @DeleteMapping("/{email}")
    void deletaUsuarioPorEmail(@PathVariable String email,
                               @RequestHeader("Authorization") String token);

    @PutMapping
    UsuarioDTOResponse atualizaDadosUsuario(@RequestBody UsuarioDTORequest dto,
                                            @RequestHeader("Authorization") String token);

    @PutMapping("/endereco")
    EnderecoDTOResponse atualizaEndereco(@RequestBody EnderecoDTORequest dto,
                                 @RequestParam("id") Long id,
                                 @RequestHeader("Authorization") String token);

    @PutMapping("/telefone")
    TelefoneDTOResponse atualizaTelefone(@RequestBody TelefoneDTORequest dto,
                                 @RequestParam("id") Long id,
                                 @RequestHeader("Authorization") String token);

    @PostMapping("/endereco")
    EnderecoDTOResponse cadastraEndereco(@RequestBody EnderecoDTORequest dto,
                                         @RequestHeader("Authorization") String token);

    @PostMapping("/telefone")
    TelefoneDTOResponse cadastraTelefone(@RequestBody TelefoneDTORequest dto,
                                         @RequestHeader("Authorization") String token);
}
