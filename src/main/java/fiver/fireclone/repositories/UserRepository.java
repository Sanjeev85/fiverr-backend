package fiver.fireclone.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import fiver.fireclone.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);

    User findByEmail(String email);
}
