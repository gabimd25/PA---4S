package projetopa.funcionarios.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import projetopa.funcionarios.model.Funcionario;

public interface FuncionarioDao {
    
    int insertFuncionario(UUID id, Funcionario funcionario);

    default int insertFuncionario(Funcionario funcionario){
        UUID id = UUID.randomUUID();
        return insertFuncionario(id, funcionario);
    }

    List<Funcionario> selectAllFuncionario();

    Optional<Funcionario> selectFuncionarioById(UUID id);

    int deleteFuncionarioById(UUID id);

    int updateFuncionarioById(UUID id, Funcionario funcionario);

}
