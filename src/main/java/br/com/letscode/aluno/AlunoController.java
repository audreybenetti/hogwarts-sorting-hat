package br.com.letscode.aluno;

import io.reactivex.Observable;
import io.reactivex.Single;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    @PostMapping("/cadastro")
    @ResponseStatus(HttpStatus.CREATED)
    public Single<AlunoResponse> adicionarAluno(@RequestBody AlunoRequest alunoRequest){
        return alunoService.adicionarAluno(alunoRequest);
    }

   @ResponseStatus(HttpStatus.OK)
   @GetMapping("/buscar")
    public Single<AlunoResponse> buscarAlunoNome(@RequestParam String nome){
        return alunoService.buscarAlunoNome(nome);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public Observable<AlunoResponse> exibirAlunos() {
        return alunoService.exibirAlunos();
    }
}
