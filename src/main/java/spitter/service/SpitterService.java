package spitter.service;

import spitter.model.Spitter;

import java.util.List;

public interface SpitterService {

   void addSpitter(Spitter spitter);
   void updateSpitter(Spitter spitter);
   void removeSpitter(int id);
   Spitter getSpitterById(int id);
   List<Spitter> listSpitters();


}
