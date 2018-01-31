package spitter.service;

import org.springframework.stereotype.Service;
import spitter.dao.SpitterDao;
import spitter.model.Spitter;

import javax.transaction.Transactional;
import java.util.List;

@Service //TODO
public class SpitterServiceImpl implements SpitterService{

    private SpitterDao spitterDao;

    public void setSpitterDao(SpitterDao spitterDao) {
        this.spitterDao = spitterDao;
    }


    @Override
    @Transactional //TODO
    public void addSpitter(Spitter spitter) {
        this.spitterDao.addSpitter(spitter);
    }

    @Override
    @Transactional
    public void updateSpitter(Spitter spitter) {
        this.spitterDao.updateSpitter(spitter);
    }

    @Override
    @Transactional
    public void removeSpitter(int id) {
        this.spitterDao.removeSpitter(id);
    }

    @Override
    @Transactional
    public Spitter getSpitterById(int id) {
       return this.spitterDao.getSpitterById(id);
    }

    @Override
    public List<Spitter> listSpitters() {
        return this.spitterDao.listBooks();
    }


}
