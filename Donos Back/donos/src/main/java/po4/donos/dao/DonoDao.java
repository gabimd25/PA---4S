package po4.donos.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import po4.donos.model.Dono;

public interface DonoDao {
    
    int insertDono(UUID id, Dono dono);

    default int insertDono(Dono dono){
        UUID id = UUID.randomUUID();
        return insertDono(id, dono);
    }

    List<Dono> selectAllDono();

    Optional<Dono> selectDonoById(UUID id);

    int deleteDonoById(UUID id);

    int updateDonoById(UUID id, Dono dono);

}
