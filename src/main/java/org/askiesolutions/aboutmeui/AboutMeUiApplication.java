package org.askiesolutions.aboutmeui;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AboutMeUiApplication {
    static void main(String[] args) {
        SpringApplication.run(AboutMeUiApplication.class, args);
    }
}
