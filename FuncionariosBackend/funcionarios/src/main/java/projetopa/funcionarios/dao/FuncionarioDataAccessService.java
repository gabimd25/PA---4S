package projetopa.funcionarios.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import projetopa.funcionarios.model.Funcionario;

public class FuncionarioDataAccessService implements FuncionarioDao {

    @Override
    public int insertFuncionario(UUID id, Funcionario funcionario) {
        
        return 0;
    }

    @Override
    public List<Funcionario> selectAllFuncionario() {
        
        return null;
    }

    @Override
    public Optional<Funcionario> selectFuncionarioById(UUID id) {

        return null;
    }

    @Override
    public int deleteFuncionarioById(UUID id) {

        return 0;
    }

    @Override
    public int updateFuncionarioById(UUID id, Funcionario funcionario) {

        return 0;
    }
    
}
