/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommercial.Classes;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciano Carrafa Benfica
 */
public class Departamentos {

    public Integer cod_departamentos;
    public Integer cod_dep_pai;
    public Integer cod_conta;
    public Integer cod_filial;
    public String departamento;
    public Time hora_abertura;
    public Time hora_fechamento;
    public Date dat_alteracao;
    public Integer ref_interna;
    public Integer dia_encerramento;
    public Integer lotacao_maxima;
    public String obs;

    public Integer getCod_conta() {
        return cod_conta;
    }

    public void setCod_conta(Integer cod_conta) {
        this.cod_conta = cod_conta;
    }

    public Integer getCod_dep_pai() {
        return cod_dep_pai;
    }

    public void setCod_dep_pai(Integer cod_dep_pai) {
        this.cod_dep_pai = cod_dep_pai;
    }

    public Integer getCod_departamentos() {
        return cod_departamentos;
    }

    public void setCod_departamentos(Integer cod_departamentos) {
        this.cod_departamentos = cod_departamentos;
    }

    public Integer getCod_filial() {
        return cod_filial;
    }

    public void setCod_filial(Integer cod_filial) {
        this.cod_filial = cod_filial;
    }

    public Date getDat_alteracao() {
        return dat_alteracao;
    }

    public void setDat_alteracao(Date dat_alteracao) {
        this.dat_alteracao = dat_alteracao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Integer getDia_encerramento() {
        return dia_encerramento;
    }

    public void setDia_encerramento(Integer dia_encerramento) {
        this.dia_encerramento = dia_encerramento;
    }

    public Time getHora_abertura() {
        return hora_abertura;
    }

    public void setHora_abertura(Time hora_abertura) {
        this.hora_abertura = hora_abertura;
    }

    public Time getHora_fechamento() {
        return hora_fechamento;
    }

    public void setHora_fechamento(Time hora_fechamento) {
        this.hora_fechamento = hora_fechamento;
    }

    public Integer getLotacao_maxima() {
        return lotacao_maxima;
    }

    public void setLotacao_maxima(Integer lotacao_maxima) {
        this.lotacao_maxima = lotacao_maxima;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Integer getRef_interna() {
        return ref_interna;
    }

    public void setRef_interna(Integer ref_interna) {
        this.ref_interna = ref_interna;
    }


    public void setCadastrar(){
  try{


        String comando = "INSERT INTO departamentos  "+
" 	(COD_DEPARTAMENTO,          "+
" 	COD_DEP_PAI,               "+
" 	COD_CONTA,  "+
" 	COD_FILIAL,              "+
"       DEPARTAMENTO,           "+
"       HORA_ABERTURA,          "+
"       HORA_FECHAMENTO,        "+
"       DAT_ALTERACAO,          "+
"       REF_INTERNA,            "+
"       DIA_ENCERRAMENTO,       "+
"       LOTACAO_MAXIMA,         "+
"       OBS                     "+
" 	) "+
" 	VALUES "+
" 	(null,  "+
" 	?,  "+
" 	?,  "+
" 	?,  "+
" 	?,  "+
" 	?,  "+
" 	?,  "+
" 	?,  "+
" 	?,  "+
" 	?,  "+
" 	?,  "+
" 	?  "+
" 	); "
;

        System.out.println("Executando operação...");

        PreparedStatement stmt = (PreparedStatement) ClassConecta.con.prepareStatement(comando);

        String oDataAlteracao = null;
        if (getDat_alteracao() != null){
          SimpleDateFormat oDatOut = new SimpleDateFormat("yyyy-MM-dd");
          oDataAlteracao = oDatOut.format(getDat_alteracao());
        }

        stmt.setInt(1,getCod_departamentos());
        stmt.setInt(2, getCod_dep_pai());
        stmt.setInt(3, getCod_conta());
        stmt.setInt(4, getCod_filial());
        stmt.setString(5, getDepartamento());
        stmt.setTime(6, getHora_abertura());
        stmt.setTime(7, getHora_fechamento());
        stmt.setString(8, oDataAlteracao);
        stmt.setInt(9, getRef_interna());
        stmt.setInt(10, getDia_encerramento());
        stmt.setInt(11, getLotacao_maxima());
        stmt.setString(12, getObs());

        stmt.execute();

        //System.out.println("Transação Concluída");
        //JOptionPane.showMessageDialog(null, "Transação Concluída", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        }catch(Exception e){
            System.err.println("Erro na Transação\n"+e);
            JOptionPane.showMessageDialog(null, "Erro na Transação", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        }
}



}//Fim classe
