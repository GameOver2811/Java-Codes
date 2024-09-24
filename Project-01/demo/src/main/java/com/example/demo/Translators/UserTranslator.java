package com.example.demo.Translators;

import com.example.demo.DTO.UserRequest;
import com.example.demo.DTO.UserResponse;
import com.example.demo.Entities.UserEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Component
public class UserTranslator {

    private final ObjectMapper objectMapper;

    public UserTranslator(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public UserResponse entityToResponse(UserEntity user) {
        return objectMapper.convertValue(user, UserResponse.class);
    }

    public List<UserResponse> entityToResponse(List<UserEntity> users) {
        return users.stream()
                .map(user -> objectMapper.convertValue(user, UserResponse.class))
                .collect(Collectors.toList());
    }


    public UserEntity requestToEntity(UserRequest user) {
        return objectMapper.convertValue(user, UserEntity.class);
    }
}
