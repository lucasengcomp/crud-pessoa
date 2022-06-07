package com.br.endereco.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "pessoa")
public class Endereco {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Column(length = 100)
    private String nome;

    @NotNull
    @Pattern(regexp = "[0-9]{5}-[0-9]{3}")
    @Column(length = 9)
    private String cep;

    @NotBlank
    @Column(length = 50)
    private String rua;

    @NotBlank
    @Column(length = 50)
    private String bairro;

    @NotBlank
    @Column(length = 10)
    private String numero;

    @Column(length = 120)
    private String complemento;

    @NotBlank
    @Column(length = 100)
    private String logradouro;

    //Estado
    @NotBlank
    @Column(length = 10)
    private String nomeEstado;

    @NotBlank
    @Size(max = 2, min = 2)
    @Column(length = 2)
    private String siglaEstado;

    @ManyToOne(optional = false)
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

}
