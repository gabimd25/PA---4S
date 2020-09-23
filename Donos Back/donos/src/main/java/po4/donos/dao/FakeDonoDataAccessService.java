package po4.donos.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import po4.donos.model.Dono;

@Repository("fakeDao")
public class FakeDonoDataAccessService implements DonoDao {

    private static List<Dono> DB = new ArrayList<>();

    @Override
    public int insertDono(UUID id, Dono dono) {
        DB.add(new Dono(id, dono.getNome(), dono.getTelefone(), dono.getEmail(), dono.getRg()));
        return 1;
    }

    @Override
    public List<Dono> selectAllDono() {
        return DB;
    }

    @Override
    public Optional<Dono> selectDonoById(UUID id) {
        return DB.stream()
                .filter(dono -> dono.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteDonoById(UUID id) {
        Optional<Dono> donoMaybe = selectDonoById(id);
        if(donoMaybe.isEmpty()) {
            return 0;
        }
        DB.remove(donoMaybe.get());
        return 1;
    }

    @Override
    public int updateDonoById(UUID id, Dono update) {
        return selectDonoById(id)
                .map(dono -> {
                    int indexOfDonoToUpdate = DB.indexOf(dono);
                    if(indexOfDonoToUpdate >= 0) {
                        DB.set(indexOfDonoToUpdate, new Dono(id, update.getNome(), update.getTelefone(), update.getEmail(), update.getRg()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }
    
    
}
