package structural.decorator.b2_tokenize;

import java.util.List;

public class RemovePunc extends TokenDecorator{
    public RemovePunc(Tokenize token) {
        super(token);
    }

    @Override
    public List<String> tokenize() {
        List<String> list = tokens.tokenize();
        list.replaceAll(s -> {
            return s.replaceAll("\\p{Punct}","");
        });
        return list;
    }
}
