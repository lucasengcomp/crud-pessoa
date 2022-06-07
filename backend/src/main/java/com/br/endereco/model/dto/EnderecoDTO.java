package com.br.endereco.model.dto;

import com.br.endereco.model.Endereco;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class EnderecoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String cidade;
    private String cep;
    private String rua;
    private String bairro;
    private String numero;
    private String complemento;
    private String logradouro;
    private String nomeEstado;
    private String siglaEstado;

    public EnderecoDTO() {
    }

    public EnderecoDTO(Integer id, String cidade, String cep, String rua, String bairro, String numero, String complemento, String logradouro, String nomeEstado, String siglaEstado) {
        this.id = id;
        this.cidade = cidade;
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
        this.logradouro = logradouro;
        this.nomeEstado = nomeEstado;
        this.siglaEstado = siglaEstado;
    }

    public EnderecoDTO(Endereco entity) {
        id = entity.getId();
        cidade = entity.getCidade();
        cep = entity.getCep();
        rua = entity.getRua();
        bairro = entity.getBairro();
        numero = entity.getNumero();
        complemento = entity.getComplemento();
        logradouro = entity.getLogradouro();
        nomeEstado = entity.getNomeEstado();
        siglaEstado = entity.getSiglaEstado();
    }
}
