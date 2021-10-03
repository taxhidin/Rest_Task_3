package com.example.rest_task_2;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class RestEasyServices extends Application {


    private Set< Object > singletons = new HashSet< Object >();

    public RestEasyServices() {
        singletons.add(new UserResource());
    }

    @Override
    public Set < Object > getSingletons() {
        return singletons;
    }


}


