package po4.donos.api;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import po4.donos.model.Dono;
import po4.donos.service.DonoService;

@RequestMapping("dono")
@RestController
public class DonoController {
    
    private DonoService donoService;

    @Autowired
    public DonoController(DonoService donoService) {
        this.donoService = donoService;
    }

    @PostMapping
    public void addDono(@RequestBody Dono dono) {
        donoService.addDono(dono);
    }

    @GetMapping
    public List<Dono> getAllDono() {
        return donoService.getAllDono();
    }

    @GetMapping(path = "{id}")
    public Dono getDonoById(@PathVariable("id") UUID id) {
        return donoService.getDonoById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteDonoById(@PathVariable("id") UUID id) {
        donoService.deleteDono(id);
    }

    @PutMapping( path = "{id}")
    public void updateDono(@PathVariable("id") UUID id, @RequestBody Dono donoToUpdate) {
        donoService.updateDono(id, donoToUpdate);
    }
}
