package com.liting.aicloud.core.db.bridge.repository.impl;

import com.liting.aicloud.core.db.bridge.dto.UserDTO;
import com.liting.aicloud.core.db.bridge.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserRepositoryImpl implements UserRepository{

    private ConcurrentHashMap<Long, UserDTO> userDTOCache = new ConcurrentHashMap<>();

    public UserRepositoryImpl() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        userDTO.setName("Liuyi");
        userDTOCache.put(userDTO.getId(), userDTO);
    }

    @Override
    public UserDTO findById(Long id) {
        return userDTOCache.get(id);
    }
}
