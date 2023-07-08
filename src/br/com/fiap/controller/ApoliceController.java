package br.com.fiap.controller;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.model.Apolice;
import br.com.fiap.repository.ApoliceDAO;

public class ApoliceController {
    private ApoliceDAO apoliceDAO;

    public ApoliceController() throws SQLException {
        apoliceDAO = new ApoliceDAO();
    }

    public void inserirApolice(Apolice apolice) {
        apoliceDAO.insert(apolice);
    }

    public Apolice sellectById(long idApolice) {
        return apoliceDAO.selectById(idApolice);
    }

    public void atualizarApolice(Apolice apolice) {
        apoliceDAO.update(apolice);
    }

    public void deletarApolice(long idApolice) {
        apoliceDAO.delete(idApolice);
    }

    public List<Apolice> buscarTodasApolices() {
        return apoliceDAO.selectAll();
    }
}

