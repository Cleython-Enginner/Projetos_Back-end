package desafiomv.controlemvrestapi.controller;

import desafiomv.controlemvrestapi.model.ClienteModel;
import desafiomv.controlemvrestapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ClienteController {

 @Autowired
      private ClienteRepository repository;

    @GetMapping(path = "/api/cliente/{codigo}")
    public ResponseEntity consultar (@PathVariable("codigo") Integer codigo){
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping(path = "/api/cliente/salvar")
    public ClienteModel salvar(@RequestBody ClienteModel cliente){
        return repository.save(cliente);
    }

    //-> Fazer editar e excluir

        }
