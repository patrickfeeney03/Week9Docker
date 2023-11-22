package ie.atu.week9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
public class MyController {
    @GetMapping("/point")
    public String respondToPoint() {
        return "Hello";
    }
}
