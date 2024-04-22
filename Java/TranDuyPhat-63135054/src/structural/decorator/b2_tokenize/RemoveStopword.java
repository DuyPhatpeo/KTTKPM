package structural.decorator.b2_tokenize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveStopword extends TokenDecorator{
    List<String> stopwords;
    public RemoveStopword(Tokenize token) {
        super(token);
        stopwords = new ArrayList<String>(Arrays.asList("thì", "mà", "là", "nhưng", "bị", "cái", "được", "và"));
    }

    @Override
    public List<String> tokenize() {
        List<String> result = tokens.tokenize();
        result.removeAll(stopwords);
        return result;
    }
}
