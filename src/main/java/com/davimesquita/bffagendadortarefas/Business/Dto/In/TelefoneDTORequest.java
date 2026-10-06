package com.davimesquita.bffagendadortarefas.Business.Dto.In;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class TelefoneDTORequest {

    private String numero;
    private String ddd;

}
