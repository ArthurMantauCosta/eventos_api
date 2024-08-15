package com.hellow.eventos.classes.evento;

import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Table(name="evento")
@Entity(name="evento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer evento_id;

    private String nome;
    private Date data;
    private String descricao;
    private int lotacao;
    @ManyToOne
    @JoinColumn(name="endereco_id")
    private Endereco endereco;
    @ManyToOne
    @JoinColumn(name="tipo_id")
    private Tipo tipo;

}
