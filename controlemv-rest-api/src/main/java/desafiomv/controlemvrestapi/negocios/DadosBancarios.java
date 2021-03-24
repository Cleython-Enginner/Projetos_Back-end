package desafiomv.controlemvrestapi.negocios;

import org.springframework.web.bind.annotation.RequestMapping;

public class DadosBancarios {

   private Long codigoBanco;

   private Integer numeroAgencia;

   private String numeroContaCorrente;

   public String TipodeConta;


    public Long getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(Long codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public Integer getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(String numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    public String getTipodeConta() {
        return TipodeConta;
    }

    public void setTipodeConta(String tipodeConta) {
        TipodeConta = tipodeConta;
    }
}
