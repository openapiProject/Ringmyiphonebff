package com.openapisession.ringmyiphonebff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firebaseUserController implements FireBaseUserApi {

    @Autowired FireBaseService fireBaseService;

    @Override
    public ResponseEntity<User> getUser(@PathVariable("name") String name)
        throws Exception {
        return ResponseEntity.ok().body(fireBaseService.getUserDetails(name));
    }

}
