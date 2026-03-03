package br.uniesp.si.techback.controller;

import br.uniesp.si.techback.model.Genero;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/generos")


public class GeneroController {

    private static List<Genero> lista = new ArrayList<>();

    @PostMapping
    public Genero criar(Genero genero){
        lista.add(genero);
        return genero;
    }

    @GetMapping
    public List<Genero> listar(){
        return lista;
    }

    @PutMapping
    public Genero atualizar(Genero genero){
        lista.removeLast();
        lista.add(genero);
        return genero;
    }

    @DeleteMapping
    public String delete(){
        return "deletar";
    }
}
