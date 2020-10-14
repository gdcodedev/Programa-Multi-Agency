package projeto.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.entity.Subestacao;

@Repository
public interface SubestacaoRepository extends JpaRepository<Subestacao, Integer> {



}
