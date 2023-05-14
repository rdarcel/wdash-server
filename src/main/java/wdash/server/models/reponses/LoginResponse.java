package wdash.server.models.reponses;

public record LoginResponse (Boolean result, String message, String token){}