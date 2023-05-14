package wdash.server.handlers;

import org.reactivestreams.Publisher;

import io.micronaut.http.HttpRequest;
import io.micronaut.security.authentication.AuthenticationProvider;
import io.micronaut.security.authentication.AuthenticationRequest;
import io.micronaut.security.authentication.AuthenticationResponse;
import reactor.core.publisher.Mono;

public class AuthenticationProviderHandler implements AuthenticationProvider{

    @Override
    public Publisher<AuthenticationResponse> authenticate(HttpRequest<?> httpRequest,
            AuthenticationRequest<?, ?> authenticationRequest) {
                return Mono.<AuthenticationResponse>create(emitter -> {
                    if (authenticationRequest.getIdentity().equals("user") && authenticationRequest.getSecret().equals("password")) {
                        emitter.success(AuthenticationResponse.success("user"));
                    } else {
                        emitter.error(AuthenticationResponse.exception());
                    }
                });
    }
    
}
