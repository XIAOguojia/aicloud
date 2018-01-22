package com.liting.aicloud.core.db.bridge.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liting.aicloud.core.db.bridge.BridgeService;
import com.liting.aicloud.core.db.bridge.Response;
import com.liting.aicloud.core.db.bridge.dto.UserDTO;
import com.liting.aicloud.core.db.bridge.repository.UserRepository;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService implements BridgeService.Iface {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Response invoke(String groupId, String serviceId, String serviceArgs) throws TException {
        Response response = new Response();
        JSONObject args = JSON.parseObject(serviceArgs);
        if("User".equals(groupId) && "findById".equals(serviceId)){
            UserDTO userDTO = userRepository.findById(args.getLong("id"));
            response.setResponseCode("0");
            response.setResonseeMsg("success");
            response.setData(JSON.toJSONString(userDTO));
        }
        response.setResonseeMsg("fail");
        response.setResponseCode("1");
        return response;
    }
}
