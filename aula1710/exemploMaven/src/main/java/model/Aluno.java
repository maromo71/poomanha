package model;

import lombok.*;

@AllArgsConstructor
@Data
public class Aluno {
    private int rm;
    private String nome;
    private String email;
    private String nomeCurso;
    private String nomeTurma;
    private String periodo;


}
