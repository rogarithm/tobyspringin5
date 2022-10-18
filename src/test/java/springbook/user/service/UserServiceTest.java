package springbook.user.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:test-applicationContext.xml"})
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void bean() {
        Assertions.assertThat(this.userService).isNotNull();
    }
}
