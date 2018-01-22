package com.liting.aicloud.core.db.bridge;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

public class Client {
    public static void main(String [] args) {

        TTransport transport = new TSocket("localhost", 9090);
        try {
            transport.open();
        } catch (TTransportException e) {
            e.printStackTrace();
        }

        TProtocol protocol = new TBinaryProtocol(transport);
        BridgeService.Client client = new BridgeService.Client(protocol);

        JSONObject invokeArgs = new JSONObject();
        invokeArgs.put("id", 1L);
        try {
            Response resp = client.invoke("User", "findById", invokeArgs.toJSONString());
            System.out.println("response: " + JSON.toJSONString(resp));
        } catch (TException e) {
            e.printStackTrace();
        }

        transport.close();
    }

}
