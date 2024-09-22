package com.estore.E_Store.Repository;

import com.estore.E_Store.Models.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends MongoRepository<UserModel, UUID> {

}
