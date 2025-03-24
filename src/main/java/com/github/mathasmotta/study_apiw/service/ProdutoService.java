package com.github.mathasmotta.study_apiw.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.mathasmotta.study_apiw.model.Produto;

@Service
public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();
    private Long id = 1L;

    public Produto save(Produto produto) {
        produto.setId(id);
        return produto;
    }

}
