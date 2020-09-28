package projetopa.funcionarios.api;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projetopa.funcionarios.model.Funcionario;
import projetopa.funcionarios.service.FuncionarioService;

@RequestMapping("funcionario")
@RestController
public class FuncionarioController {
    
    private FuncionarioService funcionarioService;

    @Autowired
    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @PostMapping
    public void addFuncionario(@RequestBody Funcionario funcionario) {
        funcionarioService.addFuncionario(funcionario);
    }

    @GetMapping
    public List<Funcionario> getAllFuncionario() {
        return funcionarioService.getAllFuncionario();
    }

    @GetMapping(path = "{id}")
    public Funcionario getFuncionarioById(@PathVariable("id") UUID id) {
        return funcionarioService.getFuncionarioById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteFuncionarioById(@PathVariable("id") UUID id) {
        funcionarioService.deleteFuncionario(id);
    }

    @PutMapping( path = "{id}")
    public void updateFuncionario(@PathVariable("id") UUID id, @RequestBody Funcionario funcionarioToUpdate) {
        funcionarioService.updateFuncionario(id, funcionarioToUpdate);
    }
}
