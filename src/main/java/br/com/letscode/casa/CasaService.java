package br.com.letscode.casa;

import br.com.letscode.aluno.Aluno;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CasaService {

    private final SorteioRepository sorteioRepository;
    private final CasaRepository casaRepository;

    public String sortearCasa(){
        return sorteioRepository.getSorteio().getIdCasa();
    }

    public Casa exibirCasa(Aluno aluno){
        return casaRepository.casa(aluno.getIdCasa());
    }
}
