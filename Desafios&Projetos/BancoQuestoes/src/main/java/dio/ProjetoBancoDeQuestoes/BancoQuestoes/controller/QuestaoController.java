package dio.ProjetoBancoDeQuestoes.BancoQuestoes.controller;

import dio.ProjetoBancoDeQuestoes.BancoQuestoes.model.Questao;
import dio.ProjetoBancoDeQuestoes.BancoQuestoes.repository.QuestaoRepository;
import dio.ProjetoBancoDeQuestoes.BancoQuestoes.services.exceptions.CamposObrigatoriosException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bancoquestao")
public class QuestaoController {

    @Autowired
    private QuestaoRepository Qrepository;
    @PostMapping("/salvarquestao")
    public void salvarQuestao(@RequestBody Questao questao){
        Qrepository.save(questao);
        if(questao.getPergunta() == null){
            throw new CamposObrigatoriosException("pegunta");
        }

        if(questao.getResposta() == null){
            throw  new CamposObrigatoriosException("resposta");
        }
    }
}
