package com.br.endereco.model;

import com.br.pessoa.model.Pessoa;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "endereco")
public class Endereco  implements Serializable {
    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Column(length = 100)
    private String cidade;

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
