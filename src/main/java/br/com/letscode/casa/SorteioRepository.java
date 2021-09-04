package br.com.letscode.casa;

import br.com.letscode.aluno.Aluno;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(url= "https://api-harrypotter.herokuapp.com/sortinghat", name = "sorting")
public interface SorteioRepository {

    @GetMapping()
    Aluno getSorteio();

  }