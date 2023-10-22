package dio.ProjetoBancoDeQuestoes.BancoQuestoes.repository;

import dio.ProjetoBancoDeQuestoes.BancoQuestoes.model.Questao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestaoRepository extends JpaRepository<Questao, Long> {
}
