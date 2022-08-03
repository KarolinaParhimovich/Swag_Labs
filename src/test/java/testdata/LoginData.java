package testdata;

import models.LoginModel;

public class LoginData {
    public static LoginModel getLogin1() {
        return LoginModel
                .builder()
                .username("standard_user")
                .password("secret_sauce")
                .build();
    }
    public static LoginModel getLogin2() {
        return LoginModel
                .builder()
                .username("locked_out_user")
                .password("secret_sauce")
                .build();
    }
    public static LoginModel getLogin3() {
        return LoginModel
                .builder()
                .username("problem_user")
                .password("secret_sauce")
                .build();
    }
    public static LoginModel getLogin4() {
        return LoginModel
                .builder()
                .username("performance_glitch_user")
                .password("secret_sauce")
                .build();
    }
}
