package com.faforever.client.login;

public class NoFallbackRedirectUriException extends RuntimeException {
  public NoFallbackRedirectUriException() {
    super("No fallback redirect URI has been specified");
  }
}
