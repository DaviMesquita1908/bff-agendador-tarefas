package com.davimesquita.bffagendadortarefas.Business.Dto.In;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class LoginDTORequest {

    private String email;
    private String senha;

}
