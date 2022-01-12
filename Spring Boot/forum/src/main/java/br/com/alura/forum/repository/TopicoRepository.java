package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    // Curso_Nome indica que Curso é o relacionamento com a classe curso, e nome é o atributo dentro de Curso
    // mas dá pra usar CursoNome também
    Page<Topico> findByCurso_Nome(String nomeCurso, Pageable paginacao);

}
