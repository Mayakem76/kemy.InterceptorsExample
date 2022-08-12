package kemy.dev.InterceptorsExample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*LegacyController that:
is mapped on legacy
returns This is just old code

 */
@RestController
@RequestMapping("/legacy")
public class LegacyController {
    @GetMapping("")
    public String getSentence(){
        return "This is just old code";
    }

}
