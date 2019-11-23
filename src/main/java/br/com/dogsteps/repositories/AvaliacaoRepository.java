package br.com.dogsteps.repositories;

import br.com.dogsteps.dao.Dao;
import br.com.dogsteps.interfaces.IBaseRepository;
import br.com.dogsteps.interfaces.IDao;
import br.com.dogsteps.interfaces.IRepositoryFilter;
import br.com.dogsteps.models.Avaliacao;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.List;

public class AvaliacaoRepository implements IBaseRepository<Avaliacao>, IRepositoryFilter<Avaliacao, String> {
    private static final String FILE_NAME = "database/avaliacao.bin";
    private final IDao<Avaliacao, String> AVALIACAO_DAO = inicializarDao();

    @Override
    public Dao inicializarDao() {
        try {
            return new Dao(FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Avaliacao> getList() {
        return AVALIACAO_DAO.getAll();
    }

    @Override
    public Response add(Avaliacao avaliacao) {
        try {
            if (AVALIACAO_DAO.add(avaliacao))
                return Response.status(Response.Status.OK).build();
            else
                return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }

    @Override
    public List<Avaliacao> getListByFilter(String s) {
        return AVALIACAO_DAO.getAll();
    }
}
