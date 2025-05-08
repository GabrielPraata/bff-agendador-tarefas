package com.prata.bff_agendador.business;


import com.prata.bff_agendador.business.dto.out.TarefasDTOResponse;
import com.prata.bff_agendador.infrastructure.client.EmailClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final EmailClient emailClient;

    public void enviaEmail(TarefasDTOResponse dto){
         emailClient.enviarEmail(dto);
    }


}
