package com.prata.bff_agendador.infrastructure.client;



import com.prata.bff_agendador.business.dto.out.TarefasDTOResponse;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.*;

@FeignClient(name = "notificacao", url = "${notificacao.url}")
public interface EmailClient {

    void enviarEmail(@RequestBody TarefasDTOResponse dto);
}
