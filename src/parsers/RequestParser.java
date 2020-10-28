package parsers;

import exceptions.InvalidRequestParserException;
import validators.RequestParserValidator;

public class RequestParser {
    private String content;

    public RequestParser(String msg)
    {
        this.content = msg;
    }
    public String getResource(String content) throws InvalidRequestParserException
    {
        if(!RequestParserValidator.validate(this.content))
        {
            throw new InvalidRequestParserException();
        }

        return null;

    }
}
