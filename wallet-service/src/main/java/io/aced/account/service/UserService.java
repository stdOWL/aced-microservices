package io.aced.account.service;

import io.aced.account.common.exceptions.RecordNotFoundException;
import io.aced.account.entity.User;
import io.aced.account.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> findByUserID(Long userId) {
        return userRepository.findById(userId);
    }

}
