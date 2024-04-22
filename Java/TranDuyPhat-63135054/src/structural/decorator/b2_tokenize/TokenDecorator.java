package structural.decorator.b2_tokenize;

import java.util.List;

public abstract class TokenDecorator implements Tokenize{
    Tokenize tokens;

    public TokenDecorator(Tokenize tokens) {
        this.tokens = tokens;
    }

}
