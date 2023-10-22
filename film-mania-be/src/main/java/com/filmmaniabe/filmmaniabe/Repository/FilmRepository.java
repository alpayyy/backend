package com.filmmaniabe.filmmaniabe.repository;

import com.filmmaniabe.filmmaniabe.Entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository  extends JpaRepository<Film,Long> {
}
