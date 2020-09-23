package po4.donos.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import po4.donos.model.Dono;

public class DonoDataAccessService implements DonoDao {

    @Override
    public int insertDono(UUID id, Dono dono) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Dono> selectAllDono() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Dono> selectDonoById(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int deleteDonoById(UUID id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updateDonoById(UUID id, Dono dono) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
