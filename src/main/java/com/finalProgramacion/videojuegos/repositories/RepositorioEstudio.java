package com.finalProgramacion.videojuegos.repositories;

import com.finalProgramacion.videojuegos.entities.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEstudio extends JpaRepository<Estudio, Long> {
}
