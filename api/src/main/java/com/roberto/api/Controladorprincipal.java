package com.roberto.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping (value ="/open-api",  produces= {"Application/json"})
public class Controladorprincipal {
@Autowired 
 @PostMapping("/Cadastrar")
 public RepositorioAluno repositorioAluno;
 
/**
 * @param aluno
 * @param bindingResult
 * @return
 */
public ResponseEntity<Aluno> cadastrar(@RequestBody @Valid Aluno aluno, BindingResult bindingResult) {  
    var resposta = new Aluno();
    resposta = (repositorioAluno.save(aluno));
    return new  ResponseEntity<>(resposta, HttpStatus.CREATED); 
    }
    /**
     * @return
     */
    @GetMapping(value = "listarAluno")
    public List<Aluno> listarAluno() {
        return (List<Aluno>) repositorioAluno.findAll();
    }
    @DeleteMapping("DeleterAluno/{matricula}")
    public ResponseEntity<Long> deletarAluno(@PathVariable Long matricula) {
        
        boolean alunoo = repositorioAluno.existsById(matricula);

        if (alunoo) {
            repositorioAluno.deleteById(matricula);
            return new ResponseEntity<>(matricula, HttpStatus.OK);
        }

        return new ResponseEntity<>(matricula, HttpStatus.NO_CONTENT);
        }
    @PutMapping("AtualizaAluno/{matricula}") 
       public ResponseEntity<Aluno> atualizaAluno(@PathVariable Long matricula, @RequestBody Aluno aluno) {
       Optional<Aluno> existingAluno = repositorioAluno.findById(matricula);

       if (existingAluno.isPresent()){
          Aluno atualizaAluno = existingAluno.get();
          atualizaAluno.nome = aluno.nome;
          atualizaAluno.sobrenome = aluno.sobrenome;
          atualizaAluno.cpf = aluno.cpf;
          atualizaAluno.nota = aluno.nota;
          repositorioAluno.save(atualizaAluno);
          return new ResponseEntity<>(atualizaAluno, HttpStatus.OK);
       }
       return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
}
