package com.fluffy.universe.models;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private final User testUser = new User();

    @org.junit.jupiter.api.Test
    void setId() {
        testUser.setId(1);
        assertEquals(1, testUser.getId());
    }

    @org.junit.jupiter.api.Test
    void getId() {
        testUser.setId(5);
        assertEquals(5, testUser.getId());
    }

    @org.junit.jupiter.api.Test
    void getRoleId() {
        testUser.setRoleId(5);
        assertEquals(5, testUser.getRoleId());
    }

    @org.junit.jupiter.api.Test
    void setRoleId() {
        testUser.setRoleId(8);
        assertEquals(8, testUser.getRoleId());
    }

    @org.junit.jupiter.api.Test
    void getFirstName() {
        testUser.setFirstName("NikolaAs");
        assertEquals("NikolaAs", testUser.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        testUser.setFirstName("Nikolas");
        assertEquals("Nikolas", testUser.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        testUser.setLastName("AbcD");
        assertEquals("AbcD", testUser.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        testUser.setLastName("FFF");
        assertEquals("FFF", testUser.getLastName());
    }

    @org.junit.jupiter.api.Test
    void getGender() {
        testUser.setGender("M");
        assertEquals("M", testUser.getGender());
    }

    @org.junit.jupiter.api.Test
    void setGender() {
        testUser.setGender("F");
        assertEquals("F", testUser.getGender());
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        testUser.setEmail("testuser@gail.com");
        assertEquals("testuser@gail.com", testUser.getEmail());
    }

    @org.junit.jupiter.api.Test
    void setEmail() {
        testUser.setEmail("testuser@gmail.com");
        assertEquals("testuser@gmail.com", testUser.getEmail());
    }

    @org.junit.jupiter.api.Test
    void getPassword() {
        testUser.setPassword("test321");
        assertEquals("test321", testUser.getPassword());
    }

    @org.junit.jupiter.api.Test
    void setPassword() {
        testUser.setPassword("test123");
        assertEquals("test123", testUser.getPassword());
    }

    @org.junit.jupiter.api.Test
    void getBirthday() {
        testUser.setBirthday("2000-02-08");
        assertEquals("2000-02-08", testUser.getBirthday());
    }

    @org.junit.jupiter.api.Test
    void setBirthday() {
        testUser.setBirthday("2000-02-07");
        assertEquals("2000-02-07", testUser.getBirthday());
    }

    @org.junit.jupiter.api.Test
    void getAddress() {
        testUser.setAddress("22 gfs");
        assertEquals("22 gfs", testUser.getAddress());
    }

    @org.junit.jupiter.api.Test
    void setAddress() {
        testUser.setAddress("22 gfs");
        assertEquals("22 gfs", testUser.getAddress());
    }

    @org.junit.jupiter.api.Test
    void getWebsite() {
        testUser.setWebsite("1@@.com");
        assertEquals("1@@.com", testUser.getWebsite());
    }

    @org.junit.jupiter.api.Test
    void setWebsite() {
        testUser.setWebsite("@.com");
        assertEquals("@.com", testUser.getWebsite());
    }

    @org.junit.jupiter.api.Test
    void getResetPasswordToken() {
        testUser.setResetPasswordToken("1@@.coms");
        assertEquals("1@@.coms", testUser.getResetPasswordToken());
    }

    @org.junit.jupiter.api.Test
    void setResetPasswordToken() {
        testUser.setResetPasswordToken("fghjk");
        assertEquals("fghjk", testUser.getResetPasswordToken());
    }
}