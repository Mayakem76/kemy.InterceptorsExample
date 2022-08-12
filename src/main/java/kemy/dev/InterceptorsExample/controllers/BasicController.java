package kemy.dev.InterceptorsExample.controllers;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.time.LocalDateTime;

/*
write a Spring Boot application with the necessary dependencies that:
has 2 controllers:
BasicController that:
is mapped on time
returns the current date/time
LegacyController that:
is mapped on legacy
returns This is just old code
has 2 interceptors/middleware:
APILoggingInterceptor that prints in the console the requests header User-Agent, before handling them
LegacyIntercepotr that:
blocks the API calls to the legacy endpoint
returns a response with the right HTTP code status for Gone
test the 2 API endpoint calls using Postman
*/
@RestController
@RequestMapping("/time")
public class BasicController {

    @GetMapping("")
    public String getDateTime(){
        return "Current Date/Time: "+ LocalDateTime.now();
    }

}
