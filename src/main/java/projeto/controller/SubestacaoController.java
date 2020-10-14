package projeto.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.controller.dto.SubestacaoBody;
import projeto.entity.Subestacao;
import projeto.servico.SubestacaoService;

import java.util.List;

@RestController
@Api(tags = "Subestacao")
@RequestMapping("/subestacao")
public class SubestacaoController {

    @Autowired
    private SubestacaoService subestacaoService;

    @GetMapping("/getall")
    public List<Subestacao> getAll() {
        return subestacaoService.getAll();
    }

    @PostMapping
    public void post(@RequestBody SubestacaoBody subestacao) {
        subestacaoService.include(subestacao);
    }

    @PatchMapping
    public void patch(@RequestBody SubestacaoBody subestacao) throws Exception {
        subestacaoService.update(subestacao);
    }

    @GetMapping("/{id}")
    public Subestacao get(@PathVariable Integer id) throws Exception {
        return subestacaoService.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) throws Exception {
        subestacaoService.delete(id);

    }


}
