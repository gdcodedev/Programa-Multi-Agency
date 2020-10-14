package projeto.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.controller.dto.SubestacaoBody;
import projeto.entity.Subestacao;
import projeto.repo.SubestacaoRepository;

import java.util.List;

@Service
public class SubestacaoService {

    @Autowired
    SubestacaoRepository subestacaoRepository;

    public List<Subestacao> getAll() {
        return subestacaoRepository.findAll();
    }

    public void include(SubestacaoBody subestacaoPost) {

        Subestacao subestacao = new Subestacao();

        subestacao.setId(subestacaoPost.getId());
        subestacao.setNome(subestacaoPost.getNome());
        subestacao.setCodigo(subestacaoPost.getCodigo());
        subestacao.setLatitude(subestacaoPost.getLatitude());
        subestacao.setLongitude(subestacaoPost.getLongitude());

        subestacaoRepository.save(subestacao);
    }

    public void delete(Integer id) throws Exception {
        Subestacao subestacao = subestacaoRepository.findById(id).orElse(null);

        if(subestacao == null)
            throw new Exception("Subestação não encontrada");
        else
            subestacaoRepository.delete(subestacao);
    }

    public Subestacao get(Integer id) throws Exception {
        Subestacao subestacao = subestacaoRepository.findById(id).orElse(null);

        if(subestacao == null)
            throw new Exception("Subestação não encontrada");
        else
            return subestacao;
    }

    public void update(SubestacaoBody subestacaoPost) throws Exception {

        Subestacao subestacao = subestacaoRepository.findById(subestacaoPost.getId()).orElse(null);

        if(subestacao == null)
            throw new Exception("Subestação não encontrada");

        if(subestacaoPost.getNome() != null)
            subestacao.setNome(subestacaoPost.getNome());

        if(subestacaoPost.getCodigo() != null)
            subestacao.setCodigo(subestacaoPost.getCodigo());

        if(subestacaoPost.getLatitude() != null)
            subestacao.setLatitude(subestacaoPost.getLatitude());

        if(subestacaoPost.getLongitude() != null)
            subestacao.setLongitude(subestacaoPost.getLongitude());

        subestacaoRepository.save(subestacao);

    }

}
