/*
 * This class is auto generated by https://github.com/hauner/openapi-generatr-spring.
 * DO NOT EDIT.
 */

package generated.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface EndpointApi {

    @GetMapping(path = "/endpoint-object")
    ResponseEntity<Void> getEndpointObject(@RequestParam Props props);

    @GetMapping(path = "/endpoint-map")
    ResponseEntity<Void> getEndpointMap(@RequestParam(name = "props") Map props);

}