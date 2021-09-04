package br.com.letscode.aluno;

import br.com.letscode.casa.CasaService;
import io.reactivex.Single;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class AlunoService {


    private final AlunoRepository alunoRepository;
    private final CasaService casaService;


    public Single<AlunoResponse> adicionarAluno(AlunoRequest alunoRequest){
        return Single.create(singleSubscriber -> {
        var aluno = alunoRepository.save(builderAluno(alunoRequest));
        singleSubscriber.onSuccess(converterAluno(aluno));
        });
    }

    public Aluno builderAluno (AlunoRequest alunoRequest) {
        return new Aluno(alunoRequest.getNome(), casaService.sortearCasa());
    }

    public AlunoResponse converterAluno (Aluno aluno){
        return new AlunoResponse(aluno.getId(), aluno.getNome(), casaService.exibirCasa(aluno.getIdCasa()));
    }
}
