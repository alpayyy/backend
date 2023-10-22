package com.filmmaniabe.filmmaniabe.Service;

import com.filmmaniabe.filmmaniabe.Entity.Film;
import com.filmmaniabe.filmmaniabe.repository.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmService {
    private final FilmRepository filmRepository;
    public List<Film> getFilms(){
        return filmRepository.findAll();
    }
    public String addFilm(Film film){
        filmRepository.save(film);
        return "Başarılı";
    }
}
