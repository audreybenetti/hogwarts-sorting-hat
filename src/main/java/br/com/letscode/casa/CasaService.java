package br.com.letscode.casa;

import br.com.letscode.aluno.Aluno;
import lombok.*;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CasaService {

    private final SorteioRepository sorteioRepository;
    private final CasaRepository casaRepository;

    public String sortearCasa(){
        return sorteioRepository.getSorteio().getIdCasa();
    }

    public Casa exibirCasa(String casaId){
        return casaRepository.casa(casaId);
    }
}
