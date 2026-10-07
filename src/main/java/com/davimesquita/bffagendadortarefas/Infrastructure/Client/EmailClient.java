package com.davimesquita.bffagendadortarefas.Infrastructure.Client;

import com.davimesquita.bffagendadortarefas.Business.Dto.Out.TarefasDTOResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "notificacao", url = "${notificacao.url}")

public interface EmailClient {

    void enviarEmail(@RequestBody TarefasDTOResponse dto);

}
