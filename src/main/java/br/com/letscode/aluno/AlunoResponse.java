package br.com.letscode.aluno;

import br.com.letscode.casa.Casa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AlunoResponse {

    private int id;
    private String nome;
    private Casa casa;
}
