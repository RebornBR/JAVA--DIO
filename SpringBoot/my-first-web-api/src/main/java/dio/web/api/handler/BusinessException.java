package dio.web.api.handler;
// classe onde iremos concentrar todas as execeções de negócios
public class BusinessException extends  RuntimeException{
    public BusinessException(String mensagem) { // retorna uma mensagem simples
        super(mensagem);
    }
    public BusinessException(String mensagem, Object ... params) { // retorna uma mensagem customizada atraves do varargs
        super(String.format(mensagem, params));
    }
}
