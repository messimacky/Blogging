package com.mesay.Blogging.service.serviceInterface;

import com.mesay.Blogging.dto.request.LoginRequest;
import com.mesay.Blogging.dto.request.SignupRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface AuthService {
        ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest);
        ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest);
}
