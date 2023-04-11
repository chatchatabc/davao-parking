package com.chatchatabc.parking.domain.repository;

import com.chatchatabc.parking.DomainBaseTest;
import com.chatchatabc.parking.domain.model.User;
import com.github.database.rider.core.api.dataset.DataSet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataSet(value = "db/datasets/dataset.xml")
public class UserRepositoryTest extends DomainBaseTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindById() {
        final Optional<User> user = userRepository.findById(1L);
        assertThat(user).isPresent();
    }
}
