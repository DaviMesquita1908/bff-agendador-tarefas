package com.davimesquita.bffagendadortarefas.Business;

import com.davimesquita.bffagendadortarefas.Business.Dto.Out.TarefasDTOResponse;
import com.davimesquita.bffagendadortarefas.Infrastructure.Client.EmailClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class EmailService {

    private final EmailClient client;

    public void enviaEmail(TarefasDTOResponse dto) {
        client.enviarEmail(dto);
    }

}
