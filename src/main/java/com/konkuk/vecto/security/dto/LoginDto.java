package com.konkuk.vecto.security.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LoginDto {

    String userId;

    String userPw;

    String fcmToken;
}
