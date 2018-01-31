package spitter.dao;

import spitter.model.Spitter;

import java.util.List;

public interface SpitterDao {

    void addSpitter(Spitter spitter);
    void updateSpitter(Spitter spitter);
    void removeSpitter(int id);
    Spitter getSpitterById(int id);
    List<Spitter> listBooks();


}
