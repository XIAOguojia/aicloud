package com.liting.aicloud.core.db.bridge.repository;

import com.liting.aicloud.core.db.bridge.dto.UserDTO;

public interface UserRepository {

    UserDTO findById(Long id);

}
