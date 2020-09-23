package po4.donos.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import po4.donos.dao.DonoDao;
import po4.donos.model.Dono;

@Service
public class DonoService {
    
    private DonoDao donoDao;

    @Autowired
    public DonoService(@Qualifier("fakeDao") DonoDao donoDao) {
        this.donoDao = donoDao;
    }

    public int addDono(Dono dono) {
        return donoDao.insertDono(dono);
    }

    public List<Dono> getAllDono() {
        return donoDao.selectAllDono();
    }

    public Optional<Dono> getDonoById(UUID id) {
        return donoDao.selectDonoById(id);
    }

    public int deleteDono(UUID id) {
        return donoDao.deleteDonoById(id);
    }

    public int updateDono(UUID id, Dono newDono) {
        return donoDao.updateDonoById(id, newDono);
    }


}
