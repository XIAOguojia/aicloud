namespace java com.liting.aicloud.core.db.bridge

struct Response {
  1: string responseCode
  2: string resonseeMsg
  3: string data
}

enum ResponseCode {
  SUCCESS = 0
}

service BridgeService {
    Response invoke(1: string groupId, 2: string serviceId, 3: string serviceArgs);
}