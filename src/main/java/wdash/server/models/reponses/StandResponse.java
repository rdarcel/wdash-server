package wdash.server.models.reponses;


/**
 * Standard response for an API request
 * @param   code    The http code
 * @param   message The human readable message
 */
public record StandResponse(int code, String message) { }
