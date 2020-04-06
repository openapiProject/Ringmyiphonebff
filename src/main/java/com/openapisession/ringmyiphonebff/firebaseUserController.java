package com.openapisession.ringmyiphonebff;

import com.openapisession.ringmyiphonebffapi.api.GetuserApi;
import com.openapisession.ringmyiphonebffapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firebaseUserController implements GetuserApi {

    @Autowired FireBaseService fireBaseService;

    @Override
            public ResponseEntity<User> getuser( @PathVariable("userId") String userId,
                                         @RequestHeader(value="Accept-Version", required=false) String acceptVersion,
                                         @RequestHeader(value="X-B3-SpanId", required=false) String xB3SpanId,
                                        @RequestHeader(value="X-B3-TraceId", required=false) String xB3TraceId,
                                         @RequestHeader(value="Authorization", required=false) String authorization)
        throws Exception {
        return ResponseEntity.ok().body(fireBaseService.getUserDetails(userId));
    }

}
