package com.fluffy.universe.controllers;

import com.fluffy.universe.models.User;
import com.fluffy.universe.utils.Configuration;
import com.fluffy.universe.utils.ServerData;
import com.fluffy.universe.utils.SessionUtils;
import io.javalin.Javalin;
import io.javalin.http.Context;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
class UserControllerTest {
    @Test
    public void updateAccountTest(){
        Configuration.load(new File("application.properties"));
        ServerData serverData = new ServerData();

        Javalin app = Mockito.mock(Javalin.class);
        UserController userController = new UserController(app);

        Context mockContext = Mockito.mock(Context.class);
        mockContext.sessionAttribute("serverData",serverData);

        SessionUtils sessUtils = Mockito.mock(SessionUtils.class);

        User user = new User();
        user.setId(2);
        user.setEmail("test@test.gmail");
        user.setFirstName("oldTestName");

        when(mockContext.formParam("_method")).thenReturn("PUT");
        when(mockContext.formParam("first-name")).thenReturn("testFirstName");
        when(mockContext.formParam("last-name")).thenReturn("testLastName");
        when(mockContext.formParam("gender")).thenReturn("male");
        when(mockContext.formParam("birthday")).thenReturn("2000-02-07");
        when(mockContext.formParam("address")).thenReturn("TestAddress");
        when(mockContext.formParam("website")).thenReturn("https://www.google.com/");
        when(sessUtils.getCurrentUser(mockContext)).thenReturn(user);
        when(sessUtils.getCurrentServerData(mockContext)).thenReturn(serverData);

        userController.updateAccount(mockContext);

        assertNotEquals("oldTestName",user.getFirstName());
        assertEquals("testFirstName",user.getFirstName());
        Mockito.inOrder(mockContext).verify(mockContext, VerificationModeFactory.calls(8)).formParam(Mockito.anyString());
        Mockito.inOrder(mockContext).verify(mockContext, VerificationModeFactory.calls(2)).sessionAttribute(Mockito.anyString());
        verify(mockContext).redirect("/account");
    }
}