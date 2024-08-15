package com.hellow.eventos.classes.cliente;

import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name="cliente")
@Table(name="cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")

    private Integer cliente_id;
    private String nome;
    private String sobrenome;
    private Integer cpf;
    private Integer telefone;
    private String email;
    @ManyToOne
    @JoinColumn(name="endereco_id")
    private Endereco endereco;
    @ManyToOne
    @JoinColumn(name="tipo_id")
    private Tipo tipo;

}
