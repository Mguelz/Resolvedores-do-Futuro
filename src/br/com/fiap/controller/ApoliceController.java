package br.com.fiap.controller;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.model.ApoliceModel;
import br.com.fiap.repository.ApoliceDAO;

public class ApoliceController {
    private ApoliceDAO apoliceDAO;

    public ApoliceController() throws SQLException {
        apoliceDAO = new ApoliceDAO();
    }

    public void inserirApolice(ApoliceModel apolice) {
        apoliceDAO.insert(apolice);
    }

    public ApoliceModel sellectById(long idApolice) {
        return apoliceDAO.selectById(idApolice);
    }

    public void atualizarApolice(ApoliceModel apolice) {
        apoliceDAO.update(apolice);
    }

    public void deletarApolice(long idApolice) {
        apoliceDAO.delete(idApolice);
    }

    public List<ApoliceModel> buscarTodasApolices() {
        return apoliceDAO.selectAll();
    }
}

