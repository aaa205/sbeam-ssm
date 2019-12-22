package com.dto;

import javax.validation.constraints.*;

/**
 * 注册表单对应DTO
 */
public class UserRegisterDTO {
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$")
    private String email;
    @NotBlank
    @Size(min = 2, max = 8)
    private String name;
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9]{3,30}$")
    private String password;
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9]{3,30}$")
    private String repeat_password;
    @NotBlank
    private String verifyCode;

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeat_password() {
        return repeat_password;
    }

    public void setRepeat_password(String repeat_password) {
        this.repeat_password = repeat_password;
    }
}
