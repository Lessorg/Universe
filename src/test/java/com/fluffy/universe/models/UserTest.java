package com.fluffy.universe.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    public void testGettersAndSetters() {
        // Arrange
        User user = new User();

        Integer id = 1;
        Integer roleId = 2;
        String firstName = "John";
        String lastName = "Doe";
        String gender = "Male";
        String email = "john.doe@example.com";
        String password = "password";
        String birthday = "1990-01-01";
        String address = "123 Main St";
        String website = "www.example.com";
        String resetPasswordToken = "token";

        // Act
        user.setId(id);
        user.setRoleId(roleId);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setGender(gender);
        user.setEmail(email);
        user.setPassword(password);
        user.setBirthday(birthday);
        user.setAddress(address);
        user.setWebsite(website);
        user.setResetPasswordToken(resetPasswordToken);

        // Assert
        Assertions.assertEquals(id, user.getId());
        Assertions.assertEquals(roleId, user.getRoleId());
        Assertions.assertEquals(firstName, user.getFirstName());
        Assertions.assertEquals(lastName, user.getLastName());
        Assertions.assertEquals(gender, user.getGender());
        Assertions.assertEquals(email, user.getEmail());
        Assertions.assertEquals(password, user.getPassword());
        Assertions.assertEquals(birthday, user.getBirthday());
        Assertions.assertEquals(address, user.getAddress());
        Assertions.assertEquals(website, user.getWebsite());
        Assertions.assertEquals(resetPasswordToken, user.getResetPasswordToken());
    }
}