package com.company.nomeprojeto.tarefas.facade;


import com.company.nomeprojeto.tarefas.dto.TarefaDTO;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TarefasFacade {
    private static final Map<Long, TarefaDTO> tarefas = new HashMap<>();

    public TarefaDTO criar(TarefaDTO tarefaDTO){
        Long proximoId = tarefas.keySet().size() +1L;
        tarefaDTO.setId(proximoId);
        tarefas.put(proximoId, tarefaDTO );
        return tarefaDTO;
    }
    public TarefaDTO atualizar (TarefaDTO tarefaDTO, Long tarefaId){
        tarefas.put(tarefaId, tarefaDTO);
        return tarefaDTO;
    }

}
