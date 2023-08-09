package fiver.fireclone.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import fiver.fireclone.models.Token;

public interface TokenRepository extends MongoRepository<Token, Integer> {

    @Query("{ 'user.$id': ?0, $or: [ { 'expired': false }, { 'revoked': false } ] }")
    List<Token> findAllValidTokenByUser(String userId);

    Optional<Token> findByToken(String token);
}
