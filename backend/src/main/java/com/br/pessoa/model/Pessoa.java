package com.br.pessoa.model;

import com.br.endereco.model.Endereco;
import com.br.pessoa.model.enums.SexoPessoa;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "pessoa")
public class Pessoa {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Column(length = 100)
    private String nome;

    @NotBlank
    @Column(length = 100)
    private String email;

    @NotBlank
    @Column(length = 20)
    private String telefone;

    @Enumerated(EnumType.STRING)
    private SexoPessoa sexoPessoa;

    @OneToMany(mappedBy = "pessoa")
    private List<Endereco> enderecos;
}
