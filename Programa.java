package br.com.devmedia.exemplos.minhaprimeiraclasse;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Programa {

    public void exibirDiasAteExpirar(Expiravel expiravel) {
        if (expiravel instanceof Assinatura) {
            Assinatura assinatura = (Assinatura) expiravel;
             
            long diasTotais = ChronoUnit.DAYS.between(LocalDate.now(), assinatura.getDataExpiracao());
            System.out.println("Dias restantes: " + diasTotais);
        } else { 
            
            System.out.println("Dias restantes: " + expiravel.calculaPeriodoAteExpiracao().getDays());
        }
    }
}