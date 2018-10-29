package com.github.philippheuer.credentialmanager.api;

import com.github.philippheuer.credentialmanager.identityprovider.OAuth2IdentityProvider;

import java.util.List;

/**
 * Authentication Controller
 */
public interface IAuthenticationController {

    /**
     * Starts the OAuth2Flow for the specified OAuth2 Identity Provider
     * <p>
     * Like the Authorization Code Grant Type, the Implicit Grant starts out by building a link and directing the user’s browser to that URL. At a high level, the flow has the following steps
     *  The application opens a browser to send the user to the OAuth server
     *  The user sees the authorization prompt and approves the app’s request
     *  The user is redirected back to the application with an access token in the URL fragment
     *
     * @param oAuth2IdentityProvider OAuth2 Identity Provider
     * @param redirectUrl Redirect url
     * @param scopes Requested scopes
     */
    void startOAuth2ImplicitGrantType(OAuth2IdentityProvider oAuth2IdentityProvider, String redirectUrl, List<Object> scopes);

}
