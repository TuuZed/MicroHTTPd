package io.github.tuuzed.microhttpd.exception;

public class URIRegexException extends RuntimeException {
    public URIRegexException(String uriRegex) {
        super("uriRegex '" + uriRegex + "' Non conformity,UriRegex needs to start '^/'!");
    }
}