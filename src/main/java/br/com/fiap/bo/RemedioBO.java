package br.com.fiap.bo;


import br.com.fiap.dao.RemedioDAO;
import br.com.fiap.to.RemedioTO;

import java.time.LocalDate;
import java.util.ArrayList;

//classe que conversa com as classes DAO e que serve para definir regras de negocio do projeto
public class RemedioBO {

    private RemedioDAO remedioDAO;


    public ArrayList<RemedioTO>findAll(){
        remedioDAO = new RemedioDAO();
        //aqui se implementas as regras de negocio

        return remedioDAO.findAll();
    }

    public RemedioTO findByCodigo(Long codigo){
        remedioDAO = new RemedioDAO();
        //aqui se implementa a regra de negocios
        return remedioDAO.findByCodigo(codigo);
    }

    public RemedioTO save (RemedioTO remedio){
        remedioDAO = new RemedioDAO();
        //aqui se implementa a regra d enegocio
        //verifica se o remedio esta vencido
        // if(remedio.getDataDeValidade().isBefore(LocalDate.now())){
        //     return null;
       // }
        return remedioDAO.save(remedio);
    }

    public boolean delete(Long codigo){
        remedioDAO = new RemedioDAO();
        //aqui se implementa a regra de negocios
        return remedioDAO.delete(codigo);
    }
}
