package projetopa.funcionarios.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import projetopa.funcionarios.dao.FuncionarioDao;
import projetopa.funcionarios.model.Funcionario;

@Service
public class FuncionarioService {
    
    private FuncionarioDao funcionarioDao;

    @Autowired
    public FuncionarioService(@Qualifier("Dao") FuncionarioDao funcionarioDao) {
        this.funcionarioDao = funcionarioDao;
    }

    public int addFuncionario(Funcionario funcionario) {
        return funcionarioDao.insertFuncionario(funcionario);
    }

    public List<Funcionario> getAllFuncionario() {
        return funcionarioDao.selectAllFuncionario();
    }

    public Optional<Funcionario> getFuncionarioById(UUID id) {
        return funcionarioDao.selectFuncionarioById(id);
    }

    public int deleteFuncionario(UUID id) {
        return funcionarioDao.deleteFuncionarioById(id);
    }

    public int updateFuncionario(UUID id, Funcionario newFuncionario) {
        return funcionarioDao.updateFuncionarioById(id, newFuncionario);
    }


}
