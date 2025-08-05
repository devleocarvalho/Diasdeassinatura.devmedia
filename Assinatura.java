package br.com.devmedia.exemplos.minhaprimeiraclasse;

import java.time.LocalDate;
import java.time.Period;

public class Assinatura extends Produto
        implements Expiravel {

    private LocalDate dataExpiracao;

    @Override
    public Period calculaPeriodoAteExpiracao() {

        return Period.between(LocalDate.now(), dataExpiracao);
    }

    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(LocalDate dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }
}